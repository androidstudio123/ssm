package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Options;
import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.service.IOptionsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="题目选项相关接口")
@RestController
@RequestMapping("/options")
public class OptionsController {
	@Autowired
	private IOptionsService optionsService;
	@ApiOperation("查询所有题目选项信息")
	@GetMapping("findAllOptions")
	public List<Options> findAllOptions(){
		List<Options> list=new ArrayList<>();
		try{
			list=optionsService.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}
	@ApiOperation(value="保存题目选项信息",notes="无需输入id")
	@PostMapping("saveOptions")
	public String saveOptions(Options options){
		try{
			optionsService.save(options);
		}catch(Exception e){
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
		return "保存成功";
	}
	@ApiOperation("删除题目选项信息")
	@GetMapping("deleteOptionsById")
	public String deleteOptionsById(@RequestParam long id){
		//@Requestparam需要初始化默认值
		try{
			optionsService.deleteById(id);
			return "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}

	@ApiOperation("更新题目选项信息")
	@PostMapping("updateOptions")
	public String updateOptions( Options options,@RequestParam long id){
		try{
			optionsService.update(options);
		}catch(Exception e){
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
		return "更新成功";
	}
}
