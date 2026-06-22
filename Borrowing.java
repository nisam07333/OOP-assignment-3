class Member{
    public int getBorrowLimit() {
        return 0;

    }
        }
        class StudentMember extends Member {
    @Override
            public int getBorrowLimit() {
        return 5;
    }
        }
        class TeacherMember extends Member {
    @Override
            public int getBorrowLimit() {
        return 10;
    }
        }
        public class Borrowing {
    public static void main(String[] args){
        Member s = new StudentMember();
        Member t = new TeacherMember();
        System.out.println("Student Limit: " + s.getBorrowLimit());
        System.out.println("Teacher Limit: " + t.getBorrowLimit());

    }
        }