interface ResultProcessor {
    void calculateGrade(int marks);
}
class EngineeringDepartment implements ResultProcessor {
    @Override
    public void calculateGrade(int marks) {
        if (marks >= 80)
            System.out.println("Engineering Grade: A");
        else if (marks >= 60)
            System.out.println("Engineering Grade: B");
        else if (marks >= 40)
            System.out.println("Engineering Grade: C");
        else
            System.out.println("Engineering Grade: F");

    }
}
class ManagementDepartment implements ResultProcessor{
    @Override
    public void calculateGrade(int marks) {
        if (marks >= 75)
            System.out.println("Management Grade: A");
        else if (marks >= 60)
            System.out.println("Management Grade: B");
        else if (marks >= 45)
            System.out.println("Management Grade: C");
        else
            System.out.println("Management Grade: D");
    }
}
public class Grade{
    public static void main(String[] args){
        ResultProcessor eng = new EngineeringDepartment();
        ResultProcessor mgmt = new ManagementDepartment();
        eng.calculateGrade(65);
        mgmt.calculateGrade(55);

    }
}