package practice08;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    protected String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (this.klass == null ? "No Class" : ("Class " + this.klass.getNumber())) + ".";
    }

    protected String introduceWith(Student student) {
        String introduceString = super.introduce() + " I am a Teacher.";
        if (student.getKlass() == null) {
            return introduceString + " I don't teach " + student.getName() + ".";
        }
        if (student.getKlass().getNumber() == this.klass.getNumber()) {
            return introduceString + " I teach " + student.getName() + ".";
        }
        return introduceString + " I don't teach " + student.getName() + ".";
    }
}
