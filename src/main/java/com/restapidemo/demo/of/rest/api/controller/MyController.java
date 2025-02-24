package com.restapidemo.demo.of.rest.api.controller;

import com.restapidemo.demo.of.rest.api.entities.Course;
import com.restapidemo.demo.of.rest.api.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    // To find all courses
    @GetMapping("/courses")
    public List<Course> courses (){
        return this.courseService.getCourse();
    }

    // To find single course
    @GetMapping ("/courses/{courseId}")
    public Optional<Course> getCourse(@PathVariable long courseId){
        return this.courseService.getCourse(courseId);
    }

    // To add a course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    // To update a course
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    // To delete a course
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
