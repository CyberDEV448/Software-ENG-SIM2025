import java.util.ArrayList;
public class Teacher extends Person{
private String sector;
private String position;
private int experience;
private double salary;
private ArrayList<String> subjectTaught;
public Teacher(String name, int iD, String emailAddress, String gender, int nationalID, String password, String sector,
        String position, int experience, double salary, ArrayList<String> subjectTaught) {
    super(name, iD, emailAddress, gender, nationalID, password);
    this.sector = sector;
    this.position = position;
    this.experience = experience;
    this.salary = salary;
    this.subjectTaught = subjectTaught;
}
public String getSector() {
    return sector;
}
public void setSector(String sector) {
    this.sector = sector;
}
public String getPosition() {
    return position;
}
public void setPosition(String position) {
    this.position = position;
}
public int getExperience() {
    return experience;
}
public void setExperience(int experience) {
    this.experience = experience;
}
public double getSalary() {
    return salary;
}
public void setSalary(double salary) {
    this.salary = salary;
}
public ArrayList<String> getSubjectTaught() {
    return subjectTaught;
}
public void setSubjectTaught(ArrayList<String> subjectTaught) {
    this.subjectTaught = subjectTaught;
}
public void addSubject(String Subject){
    System.out.println("Subject Added!");
    subjectTaught.add(Subject);
}
public void recieveSalary(){
System.out.println("CONFIRMED, FUNDS HAS BEEN TRANSFARED INTO YOUR BANK ACCOUNT!");
}
public void promoteTeacher(String newPosition, double newSalary){
    this.position = newPosition;
    this.salary = newSalary;
}

@Override
public String toString() {
    return "Teacher [sector=" + sector + ", position=" + position + ", experience=" + experience + ", salary=" + salary
            + ", subjectTaught=" + subjectTaught + "]";
}

}
