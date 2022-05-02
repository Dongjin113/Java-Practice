package 기본.상속;

public class student extends person{

    private String studentId;
    private int grade;
    private double GPA;
    
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gPA) {
        GPA = gPA;
    }
    public student(String name, int age, int height, int weight, String studentId, int grade, double gPA) {
        super(name, age, height, weight);
        this.studentId = studentId;
        this.grade = grade;
        GPA = gPA;
    }

    public void show() {
        System.out.println("-----------------------------");
        System.out.println("학생 이름 : "+ getName());
        System.out.println("학생 나이 : "+ getAge());
        System.out.println("학생 키 : "+ getHeight());
        System.out.println("학생 몸무게 : "+ getWeight());
        System.out.println("학생 학번 : "+ getStudentId());
        System.out.println("학생 학년 : "+ getGrade());
        System.out.println("학생 성적 : "+ getGPA());

    }
    

    
}
