class Course {
    String name;

    Course(String name) {
        this.name = name;
    }
}
class StudentName{
    String name;
    Course[] courses;
    StudentName(String name, Course[] courses) {
        this.name = name;
        this.courses = courses;
    }
    void displayInfo(){
        System.out.println("Student: " +name);
        System.out.println("Registered Courses: ");
        for (Course c: courses){
            System.out.println(c.name);

        }
    }

    }
public class Courses{
    public static void main(String[]  args){
        Course c1 = new Course("java");
        Course c2 = new Course("Database");
        Course[] courses = {c1,c2};
        StudentName studentname = new StudentName("Ram",courses);
        studentname.displayInfo();
    }
}
