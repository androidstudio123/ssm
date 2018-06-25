package com.briup.apps.poll.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Answers;
import com.briup.apps.poll.dao.AnswersMapper;
import com.briup.apps.poll.service.IAnswersService;

@Service
public class AnswersServiceImpl implements IAnswersService{
	@Autowired
	private AnswersMapper answersMapper;
	@Override
	public List<Answers> findAll() throws Exception {
		// TODO Auto-generated method stub
		return answersMapper.findAll();
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		answersMapper.deleteById(id);
	}

	@Override
	public void save(Answers answers) throws Exception {
		// TODO Auto-generated method stub
		answersMapper.save(answers);
	}

	@Override
	public void update(Answers answers) throws Exception {
		// TODO Auto-generated method stub
		answersMapper.update(answers);
	}

}
