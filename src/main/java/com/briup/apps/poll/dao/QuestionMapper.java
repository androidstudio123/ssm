package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Question;

public interface QuestionMapper {
	List<Question> findAll();
	void deleteById(long id);
	void save(Question question);
	void update(Question question);
}
