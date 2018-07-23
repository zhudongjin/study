package com.hstypay.admin.controller.cms.base;

import com.hstypay.admin.controller.cms.base.dto.BaseMerchantDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.*;

/**
 * ClassName:RegisteMchUsersControllerUnitTest
 * Function: 后台测试
 * Date:     15点54分
 * @author   gold
 */
public class RegisteMchUsersControllerUnitTest {
	private String SERVER_URL = "http://localhost:8080/cms/base/registe_users";
	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void testadd() throws IOException{
		BaseMerchantDTO dto=new BaseMerchantDTO();


		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
		HttpEntity<BaseMerchantDTO> formEntity = new HttpEntity<BaseMerchantDTO>(dto, headers);
		String result = restTemplate.postForObject("http://localhost:8080/cms/base/registe_users", formEntity, String.class);
	}

}

