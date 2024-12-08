package model;

import java.util.*;

public class InstructorContainer {
    private TreeSet<Instructor> instructorTree;

    public InstructorContainer() {
        // Comparator to sort instructors by hire date (earliest to latest)
        instructorTree = new TreeSet<>(Comparator.comparing(Instructor::getHireDate));
    }

    public void addInstructor(Instructor instructor) {
        instructorTree.add(instructor);  // Insertion will automatically maintain order
    }

    public void removeInstructor(Instructor instructor) {
        instructorTree.remove(instructor);
    }

    public void displayInstructors() {
        for (Instructor instructor : instructorTree) {
            System.out.println(instructor);
        }
    }
}