import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School() {
        teachers=new ArrayList<Teacher>();
        students=new ArrayList<Student>();
        totalMoneyEarned=0;
        totalMoneySpent=0;

    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
        System.out.println(teacher.getName() + " added. ");
    }

    public void addStudent(Student s){
        students.add(s);
        System.out.println("Student "+ s.getName()+ " added.");
    }

    public void updateTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned+=moneyEarned;
    }

    public void updateTotalMoneySpent(int moneySpent){
        totalMoneySpent+=moneySpent;
    }
}
