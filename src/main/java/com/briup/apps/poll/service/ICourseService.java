package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Course;

public interface ICourseService {
 List<Course> findAll() throws Exception;
 void deleteById(long id) throws Exception;
void save(Course course) throws Exception;
//List<Course> find() throws Exception;
//void update(Course course) throws Exception;
}
