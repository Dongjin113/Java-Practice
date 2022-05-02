package 기본.배열;

import java.util.Scanner;

public class 다차원배열{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("생성할 배열의 세로크기를 입력하세요: ");
        int N = scanner.nextInt();
        System.out.print("생성할 배열의 가로크기를 입력하세요: ");
        int M = scanner.nextInt();
        
        int[][] array = new int[N][M];
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                array[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i = 0 ; i< N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }  
        scanner.close();
    }
}