package com.briup.apps.poll.dao;

import java.util.List;

/*import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;*/

import com.briup.apps.poll.bean.Course;
//定义一个接口标准，作为中间桥梁
public interface CourseMapper {
	//注解和xml方式不能同时存在
	/*@Select("select * from poll_course")*/
   List<Course> findAll();
//@Delete("delete from poll_course where id = #{id}")
	void deleteById(long id);
//@Insert("insert into poll_course values(null,#{name},#{description},#{period})")
	void save(Course course);
	//@Select("select * from poll_course where id=#{id}")
	//List<Course> find();
//@Update("update poll_course set ")
//void update(Course course);
}
