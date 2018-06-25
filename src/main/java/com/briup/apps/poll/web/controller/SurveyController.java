package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Survey;
import com.briup.apps.poll.service.ISurveyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="调查相关接口")
@RestController
@RequestMapping("/survey")
public class SurveyController {
	@Autowired
	private ISurveyService surveyService;
	@ApiOperation("查询所有调查信息")
	@GetMapping("findAllSurvey")
	public List<Survey> findAllSurvey(){
		List<Survey> list=new ArrayList<>();
		try{
			list=surveyService.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}
	@ApiOperation(value="保存调查信息",notes="无需输入id")
	@PostMapping("saveSurvey")
	public String saveSurvey(Survey survey){
		try{
			surveyService.save(survey);
		}catch(Exception e){
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
		return "保存成功";
	}
	@ApiOperation("删除调查信息")
	@GetMapping("deleteSurveyById")
	public String deleteSurveyById(@RequestParam long id){
		//@Requestparam需要初始化默认值
		try{
			surveyService.deleteById(id);
			return "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}

	@ApiOperation("更新调查信息")
	@PostMapping("updateSurvey")
	public String updateSurvey( Survey survey,@RequestParam long id){
		try{
			surveyService.update(survey);
		}catch(Exception e){
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
		return "更新成功";
	}
}
