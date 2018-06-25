package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.service.IQuestionnaireService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="问卷相关接口")
@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
	@Autowired
	private IQuestionnaireService questionnaireService;
	@ApiOperation("查询所有问卷信息")
	@GetMapping("findAllQuestionnaire")
	public List<Questionnaire> findAllQuestionnaire(){
		List<Questionnaire> list=new ArrayList<>();
		try{
			list=questionnaireService.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}
	@ApiOperation(value="保存问卷信息",notes="无需输入id")
	@PostMapping("saveQuestionnaire")
	public String saveQuestionnaire(Questionnaire questionnaire){
		try{
			questionnaireService.save(questionnaire);
		}catch(Exception e){
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
		return "保存成功";
	}
	@ApiOperation("删除问卷信息")
	@GetMapping("deleteQuestionnaireById")
	public String deleteQuestionnaireById(@RequestParam long id){
		//@Requestparam需要初始化默认值
		try{
			questionnaireService.deleteById(id);
			return "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}

	@ApiOperation("更新问卷信息")
	@PostMapping("updateQuestionnaire")
	public String updateQuestion( Questionnaire questionnaire,@RequestParam long id){
		try{
			questionnaireService.update(questionnaire);
		}catch(Exception e){
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
		return "更新成功";
	}
}
