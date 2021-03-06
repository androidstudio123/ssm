package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Grade implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="年级编号")
private Long id;
private String name;
private String description;
private Long scholl_id;
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
public Long getScholl_id() {
	return scholl_id;
}
public void setScholl_id(Long scholl_id) {
	this.scholl_id = scholl_id;
}

}
