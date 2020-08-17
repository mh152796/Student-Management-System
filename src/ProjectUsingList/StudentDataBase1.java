package ProjectUsingList;

public class StudentDataBase1 extends StudentDataBase {
    private static String university = "Daffodil International University";
    public static int countStudent = 0;
    public static int noOfEnrolledStudent = 0;

    public StudentDataBase1(String userName, String password, String name, String studentID, String department, double tuitionFees) {
        super(userName, password, name, studentID, department, tuitionFees);
    }

    void viewEnrollCourse() {
        if (getCourseEnrollment().equals("diuPC@221")) {
            System.out.println("You Enroll Object Oriented Programming Course On JAVA");
        } else {
            System.out.println("Still You're Not Enroll Object Oriented Programming Course On JAVA");
        }
    }
    static void front()
    {
         System.out.println("============================================================================");
        System.out.println("''  Press 1 For Add Student To the Database :                              ''");
        System.out.println("''  Press 2 For Display All Student Information :                          ''");
        System.out.println("''  Press 3 For Login To the Student Database :                            ''");
        System.out.println("''  Press 4 For Enroll OOP Course In Java :                                ''");
        System.out.println("''  Press 5 For View Total Number Of Student :                             ''");
        System.out.println("''  Press 6 For View Total Number Of Oop Enrolled Student :                ''");
        System.out.println("''  Press 7 For Check Whether You Enrollment On Java Course :              ''");
        System.out.println("''  Press 8 For Update Student Information :                               ''");
        System.out.println("''  Press 9 For Delete Student Information :                               ''");
        System.out.println("''  Press 0 For Exit :                                                     ''");
        System.out.println("''=========================================================================''");
    }
    void display() {
        System.out.println("''======================================================================''");
        System.out.println("''                      UserName : " + getUserName()                  +"''");
        System.out.println("''                      Name : " + getName()                          +"''");
        System.out.println("''                      StudentId : " + getStudentID()                +"''");
        System.out.println("''                      Department : " + getDepartment()              +"''");
        System.out.println("''                      TuitionFees : " + getTuitionFees()            +"''");
        System.out.println("========================================================================''");
    }

    void Login() {
        System.out.println("Login Successful : ");
        System.out.println("Name : " + getName());
        System.out.println("StudentId : " + getStudentID());
        System.out.println("Department : " + getDepartment());
        System.out.println("TuitionFees : " + getTuitionFees());
        if (getCourseEnrollment().equals("diuPC@221")) {
            System.out.println("You Enroll Object Oriented Programming Course On JAVA");
        }
        System.out.println("Student of " + university);
    }

    static void totalStudent() {
        if (countStudent == 0) {
            System.out.println("No students have been added to the student database yet.");
        } else {
            System.out.println("Total Number Of Student Is : " + countStudent);
        }
    }

    static void noOfOopEnrolledStudent() {
        if (noOfEnrolledStudent == 0) {
            System.out.println("No Student Enrolled On Oop Course.");
        } else {
            System.out.println("Total Number Of Oop Enroll Student Is : " + noOfEnrolledStudent);
        }
    }
}
