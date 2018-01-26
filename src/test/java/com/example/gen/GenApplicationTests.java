//package com.example.gen;
//
//import com.example.gen.entity.User;
//import com.example.gen.service.UserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class GenApplicationTests {
//
//	@Autowired
//	private UserService userService;
//
//	@Test
//	public void contextLoads() {
//		User user1  = userService.selectByPrimaryKey(10037);
//		System.out.println("==========================================================");
//		User user2  = userService.selectByPrimaryKey(10037);
//		System.out.println("==========================================================");
//		User user3  = userService.selectByPrimaryKey(1);
//		System.out.println("==========================================================");
//		User user4  = userService.selectByPrimaryKey(1);
//		System.out.println("==========================================================");
//		User user22  = userService.selectByPrimaryKey(10037);
//		System.out.println("==========================================================");
//		userService.deleteByPrimaryKey(10037);
//		System.out.println("==========================================================");
//		User user5  = userService.selectByPrimaryKey(1);
//		System.out.println("==========================================================");
//		User user44  = userService.selectByPrimaryKey(1);
//		System.out.println("==========================================================");
//		User user6  = userService.selectByPrimaryKey(10037);
//		System.out.println("==========================================================");
//		User user55  = userService.selectByPrimaryKey(10037);
//		System.out.println("==========================================================");
//		User user666  = userService.selectByPrimaryKey(1);
//	}
//
//	@Test
//	public void insert() {
//		User user = new User();
//		user.setName("aaa");
//		userService.insertSelective(user);
//	}
//
//}
