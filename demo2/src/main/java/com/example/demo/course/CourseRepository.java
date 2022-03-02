 package com.example.demo.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course, String> {

	List<Course> findByTopicId(String id);
	
	//
}
