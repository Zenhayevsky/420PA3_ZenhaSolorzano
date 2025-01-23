import java.util.ArrayList;
import java.util.List;

public class Course {
    private String cName;
    public List<Student> students = new ArrayList<>();

    public String getName() {
        return cName;
    }

    public void setName(String cName) {
        this.cName = cName;
    }

    public Course() {
        this.cName = "Not defined";
        this.students = new ArrayList<>();
    }

    public Course(String name, List<Student> listStudents) {
        this.cName = name;
        for (Student s : listStudents) {
            this.students.add(s);
        }
    }
}
