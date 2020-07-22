package practice09;

public class Teacher extends Person {
    protected Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        else {
            return super.introduce() + " I am a Teacher. I teach Class 2.";
        }
    }

    public String introduceWith(Student student) {
        if(student.getKlass().equals(klass)) {
            return super.introduce() + " I am a Teacher. I teach " + student.name + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.name + ".";
        }
    }
}