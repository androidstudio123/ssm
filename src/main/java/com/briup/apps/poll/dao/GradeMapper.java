package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Grade;

public interface GradeMapper {
List<Grade> findAll();
void deleteById(long id);
void save(Grade grade);
}
