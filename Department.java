import java.util.ArrayList;

public class Department {

    private String deptName;
    private Teacher headOfDept;
    private ArrayList<Teacher> deptTeachers;

    // Department()
    public Department() {
        this.deptTeachers = new ArrayList<>();
    }

    public Department(String deptName) {
        this.deptName = deptName;
        this.deptTeachers = new ArrayList<>();
    }

    // setDeptName()
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // getDeptName()
    public String getDeptName() {
        return deptName;
    }

    // setHeadOfDept()
    public void setHeadOfDept(Teacher headOfDept) {
        this.headOfDept = headOfDept;
    }

    // getHeadOfDept()
    public Teacher getHeadOfDept() {
        return headOfDept;
    }

    // setDeptTeachers()
    public void setDeptTeachers(ArrayList<Teacher> deptTeachers) {
        this.deptTeachers = (deptTeachers == null) ? new ArrayList<>() : deptTeachers;
    }

    // getDeptTeachers()
    public ArrayList<Teacher> getDeptTeachers() {
        return deptTeachers;
    }

    // assignTeacher(Teacher t)
    public void assignTeacher(Teacher t) {
        addTeacher(t);
    }

    // addTeacher(Teacher t)
    public void addTeacher(Teacher t) {
        if (t == null) return;

        // منع تكرار نفس المدرس حسب الـ id
        for (Teacher x : deptTeachers) {
            if (x != null && x.getNationalID() == t.getNationalID()) return;
        }
        deptTeachers.add(t);
    }

    // getDepartmentStats()
    public String getDepartmentStats() {
        StringBuilder sb = new StringBuilder();

        sb.append("Department: ").append(deptName == null ? "N/A" : deptName).append("\n");

        sb.append("Head Of Dept: ");
        if (headOfDept == null) {
            sb.append("N/A\n");
        } else {
            sb.append(headOfDept.getName()).append(" (ID: ").append(headOfDept.getNationalID()).append(")\n");
        }

        sb.append("Teachers Count: ").append(deptTeachers == null ? 0 : deptTeachers.size()).append("\n");

        if (deptTeachers != null && !deptTeachers.isEmpty()) {
            sb.append("Teachers List:\n");
            for (Teacher t : deptTeachers) {
                if (t != null) {
                    sb.append("- ").append(t.getName())
                      .append(" (ID: ").append(t.getNationalID()).append(")\n");
                }
            }
        }

        return sb.toString();
    }
}
