package com.briup.apps.poll.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Qq;
import com.briup.apps.poll.dao.QqMapper;
import com.briup.apps.poll.service.IQqService;

@Service
public class QqServiceImpl implements IQqService{
	@Autowired
	private QqMapper qqMapper;

	@Override
	public List<Qq> findAll() throws Exception {
		// TODO Auto-generated method stub
		return qqMapper.findAll();
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		qqMapper.deleteById(id);
	}

	@Override
	public void save(Qq qq) throws Exception {
		// TODO Auto-generated method stub
		qqMapper.save(qq);
	}

	@Override
	public void update(Qq qq) throws Exception {
		// TODO Auto-generated method stub
		qqMapper.update(qq);
	}
}
