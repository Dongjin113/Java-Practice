package 기본.인풋아웃풋;

import java.util.Scanner;

public class 스캐너클래스 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int i = sc.nextInt();
        System.out.println("입력한 정수는" + i + "입니다");
        sc.close();
    }
    
}
