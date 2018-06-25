package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Answers;

public interface AnswersMapper {
	List<Answers> findAll();
	void deleteById(long id);
	void save(Answers answers);
	void update(Answers answers);
}
