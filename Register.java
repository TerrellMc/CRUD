package com.company;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import sun.awt.image.IntegerComponentRaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Register{
    CourseList courseList = new CourseList();
    ArrayList<String> coursesList = new ArrayList<>();

    public void start(){
       Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to Registar!!! ");
        System.out.println("----" + "Options" + "----");
        System.out.println( "\t"+ "add");
        System.out.println("\t" + "remove");
        System.out.println("\t" + "done");
        String respone = " ";

        while (!respone.equalsIgnoreCase("done")){
            System.out.println("make a choice");
            respone = scanner.nextLine();
            if(respone.equalsIgnoreCase("add")){
                addClass();
            }
            if(respone.equalsIgnoreCase("remove")){
               removeClass();
            }
            if(respone.equalsIgnoreCase("update")){
                updateClass();
            }
        }



    }

    public void addClass(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Class Prefix");
        String prefix = scanner.nextLine();
        System.out.print("Class Title");
        String title = scanner.nextLine();
      //  String format = ("["+ aClass.toUpperCase() + ": "+ titles + "]");
        Course course = new Course(prefix, title);
        courseList.addClasses(course);
    }

    public void removeClass(){
        printCourse();
        if(courseList.courseSize() == 0){
            System.out.println("No Courses in list Yet!! ");
        }else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("what class to remove");
            int remove = Integer.parseInt(scanner.nextLine());
            courseList.deleteClass(remove);
        }
    }

    public void updateClass(){
        printCourse();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Class To Update");
        int updateCourse = Integer.parseInt(scanner.nextLine());
        Course course = courseList.getCourse(updateCourse);
        System.out.println("New Prefix of Course");
        String newPrefix = scanner.nextLine();
        course.setPrefix(newPrefix);
        System.out.println("New Title!!");
        String newTitle = scanner.nextLine();
        course.setTitle(newTitle);
    }

    public  void printCourse(){
        for(int i = 0; i < courseList.courseSize(); i++){
            Course course = courseList.getCourse(i);
            System.out.print(i);
            System.out.printf("%s, %s%n", course.getPrefix(),course.getTitle());
        }
    }

}
