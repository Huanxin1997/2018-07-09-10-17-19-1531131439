package practice10;

import java.util.LinkedList;
import java.util.List;

public class Klass {
    protected int number;
    protected Student leader;
    private List<Student> students;

    public Klass(int klass) {
        this.students = new LinkedList<>();
        this.number = klass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student student) {
        this.leader = student;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (this.students.size() == 0) {
            System.out.print("It is not one of us.\n");
            return;
        } else {
            setLeader(student);
        }
    }

    public void appendMember(Student student) {
        this.students.add(student);
    }

}
