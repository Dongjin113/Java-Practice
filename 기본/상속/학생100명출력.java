package 기본.상속;

public class 학생100명출력 {

    public static void main(String[] args) {
        
        student[] students = new student[100];
        for(int i = 0; i < 100 ; i++)
        {
            students[i] = new student("홍길동", 32, 177, 43, i + "", 3, 4.2);
            students[i].show();
        }

        
    }
    
}
