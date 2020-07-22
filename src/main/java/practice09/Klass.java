package practice09;

import java.util.List;

public class Klass {
    protected int number;
    protected Student leader;
    protected Student student;

    public Klass(int klass) {
        this.number = klass;
    }

//    public Klass(int number, Student leader, List<Student> list) {
//        this.number = number;
//        this.leader = leader;
//        this.list = list;
//    }

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
        if(this.student == null) {
            System.out.println("It is not one of us.");
        } else {
            setLeader(student);
        }
    }

    public void appendMember(Student student) {
        this.student = student;
    }

}
