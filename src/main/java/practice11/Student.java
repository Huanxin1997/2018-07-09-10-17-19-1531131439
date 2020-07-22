package practice11;

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
        String str = "";
        if(klass.leader == null) {
            str = super.introduce() + " I am a Student. I am at Class 2.";
        }
        else if(klass.leader.id == id) {
            str = super.introduce() + " I am a Student. I am Leader of Class 2.";
        }
        return str;
    }
}