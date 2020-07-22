package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> members = new ArrayList<Student>();
    private final List<JoinListener> joinListeners = new ArrayList<JoinListener>();
    private final List<AssignListener> assignListeners = new ArrayList<AssignListener>();

    public Student getLeader() {
        return leader;
    }

    public Klass(int number) {
        this.number = number;
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

    public List<JoinListener> getJoinListeners() {
        return joinListeners;
    }

    public List<AssignListener> getAssignListeners() {
        return assignListeners;
    }

    public void assignLeader(Student leader) {
        if (members.contains(leader)) {
            this.leader = leader;
            this.leader.setKlass(this);
            this.assignListeners.forEach(assignListener -> {
                assignListener.studentBecomeLeader(leader);
            });
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        members.add(student);
        student.setKlass(this);
        this.joinListeners.forEach(listener ->{
            listener.studentJoinClass(student);
        });
    }

    public boolean isIn(Student student){
        return student.getKlass().equals(this);
    }

//    protected void register(ClassListener teacher) {
//        this.teachers.add(teacher);
//    }
}
