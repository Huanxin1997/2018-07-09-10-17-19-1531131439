package practice11;

import java.util.LinkedList;

public class Teacher extends Person implements JoinListener {
    LinkedList<Klass> classes = new LinkedList<Klass>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> {
            klass.registerTeachers(this);
        });
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

    @Override
    public void updateStudentJoinListener(Student student) {
        System.out.printf("I am " + getName() + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".\n");
    }

    @Override
    public void updateAssignLeaderListener(Student student) {
        System.out.printf("I am " + getName() + ". I know " + student.getName() + " become Leader of Class " + student.getKlass().getNumber() + ".\n");
    }
}