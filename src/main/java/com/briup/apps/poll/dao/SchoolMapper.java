package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.School;

public interface SchoolMapper {
List<School> findAll();
void deleteById(long id);
void save(School school);
}
