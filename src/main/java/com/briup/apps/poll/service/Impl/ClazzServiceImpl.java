package com.briup.apps.poll.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.dao.ClazzMapper;
import com.briup.apps.poll.service.IClazzService;
@Service
public class ClazzServiceImpl implements IClazzService{
@Autowired
private ClazzMapper clazzMapper;
	@Override
	public List<Clazz> findAll() throws Exception {
		// TODO Auto-generated method stub
		return clazzMapper.findAll();
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		clazzMapper.deleteById(id);
	}

	@Override
	public void save(Clazz clazz) throws Exception {
		// TODO Auto-generated method stub
		clazzMapper.save(clazz);
	}

	@Override
	public void update(Clazz clazz) throws Exception {
		// TODO Auto-generated method stub
		clazzMapper.update(clazz);
	}

}
