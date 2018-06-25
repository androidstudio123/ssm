package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Clazz;

public interface ClazzMapper {

	List<Clazz> findAll();
	void deleteById(long id);
	void save(Clazz clazz);
	void update(Clazz clazz);
}
