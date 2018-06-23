package com.briup.apps.poll.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.dao.CourseMapper;
import com.briup.apps.poll.service.ICourseService;

@Service
//如果一个类带了@Service，将自动注册到spring容器，不在需要在application.xml文件定义bean
public  class CourseServiceImpl  implements ICourseService{
@Autowired
//通过byType形式，用于给指定的字段或方法注入所需要的外部资源
private CourseMapper courseMapper;

	public List<Course> findAll() throws Exception {
		return courseMapper.findAll();
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		courseMapper.deleteById(id);
	}

	
	@Override
		public void save(Course course) throws Exception {
			// TODO Auto-generated method stub
			courseMapper.save(course);
		}
}
/*
	@Override
	public void update(Course course) throws Exception {
		// TODO Auto-generated method stub
		courseMapper.update(course);
	}*/

	/*@Override
	public List<Course> find() throws Exception {
		// TODO Auto-generated method stub
		return courseMapper.find();
	}*/
