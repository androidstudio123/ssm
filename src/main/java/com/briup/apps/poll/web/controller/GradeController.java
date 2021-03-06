package com.briup.apps.poll.web.controller;

import java.util.ArrayList;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.service.IGradeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="年级相关接口")
@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired
	private IGradeService gradeService;
	@ApiOperation("查询所有年级")
	@GetMapping("findAllGrade")
	public List<Grade> findAllCourse(){
		List<Grade> list=new ArrayList<>();
		try{
			list=gradeService.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@ApiOperation("保存年级信息")
	@PostMapping("saveGrade")
	public String saveCourse(Grade grade){
		try{
			gradeService.save(grade);
		}catch(Exception e){
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
		return "保存成功";
	}
@ApiOperation("删除年级信息")
	@GetMapping("deleteGradeById")
	public String deleteGradeById(@RequestParam long id){
		//@Requestparam需要初始化默认值
		try{
			gradeService.deleteById(id);
			return "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}

@ApiOperation("更新年级信息")
	@PostMapping("updateGrade")
	public String updateGrade( Grade grade,@RequestParam long id){
		try{
			gradeService.update(grade);
		}catch(Exception e){
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
		return "更新成功";
	}
}
