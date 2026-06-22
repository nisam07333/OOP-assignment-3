class Student {
    private static int counter = 1000;
    private int studentID;
    public Student() {
        studentID = ++counter;
    }
    public void display() {
        System.out.println("Student ID: " + studentID);
    }
}
public class UniqueID {
    public static void main (String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.display();
        s2.display();
    }

}
