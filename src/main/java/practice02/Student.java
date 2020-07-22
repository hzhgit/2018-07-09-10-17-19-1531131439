package practice02;

public class Student extends Person {
    protected int Klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    @Override
    public String introduce() {
        return ("I am a Student. I am at Class " + this.getKlass() + ".");
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }
}
