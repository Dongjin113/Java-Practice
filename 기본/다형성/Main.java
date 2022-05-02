package 기본.다형성;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("바나나 : 1, 복숭아 : 2 ?");
        int input = scanner.nextInt();
        fruit fruit;
        if(input == 1){
            fruit = new banana();
            fruit.show();
        }
        else if(input == 2) {
            fruit = new peach();
            fruit.show();
        }
        scanner.close();
    }
    
}
