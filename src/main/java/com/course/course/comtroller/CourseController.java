package com.course.course.comtroller;

import com.course.course.entities.Course;
import com.course.course.servises.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    // get all courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCours(@PathVariable String id){
        return this.courseService.getCourse(Long.parseLong(id));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
}
