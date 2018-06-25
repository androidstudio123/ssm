package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Qq;
import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.service.IQqService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="问题问卷相关接口")
@RestController
@RequestMapping("/qq")
public class QqController {
	@Autowired
	private IQqService qqService;
	@ApiOperation("查询所有问题问卷信息")
	@GetMapping("findAllQq")
	public List<Qq> findAllQq(){
		List<Qq> list=new ArrayList<>();
		try{
			list=qqService.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}
	@ApiOperation(value="保存问题问卷信息",notes="无需输入id")
	@PostMapping("saveQq")
	public String saveQq(Qq qq){
		try{
			qqService.save(qq);
		}catch(Exception e){
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
		return "保存成功";
	}
	@ApiOperation("删除问题问卷信息")
	@GetMapping("deleteQqById")
	public String deleteQqById(@RequestParam long id){
		//@Requestparam需要初始化默认值
		try{
			qqService.deleteById(id);
			return "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}

	@ApiOperation("更新问题问卷信息")
	@PostMapping("updateQq")
	public String updateQq( Qq qq,@RequestParam long id){
		try{
			qqService.update(qq);
		}catch(Exception e){
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
		return "更新成功";
	}
}
