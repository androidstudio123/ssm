package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Question implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("题目编号")
private Long id;
private String name;
private String questiontype;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQuestiontype() {
	return questiontype;
}
public void setQuestiontype(String questiontype) {
	this.questiontype = questiontype;
}

}
