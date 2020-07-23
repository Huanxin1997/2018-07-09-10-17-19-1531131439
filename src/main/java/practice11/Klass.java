package practice11;

import java.util.LinkedList;
import java.util.List;

public class Klass {
    protected int number;
    protected Student leader;
    private List<Student> students;
    private List<Teacher> teachers;

    public Klass(int klass) {
        this.students = new LinkedList<>();
        this.teachers = new LinkedList<>();
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
            for(int i = 0;i < teachers.size();i ++) {
                teachers.get(i).updateAssignLeader(leader, this);
            }
        }
    }

    public boolean isIn(Student student) {
        return student.getKlass().getNumber() == getNumber();
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        this.students.add(student);
        for(int i = 0;i < teachers.size();i ++) {
            teachers.get(i).updateStudentJoin(student, this);
        }
    }

    public void registerTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
}
