package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.service.IClazzService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="班级相关接口")
@RestController
@RequestMapping("/clazz")
public class ClazzController {
@Autowired
private IClazzService clazzService;
@ApiOperation("查询所有班级信息")
@GetMapping("findAllClazz")
public List<Clazz> findAllClazz(){
	List<Clazz> list=new ArrayList<>();
	try{
		list=clazzService.findAll();
	}catch(Exception e){
		e.printStackTrace();
	}
	return list;
	
}
@ApiOperation(value="保存班级信息",notes="无需输入id")
@PostMapping("saveClazz")
public String saveClazz(Clazz clazz){
	try{
		clazzService.save(clazz);
	}catch(Exception e){
		e.printStackTrace();
		return "保存失败"+e.getMessage();
	}
	return "保存成功";
}
@ApiOperation("删除班级信息")
@GetMapping("deleteClazzById")
public String deleteClazzById(@RequestParam long id){
	//@Requestparam需要初始化默认值
	try{
		clazzService.deleteById(id);
		return "删除成功";
	}catch(Exception e){
		e.printStackTrace();
		return "删除失败"+e.getMessage();
	}
}

@ApiOperation("更新班级信息")
@PostMapping("updateClazz")
public String updateClazz( Clazz clazz,@RequestParam long id){
	try{
		clazzService.update(clazz);
	}catch(Exception e){
		e.printStackTrace();
		return "更新失败"+e.getMessage();
	}
	return "更新成功";
}
}
