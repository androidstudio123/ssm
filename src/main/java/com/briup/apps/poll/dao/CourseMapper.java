package com.briup.apps.poll.dao;

import java.util.List;

/*import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;*/

import com.briup.apps.poll.bean.Course;
//定义一个接口标准，作为中间桥梁
public interface CourseMapper {
	
   List<Course> findAll();
	void deleteById(long id);
	void save(Course course);
  void update(Course course);
}
