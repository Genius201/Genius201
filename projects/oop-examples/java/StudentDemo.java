/**
 * Demo class to demonstrate the Student Management System
 * This class contains the main method to run the examples
 */
public class StudentDemo {
    public static void main(String[] args) {
        // Create a regular student
        Student student1 = new Student("Alice Johnson", 20, "S12345", "Computer Science");
        student1.enrollCourse("CIS361 - Object-Oriented Programming");
        student1.enrollCourse("CIS362 - Data Structures");
        
        System.out.println("\n--- Student Information ---");
        student1.displayInfo();
        
        // Create a graduate student
        GraduateStudent gradStudent = new GraduateStudent("Bob Smith", 24, "G67890", 
            "Computer Science", "Machine Learning Applications");
        gradStudent.enrollCourse("CIS501 - Advanced Algorithms");
        
        System.out.println("\n--- Graduate Student Information ---");
        gradStudent.displayInfo();
    }
}
