package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Options;

public interface OptionsMapper {
	List<Options> findAll();
	void deleteById(long id);
	void save(Options options);
	void update(Options options);
}
