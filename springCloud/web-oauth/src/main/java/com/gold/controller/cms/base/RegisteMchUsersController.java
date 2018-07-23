package com.gold.controller.cms.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.*;

/**
 * ClassName:RegisteMchUsersControllerUnitTest
 * Function: 后台测试
 * Date:     15点54分
 * @author   gold
 */
@RestController
@RequestMapping("/registeMchUsers")
public class RegisteMchUsersController {
	private String SERVER_URL = "http://localhost:8080/cms/base/registe_users/";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value="/add", method= RequestMethod.GET)
	public void add(){

	}

}

