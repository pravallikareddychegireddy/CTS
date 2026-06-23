// MVCTest.java - MVC Pattern Test
// Demonstrates creating a Student, updating details, and displaying through the controller.

public class MVCTest {

    public static void main(String[] args) {

        System.out.println("=== MVC Pattern - Student Record System ===\n");

        // Create the Model
        Student student = new Student("Alice Johnson", 1001, "A");

        // Create the View
        StudentView view = new StudentView();

        // Create the Controller, wiring Model and View together
        StudentController controller = new StudentController(student, view);

        // Display initial details
        System.out.println("Initial Details:");
        controller.updateView();

        // Update student details through the controller
        controller.setStudentName("Alice Smith");
        controller.setStudentGrade("A+");

        // Display updated details
        System.out.println("\nAfter Update:");
        controller.updateView();
    }
}
