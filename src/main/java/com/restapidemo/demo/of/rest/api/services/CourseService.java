package com.restapidemo.demo.of.rest.api.services;

import com.restapidemo.demo.of.rest.api.entities.Course;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public List<Course> getCourse();
    public Optional<Course> getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long parseLong);
}
