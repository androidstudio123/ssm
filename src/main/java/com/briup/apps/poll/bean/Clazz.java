package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Clazz implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="班级编号")
private Long id;
private String name;
private String description;
private Long grade_id;
private Long charge_id;
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
public Long getGrade_id() {
	return grade_id;
}
public void setGrade_id(Long grade_id) {
	this.grade_id = grade_id;
}
public Long getCharge_id() {
	return charge_id;
}
public void setCharge_id(Long charge_id) {
	this.charge_id = charge_id;
}

}
