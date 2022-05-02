package 기본.상속;

public class Main {

    public static void main(String[] args) {
        
        student student1 = new student("이동진", 20, 174, 80, "20173482", 1, 4.5);
        student student2 = new student("이순신", 20, 174, 80, "20173482", 1, 4.5);
        student1.show();
        student2.show();

        
        teacher teacher1 = new teacher("John", 25, 177, 77, "abc1573", 3000000, 5);
        teacher1.show();
    }
    
}