package com.example.demo.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	
	@Autowired
	
	private CourseRepository courseRepository;
	
	
	
	
	public Optional<Course> getAllCourses(String id) {
		return courseRepository.findById(id);
	}

	public Optional<Course> getCourse(String id) {
		
		return courseRepository.findById(id);
	}

	public void addCourse(Course t) {
		courseRepository.save(t);
	}

	public void updateCourse(String id, Course Course) {
		courseRepository.save(Course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
