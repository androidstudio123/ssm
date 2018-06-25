package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Answers;
import com.briup.apps.poll.service.IAnswersService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="答题卡相关接口")
@RestController
@RequestMapping("/answers")
public class AnswersController {
	@Autowired
	private IAnswersService answersService;
	@ApiOperation("查询所有班级信息")
	@GetMapping("findAllClazz")
	public List<Answers> findAllAnswers(){
		List<Answers> list=new ArrayList<>();
		try{
			list=answersService.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}
	@ApiOperation(value="保存答题卡信息",notes="无需输入id")
	@PostMapping("saveAnswers")
	public String saveAnswers(Answers answers){
		try{
			answersService.save(answers);
		}catch(Exception e){
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
		return "保存成功";
	}
	@ApiOperation("删除答题卡信息")
	@GetMapping("deleteAnswersById")
	public String deleteAnswersById(@RequestParam long id){
		//@Requestparam需要初始化默认值
		try{
			answersService.deleteById(id);
			return "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}

	@ApiOperation("更新答题卡信息")
	@PostMapping("updateAnswers")
	public String updateAnswers( Answers answers,@RequestParam long id){
		try{
			answersService.update(answers);
		}catch(Exception e){
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
		return "更新成功";
	}
}
