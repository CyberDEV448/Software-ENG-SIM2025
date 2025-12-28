import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        school mySchool = new school("Sidi-gaber-highSchool");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to " + mySchool.getSchoolName() + " Management System!");

        // 2. Main Loop
        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add a New Student");
            System.out.println("2. Add a New Teacher");
            System.out.println("3. Create a New Course");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Pay Student Fees");
            System.out.println("6. Show School Financials");
            System.out.println("7. List All Students");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                
                case 1:
                    System.out.println("--- Add Student ---");
                    
                    System.out.print("Enter ID: ");
                    int sId = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter Name: ");
                    String sName = scanner.nextLine();
                    
                    System.out.print("Enter Age: ");
                    int sAge = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    System.out.print("Enter Email: ");
                    String sEmail = scanner.nextLine();
                    
                    System.out.print("Enter Password: ");
                    String sPass = scanner.nextLine();
                    
                    System.out.print("Enter Address: ");
                    String sAddr = scanner.nextLine();
                    
                    System.out.print("Enter Gender: ");
                    String sGender = scanner.nextLine();
                    
                    System.out.print("Enter National ID: ");
                    int sNatId = scanner.nextInt();
                    scanner.nextLine();

                    
                    System.out.print("Enter Grade (e.g., 10th): ");
                    String sGrade = scanner.nextLine();
                    
                    System.out.print("Enter Parent Phone Number: ");
                    String sParentPhone = scanner.nextLine();
                    
                    System.out.print("Enter Total Annual Fees: ");
                    double sTotalFees = scanner.nextDouble();
                    Student newStudent = new Student(sName, sId, sEmail, sGender, sNatId, sPass,sGrade, 0.0, 20000, false, " ", 0, new ArrayList<>());
                    mySchool.addStudent(newStudent);
                    System.out.println("Student " + sName + " added successfully!");
                    break;

               
                case 2:
                    System.out.println("--- Add Teacher ---");
                   
                    System.out.print("Enter ID: ");
                    int tId = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    System.out.print("Enter Name: ");
                    String tName = scanner.nextLine();
                    
                    System.out.print("Enter Age: ");
                    int tAge = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter Email: ");
                    String tEmail = scanner.nextLine();
                    
                    System.out.print("Enter Password: ");
                    String tPass = scanner.nextLine();
                    
                    System.out.print("Enter Address: ");
                    String tAddr = scanner.nextLine();
                    
                    System.out.print("Enter Gender: ");
                    String tGender = scanner.nextLine();
                    
                    System.out.print("Enter National ID: ");
                    int tNatId = scanner.nextInt();
                    scanner.nextLine();

                    
                    System.out.print("Enter Sector (e.g., Primary): ");
                    String tSector = scanner.nextLine();
                    
                    System.out.print("Enter Position (e.g., Head Teacher): ");
                    String tPosition = scanner.nextLine();
                    
                    System.out.print("Enter Experience (Years): ");
                    int tExp = scanner.nextInt();
                    
                    System.out.print("Enter Salary: ");
                    double tSalary = scanner.nextDouble();

                   
                    Teacher newTeacher = new Teacher(tName, tId, tEmail, tGender, tNatId, tPass, tSector, tPosition, tExp, tSalary, new ArrayList<>());
                    mySchool.addTeacher(newTeacher);
                    System.out.println("Teacher " + tName + " added successfully!");
                    break;

                // CASE 3: CREATE COURSE
                case 3:
                    System.out.println("--- Create Course ---");
                    System.out.print("Enter Course ID (e.g., CS101): ");
                    String cId = scanner.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cName = scanner.nextLine();

                    Course newCourse = new Course(cId, cName);
                    mySchool.addCourse(newCourse);
                    System.out.println("Course created!");
                    break;

                // CASE 4: ENROLL STUDENT
                case 4:
                    System.out.println("--- Enroll Student ---");
                    System.out.print("Enter Course ID: ");
                    String searchCId = scanner.nextLine();
                    Course foundCourse = mySchool.findCourseById(searchCId);

                    if (foundCourse != null) {
                        System.out.print("Enter Student ID to enroll: ");
                        int searchSId = scanner.nextInt();
                        Student foundStudent = mySchool.findStudentById(searchSId);

                        if (foundStudent != null) {
                            // Logic inside Course class should handle duplicate checks
                            boolean success = foundCourse.addStudent(foundStudent);
                            if(success) {
                                System.out.println("Student enrolled.");
                            } else {
                                System.out.println("Enrollment failed (Room full or already enrolled).");
                            }
                        } else {
                            System.out.println("Student not found.");
                        }
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                // CASE 5: PAY FEES
                case 5:
                    System.out.println("--- Pay Fees ---");
                    System.out.print("Enter Student ID: ");
                    int payId = scanner.nextInt();
                    Student payStudent = mySchool.findStudentById(payId);

                    if (payStudent != null) {
                        System.out.println("Student: " + payStudent.getName());
                        System.out.println("Total Fees: " + payStudent.getTotalFees());
                        System.out.println("Paid So Far: " + (payStudent.getTotalFees() - payStudent.getRemainingFees()));
                        System.out.println("Remaining: " + payStudent.getRemainingFees());
                        
                        System.out.print("Enter amount to pay: ");
                        double amount = scanner.nextDouble();
                        
                        payStudent.payFees(amount);
                        mySchool.updateTotalMoneyEarned(amount);
                        System.out.println("Payment successful. New Remaining: " + payStudent.getRemainingFees());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                // CASE 6: FINANCIALS
                case 6:
                    System.out.println("--- School Financials ---");
                    System.out.println("Total Earned: $" + mySchool.getTotalMoneyEarned());
                    System.out.println("Total Spent: $" + mySchool.getTotalMoneySpent());
                    System.out.println("Net Profit: $" + mySchool.getProfit());
                    break;

                // CASE 7: LIST STUDENTS
                case 7:
                    System.out.println("--- Student List ---");
                    ArrayList<Student> list = mySchool.getStudents();
                    if(list.isEmpty()){
                        System.out.println("No students registered.");
                    } else {
                        for (Student s : list) {
                            // This relies on your toString() method in Student class
                            System.out.println(s.toString());
                        }
                    }
                    break;

                case 8:
                    running = false;
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
       
    }
}