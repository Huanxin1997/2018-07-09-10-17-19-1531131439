package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    LinkedList<Klass> classes = new LinkedList<Klass>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if(classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String classesStr = "";
            for (int i = 0; i < classes.size(); i++) {
                classesStr += classes.get(i).getNumber();
                if (i < classes.size() - 1) {
                    classesStr += ", ";
                }
            }
            return super.introduce() + " I am a Teacher. I teach Class " + classesStr + ".";
        }
    }

    public String introduceWith(Student student) {
        if(classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.name + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.name + ".";
        }
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }
}