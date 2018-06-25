package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Question;

public interface IQuestionService {
	List<Question> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Question question) throws Exception;
	void update(Question question) throws Exception;
}
