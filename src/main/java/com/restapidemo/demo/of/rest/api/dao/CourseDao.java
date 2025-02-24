package com.restapidemo.demo.of.rest.api.dao;

import com.restapidemo.demo.of.rest.api.entities.Course;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {

}
