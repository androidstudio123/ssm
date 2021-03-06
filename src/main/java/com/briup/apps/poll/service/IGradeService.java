package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.bean.Grade;

public interface IGradeService {
List<Grade> findAll() throws Exception;
void deleteById(long id) throws Exception;
void save(Grade grade) throws Exception;
void update(Grade grade) throws Exception;
}
