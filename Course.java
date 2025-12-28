import java.util.ArrayList;
public class Course {
   

    private String courseId;
    private String courseName;
    private Teacher assignedTeacher;
    private ArrayList<Student> enrolledStudents;
    private Class assignedRoom;

    public Course() {
        this.enrolledStudents = new ArrayList<>();
    }

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void setCourseID(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseID() {
        return courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setAssignedTeacher(Teacher teacher) {
        this.assignedTeacher = teacher;
    }

    public Teacher getAssignedTeacher() {
        return assignedTeacher;
    }

    public void setEnrolledStudents(ArrayList<Student> students) {
        if (students == null) {
            this.enrolledStudents = new ArrayList<>();
        } else {
            this.enrolledStudents = students;
        }
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setAssignedRoom(Class room) {
        this.assignedRoom = room;
    }

    public Class getAssignedRoom() {
        return assignedRoom;
    }

    public void assignTeacher(Teacher t) {
        this.assignedTeacher = t;
    }

    public void assignRoom(Class room) {
        this.assignedRoom = room;
    }

    public void addStudent(Student s) {
        if (s == null) return;

        // منع التكرار حسب الـ id
        for (Student st : enrolledStudents) {
            if (st.getNationalID() == s.getNationalID()) return;
        }
        enrolledStudents.add(s);
    }

    public boolean removeStudent(int studentId) {
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getNationalID() == studentId) {
                enrolledStudents.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getClassList() {
        if (enrolledStudents.isEmpty()) return "No students enrolled.";

        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(courseName).append(" (").append(courseId).append(")\n");
        sb.append("Students:\n");
        for (Student s : enrolledStudents) {
            sb.append("- ").append(s.getNationalID()).append(" : ").append(s.getName()).append("\n");
        }
        return sb.toString();
    }
}
