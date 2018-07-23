package com.gold.controller.cms.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSetMetaData;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

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
	private RedisTemplate<String, ?> redisTemplate;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/users")
	public String users(){
		// 使用商户号做hashKey
		BoundHashOperations<String, String, Long> hashOperations = redisTemplate.boundHashOps("key1");
		hashOperations.expire(1, TimeUnit.SECONDS);
		System.out.println("yyyyyyyyyyy");
		return null;
	}

	@RequestMapping("/generate")
	public String generate(String sql){
		SqlRowSet rowSet=jdbcTemplate.queryForRowSet(sql);
		SqlRowSetMetaData metadate=rowSet.getMetaData();
		for (int i = 0; i <metadate.getColumnCount() ; i++) {
			System.out.println(metadate.getColumnTypeName(i));

		}

		return null;
	}



}

