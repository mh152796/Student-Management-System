package ProjectUsingList;

public class StudentDataBase {
    private String userName = "NULL";
    private String password = "NULL";
    private String name = "NULL";
    private String studentID = "NULL";
    private String department = "NULL";
    private double tuitionFees = 0.0;
    private String courseEnrollment = "NULL";

    public StudentDataBase(String userName, String password, String name, String studentID, String department, double tuitionFees) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.studentID = studentID;
        this.department = department;
        this.tuitionFees = tuitionFees;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public void setCourseEnrollment(String courseEnrollment) {
        this.courseEnrollment = courseEnrollment;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getDepartment() {
        return department;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public String getCourseEnrollment() {
        return courseEnrollment;
    }
}
