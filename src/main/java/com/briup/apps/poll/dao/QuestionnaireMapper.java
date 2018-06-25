package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Questionnaire;

public interface QuestionnaireMapper {
	List<Questionnaire> findAll();
	void deleteById(long id);
	void save(Questionnaire questionnaire);
	void update(Questionnaire questionnaire);
}
