// StudentController.java - MVC Pattern (Controller)
// Handles communication between the Student model and StudentView.

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Get name from model
    public String getStudentName() {
        return model.getName();
    }

    // Update name in model
    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    // Ask the view to display the current student data
    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}
