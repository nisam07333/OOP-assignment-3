class EmployeeDetails {
    String name;
    int id;

    // Constructor
    public EmployeeDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
    }
}
// Teacher subclass
class Teacher extends EmployeeDetails {
    String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher id: " + id);
        System.out.println("Subject: " + subject);
    }
}
//Admin staff subclass
class AdminStaff extends EmployeeDetails {
    String Department;

    public AdminStaff(String name, int id, String Department) {
        super(name, id);
        this.Department = Department;
    }

    @Override
    public void displayDetails() {
        System.out.println("AdminStaff Name: " + name);
        System.out.println("AdminStaff id: " + id);
        System.out.println("Department: " + Department);
    }
}
//Main class
public class Employee {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Sita", 45, "Programming");
        AdminStaff admin = new AdminStaff("sumi", 30, "Administration");
        System.out.println("Teacher Details: ");
        teacher.displayDetails();
        System.out.println("AdminStaff Details: ");
        admin.displayDetails();

    }

    }

