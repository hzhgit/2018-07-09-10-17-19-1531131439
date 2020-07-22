package practice11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Teacher extends Person implements ClassListener{
    private LinkedList<Klass> classes = new LinkedList<Klass>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        this.classes.forEach(klass -> {
            klass.register(this);
        });
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    protected String introduce() {
        if (this.classes == null || this.classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            ArrayList<String> classCount = new ArrayList<>();
            for (Klass klass : classes) {
                classCount.add(String.valueOf(klass.getNumber()));
            }
            return super.introduce() + " I am a Teacher. I teach Class " + String.join(", ", classCount) + ".";
        }
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : this.classes) {
            if (klass.isIn(student))
                return true;
        }
        return false;
    }

    protected String introduceWith(Student student) {
        String introduceString = super.introduce() + " I am a Teacher.";
        if (isTeaching(student)) {
            return introduceString + " I teach " + student.getName() + ".";
        }
        return introduceString + " I don't teach " + student.getName() + ".";
    }

    @Override
    public void studentJoinClass(Student student) {
        System.out.print(String.format("I am %s. I know %s has joined Class %s.\n", this.getName(), student.getName(), student.getKlass().getNumber()));
    }

    @Override
    public void studentBecomeLeader(Student student) {
        System.out.print(String.format("I am %s. I know %s become Leader of Class %s.\n", this.getName(), student.getName(), student.getKlass().getNumber()));
    }
}
