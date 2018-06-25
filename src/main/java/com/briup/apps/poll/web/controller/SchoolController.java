package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.School;
import com.briup.apps.poll.service.ISchollService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="学校相关接口")
@RestController
@RequestMapping("/school")
public class SchoolController {
@Autowired
private ISchollService schoolService;
@ApiOperation("查询所有学校信息")
@GetMapping("findAllSchool")
public List<School> findAlllSchool(){
	List<School> list=new ArrayList<>();
	try{
	list=schoolService.findAll();	
	}catch(Exception e){
		e.printStackTrace();
	}
	return list;
	
}
@ApiOperation("保存学校信息")
@PostMapping("saveSchool")
public String saveSchool(School school){
	try{
		schoolService.save(school);
	}catch(Exception e){
		e.printStackTrace();
		return "保存失败"+e.getMessage();
	}
	return "保存成功";
}
@ApiOperation("删除学校信息")
@GetMapping("deleteSchoolById")
public String deleteSchoolById(@RequestParam long id){
	//@Requestparam需要初始化默认值
	try{
		schoolService.deleteById(id);
		return "删除成功";
	}catch(Exception e){
		e.printStackTrace();
		return "删除失败"+e.getMessage();
	}
}
@ApiOperation("更新学校信息")
@PostMapping("updateSchool")
public String updateSchool(School school,@RequestParam long id){
	try{
		schoolService.update(school);
	}catch(Exception e){
		e.printStackTrace();
		return "删除失败"+e.getMessage();
	}
	return "删除成功";
}
}
