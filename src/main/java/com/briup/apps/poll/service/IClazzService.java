package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Clazz;

public interface IClazzService {
List<Clazz> findAll() throws Exception;
void deleteById(long id) throws Exception;
void save(Clazz clazz) throws Exception;
void update(Clazz clazz) throws Exception;
}
