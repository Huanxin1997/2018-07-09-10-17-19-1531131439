package practice08;

public class Klass {
    protected int number;
    protected String leader;

    public Klass(int klass) {
        this.number = klass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        setLeader(student.name);
    }

}
