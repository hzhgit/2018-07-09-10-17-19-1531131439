package practice04;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String introduce() {
        return this.basicIntroduce();
    }

    protected String basicIntroduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
