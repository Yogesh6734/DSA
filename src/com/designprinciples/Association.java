package com.designprinciples;


//Definition: Association represents a relationship between two objects,
// where one object uses or interacts with another. It does not imply ownership,
// and the lifecycle of the objects is independent of each other.
//        Real-World Example:
//A teacher teaches students. The teacher and student objects are linked,
// but neither owns the other.
//        Analogy:
//Think of a bus driver and a bus. The bus driver drives the bus,
// but the driver doesn’t own the bus.

public class Association {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        Student student = new Student("Alice");
        teacher.teach(student); // Mr. Smith is teaching Alice
    }
}

// Teacher and Student have an association relationship.
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach(Student student) {
        System.out.println(this.name + " is teaching " + student.getName());
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}