class Attendence {
    public double calculateAttendence(int attended,int total){
        return (attended * 100.0) /total;
    }
}
class EngineeringAttendence extends Attendence {
    @Override
    public double calculateAttendence(int attended, int total) {
        return (attended * 100.0) /total;
    }
}
class MedicalAttendence extends Attendence {
    @Override
    public double calculateAttendence(int attended, int total) {
        return (attended * 100.00) /total;

    }
}
public class AttendencePercentage {
    public static void main(String[] args) {
        Attendence eng = new EngineeringAttendence();
        Attendence med = new MedicalAttendence();
        System.out.println("Engineering: " + eng.calculateAttendence(40, 50) + "%");
        System.out.println("Medical: " + med.calculateAttendence(45, 50) + "%");
    }
    }
