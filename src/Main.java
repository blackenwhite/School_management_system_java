public class Main {
    public static void main(String[] args) {
        Teacher lizzy=new Teacher(1,"Lizzy",500);
        Teacher mellisa=new Teacher(2,"Mellissa", 500);
        Teacher vanderthorn=new Teacher(3, "Vanderthorn", 700);

        Student tamasha=new Student(1, "Tamasha",4);
        Student rakshit=new Student(2, "Rakshit Vasudev", 12);
        Student rabbi=new Student(3, "Rabbi",2);

        School dps=new School();
        dps.addStudent(tamasha);
        dps.addStudent(rakshit);
        dps.addStudent(rabbi);

        dps.addTeacher(lizzy);
        dps.addTeacher(mellisa);
        dps.addTeacher(vanderthorn);

        //System.out.println(dps.getTotalMoneyEarned());

        tamasha.payFees(200);
        dps.updateTotalMoneyEarned(200);

        System.out.println(dps.getTotalMoneyEarned());
    }
}
