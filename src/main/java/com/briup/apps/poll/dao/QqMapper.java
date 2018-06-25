package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Qq;

public interface QqMapper {
	List<Qq> findAll();
	void deleteById(long id);
	void save(Qq qq);
	void update(Qq qq);
}
