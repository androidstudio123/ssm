package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class School implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="学校编号")
private Long id;
private String name;
private String logopath;
private String telephone;
private String description;
private String address;
private String copyright;
public Long getId() {
	return id;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getCopyright() {
	return copyright;
}
public void setCopyright(String copyright) {
	this.copyright = copyright;
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
public String getLogopath() {
	return logopath;
}
public void setLogopath(String logopath) {
	this.logopath = logopath;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
