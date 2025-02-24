package com.restapidemo.demo.of.rest.api.services;

import com.restapidemo.demo.of.rest.api.dao.CourseDao;
import com.restapidemo.demo.of.rest.api.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl() {
    }

    @Override
    public List<Course> getCourse() {
        return courseDao.findAll();
    }

    @Override
    public Optional<Course> getCourse(long courseId) {
        return courseDao.findById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        Course entity = courseDao.getReferenceById(parseLong);
        courseDao.delete(entity);
    }
}
