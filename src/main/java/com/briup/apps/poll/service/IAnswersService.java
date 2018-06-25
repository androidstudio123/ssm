package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Answers;
import com.briup.apps.poll.bean.Clazz;

public interface IAnswersService {
	List<Answers> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Answers answers) throws Exception;
	void update(Answers answers) throws Exception;
}
