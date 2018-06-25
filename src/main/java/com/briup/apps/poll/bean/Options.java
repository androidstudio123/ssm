package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Options implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("题目选项编号")
private Long id;
private String lable;
private String name;
private int score;
private Long question_id;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getLable() {
	return lable;
}
public void setLable(String lable) {
	this.lable = lable;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public Long getQuestion_id() {
	return question_id;
}
public void setQuestion_id(Long question_id) {
	this.question_id = question_id;
}

}
