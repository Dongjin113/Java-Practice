package 기본.반복함수와재귀함수;

public class fibonacci수열재귀함수{

    public static int fibonacci (int number) {
        if(number ==1)
            {return 1;}
        else if(number ==2)
            {return 1;}
        else
        {
            return fibonacci(number-1)+ fibonacci(number -2);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(50) + "입니다.");
    }
    
}
