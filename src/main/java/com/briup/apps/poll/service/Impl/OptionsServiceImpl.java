package com.briup.apps.poll.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Options;
import com.briup.apps.poll.dao.OptionsMapper;
import com.briup.apps.poll.service.IOptionsService;

@Service
public class OptionsServiceImpl implements IOptionsService{
	@Autowired
	private OptionsMapper optionsMapper;

	@Override
	public List<Options> findAll() throws Exception {
		// TODO Auto-generated method stub
		return optionsMapper.findAll();
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		optionsMapper.deleteById(id);
	}

	@Override
	public void save(Options options) throws Exception {
		// TODO Auto-generated method stub
		optionsMapper.save(options);
	}

	@Override
	public void update(Options options) throws Exception {
		// TODO Auto-generated method stub
		optionsMapper.update(options);
	}
}
