package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.service.IQuestionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="题目相关接口")
@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private IQuestionService questionService;
	@ApiOperation("查询所有题目信息")
	@GetMapping("findAllQuestion")
	public List<Question> findAllQuestion(){
		List<Question> list=new ArrayList<>();
		try{
			list=questionService.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}
	@ApiOperation(value="保存题目信息",notes="无需输入id")
	@PostMapping("saveQuestion")
	public String saveQuestion(Question question){
		try{
			questionService.save(question);
		}catch(Exception e){
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
		return "保存成功";
	}
	@ApiOperation("删除题目信息")
	@GetMapping("deleteQuestionById")
	public String deleteQuestionById(@RequestParam long id){
		//@Requestparam需要初始化默认值
		try{
			questionService.deleteById(id);
			return "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}

	@ApiOperation("更新题目信息")
	@PostMapping("updateQuestion")
	public String updateQuestion( Question question,@RequestParam long id){
		try{
			questionService.update(question);
		}catch(Exception e){
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
		return "更新成功";
	}
}
