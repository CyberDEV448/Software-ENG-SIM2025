import java.util.ArrayList;;
public class Student extends Person{
private String grade;
private double GPA;
private double totalFees;
private boolean isTuitionPaid;
private String parentPhoneNumber;
private int absenceCount;
ArrayList<Exam> takenExams;
public Student(String name, int iD, String emailAddress, String gender, int nationalID, String password, String grade,
        double gPA, double totalFees, boolean isTuitionPaid, String parentPhoneNumber, int absenceCount,
        ArrayList<Exam> takenExams) {
    super(name, iD, emailAddress, gender, nationalID, password);
    this.grade = grade;
    GPA = gPA;
    this.totalFees = totalFees;
    this.isTuitionPaid = isTuitionPaid;
    this.parentPhoneNumber = parentPhoneNumber;
    this.absenceCount = absenceCount;
    this.takenExams = takenExams;
}
public String getGrade() {
    return grade;
}
public void setGrade(String grade) {
    this.grade = grade;
}
public double getGPA() {
    return GPA;
}
public void setGPA(double gPA) {
    GPA = gPA;
}
public double getTotalFees() {
    return totalFees;
}
public void setTotalFees(double totalFees) {
    this.totalFees = totalFees;
}
public boolean isTuitionPaid() {
    return isTuitionPaid;
}
public void setTuitionPaid(boolean isTuitionPaid) {
    this.isTuitionPaid = isTuitionPaid;
}
public String getParentPhoneNumber() {
    return parentPhoneNumber;
}
public void setParentPhoneNumber(String parentPhoneNumber) {
    this.parentPhoneNumber = parentPhoneNumber;
}
public int getAbsenceCount() {
    return absenceCount;
}
public void setAbsenceCount(int absenceCount) {
    this.absenceCount = absenceCount;
}
public ArrayList<Exam> getTakenExams() {
    return takenExams;
}
public void setTakenExams(ArrayList<Exam> takenExams) {
    this.takenExams = takenExams;
}
public void payFees(double amount){

}
public void getRemainingFees(){
System.out.println("Total remaining fees :"+this.totalFees);
}
public void markAbsent(){
    absenceCount++;
    System.out.println("total absenceCount : "+this.absenceCount);  
}
public void addExamResult(Exam exam){
takenExams.add(exam);
}


@Override
public String toString() {
    return "Student [grade=" + grade + ", GPA=" + GPA + ", totalFees=" + totalFees + ", isTuitionPaid=" + isTuitionPaid
            + ", parentPhoneNumber=" + parentPhoneNumber + ", absenceCount=" + absenceCount + ", takenExams="
            + takenExams + "]";
}



}


