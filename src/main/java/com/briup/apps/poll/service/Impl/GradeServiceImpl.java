package com.briup.apps.poll.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.dao.GradeMapper;
import com.briup.apps.poll.service.IGradeService;

@Service
public class GradeServiceImpl implements IGradeService{
@Autowired
private GradeMapper gradeMapper;
	@Override
	public List<Grade> findAll() throws Exception {
		// TODO Auto-generated method stub
		return gradeMapper.findAll();
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		gradeMapper.deleteById(id);
	}

	@Override
	public void save(Grade grade) throws Exception {
		// TODO Auto-generated method stub
		gradeMapper.save(grade);
	}

}
