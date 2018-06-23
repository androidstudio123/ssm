package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.School;

public interface ISchollService {
List<School> findAll() throws Exception;
void deleteById(long id) throws Exception;
void save(School school) throws Exception;
}