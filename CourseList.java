package com.company;

import java.util.ArrayList;

public class CourseList {
    ArrayList<Course> courseList = new ArrayList<>();


    public void deleteClass(int index){
        this.courseList.remove(index);
    }

    public void addClasses(Course addCourse){
        courseList.add(addCourse);
    }

    public int courseSize(){
       return courseList.size();
    }

    public Course getCourse(int index){
        return courseList.get(index);
    }


}
