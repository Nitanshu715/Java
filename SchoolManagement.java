// Abstract superclass: Person
abstract class Person {
    // Abstract method to be overridden by subclasses
    abstract void performDuty();
}

// Subclass: Student
class Student extends Person {
    @Override
    void performDuty() {
        System.out.println("Student is studying for exams.");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    @Override
    void performDuty() {
        System.out.println("Teacher is conducting a lecture.");
    }
}

// Main class to demonstrate runtime polymorphism
public class SchoolManagement {
    public static void main(String[] args) {
        // Creating an array of Person references
        Person[] people = new Person[4];

        // Filling the array with Student and Teacher instances
        people[0] = new Student();
        people[1] = new Teacher();
        people[2] = new Student();
        people[3] = new Teacher();

        // Iterating through the array and calling performDuty()
        for (Person p : people) {
            p.performDuty(); // Runtime polymorphism in action
        }
    }
}
