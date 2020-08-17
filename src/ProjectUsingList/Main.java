package ProjectUsingList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<StudentDataBase1> list = new ArrayList<StudentDataBase1>();
        Scanner input = new Scanner(System.in);
        while (true) {
                StudentDataBase1.front();
            int c;
            c = input.nextInt();
            switch (c) {
                case 1: {
                    String userName;
                    String password;
                    String name;
                    String studentID;
                    String department;
                    double tuitionFees;
                    input.nextLine();
                    System.out.print("Enter UserName : ");
                    userName = input.nextLine();
                    System.out.print("Enter Password : ");
                    password = input.nextLine();
                    System.out.print("Enter Full Name : ");
                    name = input.nextLine();
                    System.out.print("Enter StudentId : ");
                    studentID = input.nextLine();
                    System.out.print("Enter Department : ");
                    department = input.nextLine();
                    System.out.print("Enter Tuition Fees : ");
                    tuitionFees = input.nextDouble();
                    StudentDataBase1.countStudent++;
                    list.add(new StudentDataBase1(userName, password, name, studentID, department, tuitionFees));
                    break;
                }
                case 2: {
                    if (list.isEmpty() == true) {
                        System.out.println("Empty!Because You are not add any student in the student database yet.");
                    } else {
                        System.out.println("Print All Student Information : ");
                        System.out.println("Total Student : " + StudentDataBase1.countStudent);
                        for (StudentDataBase1 s : list) {
                            s.display();
                        }
                    }
                    break;
                }
                case 3: {
                    String userName;
                    String password;
                    if (list.isEmpty() == true) {
                        System.out.println("Empty Student Database.");
                        break;
                    }
                    System.out.print("Enter UserName : ");
                    input.nextLine();
                    userName = input.nextLine();
                    System.out.print("Enter Password : ");
                    password = input.nextLine();
                    int i = 0;
                    for (StudentDataBase1 s : list) {
                        if ((userName.equals(s.getUserName())) && (password.equals(s.getPassword()))) {
                            i = 1;
                            s.Login();
                            break;
                        }
                    }
                    if (i == 0) {
                        System.out.println("Wrong user name or Password.");
                    }
                    break;
                }
                case 4: {
                    if (list.isEmpty() == true) {
                        System.out.println("Empty!Because You are not add any student in the student database yet.");
                        break;
                    }
                    String EnrollKey;
                    String userName;
                    String password;
                    input.nextLine();
                    System.out.print("Enter UserName : ");
                    userName = input.nextLine();
                    System.out.print("Enter Password : ");
                    password = input.nextLine();
                    int i = 0;
                    for (StudentDataBase1 s : list) {
                        if ((userName.equals(s.getUserName())) && (password.equals(s.getPassword()))) {
                            i++;
                            System.out.print("Enter Your Enroll Key to Enroll You On OOP Course In Java : ");
                            EnrollKey = input.nextLine();
                            if (EnrollKey.equals("diuPC@221")) {
                                s.setCourseEnrollment(EnrollKey);
                                StudentDataBase1.noOfEnrolledStudent++;
                                System.out.println("Java Course Enroll Successful.");
                            } else {
                                System.out.println("Invalid Enrollment Key! Please Try Again Later.");
                                break;
                            }
                        }

                    }
                    if (i == 0) {
                        System.out.println("Invalid Username or Password.");
                    }
                    break;
                }
                case 5: {
                    if (list.isEmpty() == true) {
                        System.out.println("Empty Student Database!.");
                        break;
                    }
                    StudentDataBase1.totalStudent();
                    break;
                }
                case 6: {
                    if (list.isEmpty() == true) {
                        System.out.println("Empty Student Database!.");
                        break;
                    }
                    StudentDataBase1.noOfOopEnrolledStudent();
                    break;
                }
                case 7: {
                    if (list.isEmpty() == true) {
                        System.out.println("Empty Student Database!.");
                    } else {
                        String userName;
                        String password;
                        System.out.print("Enter Username : ");
                        input.nextLine();
                        userName = input.nextLine();
                        System.out.print("Enter Password : ");
                        password = input.nextLine();
                        int i = 0;
                        for (StudentDataBase1 s : list) {
                            if ((userName.equals(s.getUserName())) && (password.equals(s.getPassword()))) {
                                s.viewEnrollCourse();
                                i++;
                                break;
                            }
                        }
                        if (i == 0) {
                            System.out.println("Wrong Username or Password!.");
                        }
                    }
                    break;
                }
                case 8: {
                    if (list.isEmpty() == true) {
                        System.out.println("Empty Student Database!.");
                    } else {
                        int i = 0;
                        String userName;
                        String password;
                        System.out.print("Enter UserName : ");
                        input.nextLine();
                        userName = input.nextLine();
                        System.out.print("Enter Password : ");
                        password = input.nextLine();
                        for (StudentDataBase1 s : list) {
                            if ((userName.equals(s.getUserName())) && (password.equals(s.getPassword()))) {
                                i = 1;
                                System.out.print("Enter UserName : ");
                                s.setUserName(input.nextLine());
                                System.out.print("Enter Password : ");
                                s.setPassword(input.nextLine());
                                System.out.print("Enter Name : ");
                                s.setName(input.nextLine());
                                System.out.print("Enter StudentId : ");
                                s.setStudentID(input.nextLine());
                                System.out.print("Enter Department : ");
                                s.setDepartment(input.nextLine());
                                System.out.print("Enter Tuition Fees : ");
                                s.setTuitionFees(input.nextDouble());
                                System.out.println("Update Successful");
                                break;
                            }
                        }
                        if (i == 0) {
                            System.out.println("This Student Not In The Student Database!.");
                        }
                    }
                    break;
                }
                case 9: {
                    if (list.isEmpty() == true) {
                        System.out.println("Empty Student Database.");
                    } else {
                        String userName;
                        String password;
                        System.out.print("Enter Username : ");
                        input.nextLine();
                        userName = input.nextLine();
                        System.out.print("Enter Password : ");
                        password = input.nextLine();
                        int i = 0;
                        for (StudentDataBase1 s : list) {
                            if ((userName.equals(s.getUserName())) && (password.equals(s.getPassword()))) {
                                System.out.printf("Erased all of %s's information from the record.\n", s.getName());
                                list.remove(s);
                                StudentDataBase1.countStudent--;
                                i++;
                                break;
                            }
                        }
                        if (i == 0) {
                            System.out.println("Wrong Username or Password!.");
                        }
                    }
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}

