package practice11;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> members = new ArrayList<Student>();
    private final ArrayList<ClassListener> teachers;

    public Student getLeader() {
        return leader;
    }

    public Klass(int number) {
        this.number = number;
        this.teachers = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void assignLeader(Student leader) {
        if (members.contains(leader)) {
            this.leader = leader;
            this.teachers.forEach(teacher -> {
                teacher.studentBecomeLeader(leader);
            });
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        members.add(student);
        this.teachers.forEach(teacher -> {
            teacher.studentJoinClass(student);
        });
    }

    public boolean isIn(Student student){
        return student.getKlass().equals(this);
    }

    protected void register(ClassListener teacher) {
        this.teachers.add(teacher);
    }
}
