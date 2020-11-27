package com.company;


import java.util.ArrayList;

public class Course {
     String prefix,title;
     private float credits;
     private boolean isRequiredForMajor;

    public Course (String prefix,String title){
        this.prefix = prefix;
        this.title = title;
    }

    String getPrefix(){
        return prefix;
    }

    public void setPrefix(String prefix){
        this.prefix = prefix;
    }

    String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}


