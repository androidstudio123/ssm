package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Survey;

public interface SurveyMapper {
	List<Survey> findAll();
	void deleteById(long id);
	void save(Survey survey);
	void update(Survey survey);
}
