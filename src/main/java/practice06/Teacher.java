package practice06;

public class Teacher extends Person{
    protected Integer Klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public Teacher(String name, int age){
        super(name, age);
    }

    @Override
    public String introduce(){
        return super.introduce() + " I am a Teacher. I teach " + (this.Klass == null ? "No Class" : ("Class " + this.Klass)) + ".";
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }
}
