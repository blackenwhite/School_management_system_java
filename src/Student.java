public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name,int grade) {
        this.id = id;
        this.name = name;
        this.grade=grade;
        feesPaid=0;
        feesTotal=3000;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void updateFeesPaid(int fees){
        feesPaid+=fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
}
