package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Questionnaire implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("问卷编号")
private Long id;
private String name;
private String description;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
