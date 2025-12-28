import java.util.ArrayList;

public class school {
    private String schoolName;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;
    private double totalMoneyEarned;
    private double totalMoneySpent;


    public school(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = (students == null) ? new ArrayList<>() : students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = (teachers == null) ? new ArrayList<>() : teachers;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = (courses == null) ? new ArrayList<>() : courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setTotalMoneyEarned(double totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

   
    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void addStudent(Student s) {
        if (s == null) return;
        if (findStudentById(s.getNationalID()) != null) return;
        students.add(s);
    }

    public void addTeacher(Teacher t) {
        if (t == null) return;
        if (findTeacherById(t.getNationalID()) != null) return;
        teachers.add(t);
    }

    public void addCourse(Course c) {
        if (c == null) return;
        if (findCourseById(c.getCourseID()) != null) return;
        courses.add(c);
    }

    public boolean removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getNationalID() == id) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean removeTeacher(int id) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getNationalID() == id) {
                teachers.remove(i);
                return true;
            }
        }
        return false;
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getNationalID() == id) return s;
        }
        return null;
    }

    public Teacher findTeacherById(int id) {
        for (Teacher t : teachers) {
            if (t.getNationalID() == id) return t;
        }
        return null;
    }

    public Course findCourseById(String id) {
        if (id == null) return null;
        for (Course c : courses) {
            if (id.equals(c.getCourseID())) return c;
        }
        return null;
    }

    public void updateTotalMoneyEarned(double money) {
       
        if (money > 0) this.totalMoneyEarned += money;
    }

    public void updateTotalMoneySpent(double money) {
        if (money > 0) this.totalMoneySpent += money;
    }

    public double getProfit() {
        return totalMoneyEarned - totalMoneySpent;
    }
}