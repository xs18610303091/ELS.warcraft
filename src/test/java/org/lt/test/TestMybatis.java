package org.lt.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.cn.lt.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.lt.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  

public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	@Resource
	private UserService userService;

	
	@Test
	public void test1() {
		User user = userService.getUserById(1);
		logger.info(JSON.toJSONString(user));
	}

}
