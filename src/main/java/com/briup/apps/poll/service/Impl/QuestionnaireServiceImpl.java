package com.briup.apps.poll.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.dao.QuestionnaireMapper;
import com.briup.apps.poll.service.IQuestionnaireService;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService{
	@Autowired
	private QuestionnaireMapper questionnaireMapper;

	@Override
	public List<Questionnaire> findAll() throws Exception {
		// TODO Auto-generated method stub
		return questionnaireMapper.findAll();
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		questionnaireMapper.deleteById(id);
	}

	@Override
	public void save(Questionnaire questionnaire) throws Exception {
		// TODO Auto-generated method stub
		questionnaireMapper.save(questionnaire);
	}

	@Override
	public void update(Questionnaire questionnaire) throws Exception {
		// TODO Auto-generated method stub
		questionnaireMapper.update(questionnaire);
	}
}
