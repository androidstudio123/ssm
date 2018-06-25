package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.School;
import com.briup.apps.poll.bean.User;

public interface UserMapper {
List<User> findAll();
void deleteById(long id);
void save(User user);
void update(User user);
}
