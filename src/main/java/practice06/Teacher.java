package practice06;

public class Teacher extends Person{
    protected int Klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public Teacher(String name, int age){
        super(name, age);
    }

    @Override
    public String introduce(){
        String Klass = "";
        if (this.getKlass() > 0){
            return ("My name is Tom. I am "+ this.getAge() + " years old. I am a Teacher. I teach Class "+ this.getKlass()+".");
        }else{
            return ("My name is Tom. I am "+ this.getAge() + " years old. I am a Teacher. I teach No Class.");
        }
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }
}
