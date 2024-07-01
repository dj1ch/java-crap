package chapter9; // Chapter 9A and 9B

public class Employee extends Person {

    private String employeeId;
    private String title;

    public Employee() {
        super("angie"); // calls second constructor
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
