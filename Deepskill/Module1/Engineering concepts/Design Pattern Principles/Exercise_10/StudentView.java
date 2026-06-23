// StudentView.java - MVC Pattern (View)
// The View is responsible for displaying student data to the user.

public class StudentView {

    public void displayStudentDetails(String name, int id, String grade) {
        System.out.println("=== Student Details ===");
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Grade : " + grade);
        System.out.println("=======================");
    }
}
