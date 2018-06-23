package com.briup.apps.poll.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.School;
import com.briup.apps.poll.dao.SchoolMapper;
import com.briup.apps.poll.service.ISchollService;
@Service
public class SchoolServiceImpl implements ISchollService{
@Autowired
private SchoolMapper schoolMapper;
	
	@Override
	public List<School> findAll() throws Exception {
		// TODO Auto-generated method stub
		return schoolMapper.findAll();
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		schoolMapper.deleteById(id);
	}

	@Override
	public void save(School school) throws Exception {
		// TODO Auto-generated method stub
		schoolMapper.save(school);
	}
}
