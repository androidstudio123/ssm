package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Qq implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("问题问卷编号")
private Long id;
private Long questionnaire_id;
private Long question_id;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getQuestionnaire_id() {
	return questionnaire_id;
}
public void setQuestionnaire_id(Long questionnaire_id) {
	this.questionnaire_id = questionnaire_id;
}
public Long getQuestion_id() {
	return question_id;
}
public void setQuestion_id(Long question_id) {
	this.question_id = question_id;
}

}
