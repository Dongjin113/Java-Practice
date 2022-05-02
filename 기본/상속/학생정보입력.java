package 기본.상속;

import java.util.Scanner;

public class 학생정보입력 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("총 몇명의 학생이 존재합니까?");
        int number = scan.nextInt();
        student[] students = new student[number];

        for(int i = 0; i < number; i++)
        {
            String name; 
            int age; 
            int height; 
            int weight; 
            String studentId; 
            int grade; 
            double gPA;
            System.out.print("학생의 이름을 입력하세요: ");
            name = scan.next();
            System.out.print("학생의 나이를 입력하세요: ");
            age = scan.nextInt();
            System.out.print("학생의 키를 입력하세요: ");
            height = scan.nextInt();
            System.out.print("학생의 몸무게를 입력하세요: ");
            weight = scan.nextInt();
            System.out.print("학생의 학번을 입력하세요: ");
            studentId = scan.next();
            System.out.print("학생의 학년을 입력하세요: ");
            grade = scan.nextInt();
            System.out.print("학생의 학점을  입력하세요: ");
            gPA = scan.nextDouble();
            students[i] = new student(name, age, height, weight, studentId, grade, gPA);
        }
        for(int i = 0; i < number; i++)
        {
            students[i].show();
        }
                
        scan.close();

    }
    
}
