package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.briup.apps.poll.bean.User;
import com.briup.apps.poll.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
private IUserService userService;
@ApiOperation("查询所有用户信息")
@GetMapping("findAllUser")
public List<User> findAllUser(){
	List<User> list=new ArrayList<>();
	try{
		list=userService.findAll();
	}catch(Exception e){
		e.printStackTrace();
	}
	return list;
}
@ApiOperation("保存用户信息")
@PostMapping("saveUser")
public String saveCourse(User user){
	try{
		userService.save(user);
	}catch(Exception e){
		e.printStackTrace();
		return "保存失败"+e.getMessage();
	}
	return "保存成功";
}
@ApiOperation("删除用户信息")
@GetMapping("deleteUserById")
public String deleteUserById(@RequestParam long id){
	//@Requestparam需要初始化默认值
	try{
		userService.deleteById(id);
		return "删除成功";
	}catch(Exception e){
		e.printStackTrace();
		return "删除失败"+e.getMessage();
	}
}
@ApiOperation("更新用户信息")
@PostMapping("updateUser")
public String updateUser(User user,@RequestParam long id){
	try{
		userService.update(user);
	}catch(Exception e){
		e.printStackTrace();
		return "删除失败"+e.getMessage();
	}
	return "删除成功";
}
}
