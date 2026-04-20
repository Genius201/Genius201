"""
Student Management System - Object-Oriented Programming Example
This module demonstrates OOP concepts: Classes, Inheritance, Encapsulation, and Polymorphism
"""

class Person:
    """Base class representing a person"""
    
    def __init__(self, name, age):
        self._name = name  # Protected attribute
        self._age = age
    
    def get_name(self):
        """Getter for name"""
        return self._name
    
    def get_age(self):
        """Getter for age"""
        return self._age
    
    def display_info(self):
        """Display person information"""
        print(f"Name: {self._name}, Age: {self._age}")


class Student(Person):
    """Student class inheriting from Person"""
    
    def __init__(self, name, age, student_id, major):
        super().__init__(name, age)
        self._student_id = student_id
        self._major = major
        self._courses = []
    
    def enroll_course(self, course_name):
        """Add a course to the student's enrolled courses"""
        self._courses.append(course_name)
        print(f"{self._name} enrolled in {course_name}")
    
    def display_info(self):
        """Override display_info to show student-specific information"""
        super().display_info()
        print(f"Student ID: {self._student_id}")
        print(f"Major: {self._major}")
        print(f"Enrolled Courses: {', '.join(self._courses) if self._courses else 'None'}")


class GraduateStudent(Student):
    """Graduate Student class inheriting from Student"""
    
    def __init__(self, name, age, student_id, major, thesis_topic):
        super().__init__(name, age, student_id, major)
        self._thesis_topic = thesis_topic
    
    def display_info(self):
        """Override to show graduate student information"""
        super().display_info()
        print(f"Thesis Topic: {self._thesis_topic}")


# Example usage
if __name__ == "__main__":
    # Create a regular student
    student1 = Student("Alice Johnson", 20, "S12345", "Computer Science")
    student1.enroll_course("CIS361 - Object-Oriented Programming")
    student1.enroll_course("CIS362 - Data Structures")
    
    print("\n--- Student Information ---")
    student1.display_info()
    
    # Create a graduate student
    grad_student = GraduateStudent("Bob Smith", 24, "G67890", "Computer Science", 
                                   "Machine Learning Applications")
    grad_student.enroll_course("CIS501 - Advanced Algorithms")
    
    print("\n--- Graduate Student Information ---")
    grad_student.display_info()
