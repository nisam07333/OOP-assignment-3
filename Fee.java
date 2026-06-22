abstract class StudentData{
    String name;
    int creditHours;
    StudentData(String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
    }
    public abstract double calculateFee();
    public void displayInfo() {
            System.out.println("Name: " + name + "Fee: $" + calculateFee());
        }
    }
    class Undergraduate extends StudentData {
    Undergraduate(String name, int creditHours) {
        super(name, creditHours);
    }
    @Override
    public double calculateFee() {
        return creditHours * 200.00; // $200 per credit

    }
}
class Graduate extends StudentData {
    Graduate(String name, int creditHours) {
        super(name, creditHours);
    }
    @Override
    public double calculateFee() {
        return creditHours * 400.00 + 500.00;//$400/credit + $500 research fee

    }
}
public class Fee{
    public static void main(String[] args){
        StudentData[] students ={new Undergraduate("Aman",15),
        new Graduate("Aney", 9)};
        for (StudentData s : students)
            s.displayInfo();

    }
}
