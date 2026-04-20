/**
 * Student Management System - Object-Oriented Programming Example
 * This demonstrates OOP concepts: Classes, Inheritance, Encapsulation, and Polymorphism
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Base class representing a person
 */
class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

/**
 * Student class inheriting from Person
 */
class Student extends Person {
    private String studentId;
    private String major;
    private List<String> courses;
    
    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
        this.courses = new ArrayList<>();
    }
    
    public void enrollCourse(String courseName) {
        courses.add(courseName);
        System.out.println(name + " enrolled in " + courseName);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("Enrolled Courses: " + 
            (courses.isEmpty() ? "None" : String.join(", ", courses)));
    }
}

/**
 * Graduate Student class inheriting from Student
 */
class GraduateStudent extends Student {
    private String thesisTopic;
    
    public GraduateStudent(String name, int age, String studentId, 
                          String major, String thesisTopic) {
        super(name, age, studentId, major);
        this.thesisTopic = thesisTopic;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}
