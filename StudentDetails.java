class StudentDetails {
    private String name;
    private int rollNumber;
    private String faculty;

    // Constructor
    public StudentDetails(String name, int rollNumber, String faculty) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.faculty = faculty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // Display Student Profile
    public void displayProfile() {
        System.out.println("----Student Profile----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Faculty: " + faculty);
    }

     // Main Method
        public static void main(String[] args) {
            StudentDetails student = new StudentDetails ("Ram", 95, "BCSIT");
            //Display student profile
            student.displayProfile();
        }
    }

