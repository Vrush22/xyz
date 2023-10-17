package com.springrest.springrest.Dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entities.Course;
public interface CourseDao extends JpaRepository<Course , Long> {

	List<Course> findAll();

	Course getOne(long courseId);

}
