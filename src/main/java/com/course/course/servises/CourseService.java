package com.course.course.servises;

import com.course.course.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getAllCourses();
    public Course getCourse(long id);
    public Course addCourse(Course course);
}
