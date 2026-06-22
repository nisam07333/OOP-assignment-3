abstract class Scholarship{
    abstract boolean isEligible(double value);
}
class MeritScholarship extends Scholarship{
    @Override
    boolean isEligible(double gpa){
        return gpa >= 3.5;
    }
}
class NeedBaseScholarship extends Scholarship {
    @Override
    boolean isEligible(double familyIncome){
        return familyIncome < 30000;
    }
}
public class Eligibility{
    public static void main(String[] args){
        Scholarship merit = new MeritScholarship();
        Scholarship need = new NeedBaseScholarship();
        System.out.println("Merit Scholarship: " + merit.isEligible(3.5));
        System.out.println("Need Base Scholarship: " + need.isEligible(2500));
        

    }
}
