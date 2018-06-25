package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Survey implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("调查编号")
private Long id;
private String status;
private int code;
private String surveyDate;
private Long course_id;
private Long clazz_id;
private Long user_id;
private Long questionnaire_id;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getSurveyDate() {
	return surveyDate;
}
public void setSurveyDate(String surveyDate) {
	this.surveyDate = surveyDate;
}
public Long getCourse_id() {
	return course_id;
}
public void setCourse_id(Long course_id) {
	this.course_id = course_id;
}
public Long getClazz_id() {
	return clazz_id;
}
public void setClazz_id(Long clazz_id) {
	this.clazz_id = clazz_id;
}
public Long getUser_id() {
	return user_id;
}
public void setUser_id(Long user_id) {
	this.user_id = user_id;
}
public Long getQuestionnaire_id() {
	return questionnaire_id;
}
public void setQuestionnaire_id(Long questionnaire_id) {
	this.questionnaire_id = questionnaire_id;
}

}
