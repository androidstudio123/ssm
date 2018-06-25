package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Survey;

public interface ISurveyService {
	List<Survey> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Survey survey) throws Exception;
	void update(Survey survey) throws Exception;
}
