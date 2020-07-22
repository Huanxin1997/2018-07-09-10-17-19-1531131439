package practice08;

public class Student extends Person {
    protected Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String introduce = super.introduce() + " I am a Student. ";
        if(klass.getLeader() == name) {
            introduce += "I am Leader of Class 2.";
        }else {
            introduce += "I am at Class 2.";
        }
        return introduce;
    }
}