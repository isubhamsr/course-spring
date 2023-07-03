package com.course.course.servises;

import com.course.course.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> courses;

    public CourseServiceImpl() {
        courses = new ArrayList<>();
        courses.add(new Course(12,"Java", "Good sourse"));
        courses.add(new Course(123,"Python", "Good sourse"));
        courses.add(new Course(142,"C", "Good sourse"));
        courses.add(new Course(123,"C++", "Good sourse"));
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public Course getCourse(long id) {
        Course c = null;
        for(Course course:courses){
            if(course.getId() == id){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
//        courses.add(new Course(course.getId(), course.getTitle(), course.getDescription()));
        courses.add(course);
        return course;
    }
}
