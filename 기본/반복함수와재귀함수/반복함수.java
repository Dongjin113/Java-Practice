package 기본.반복함수와재귀함수;

public class 반복함수 {

    //5! = 5 * 4 * 3 * 2 * 1= 120
    //6! = 720

    public static int factorial(int number){
        int sum = 1;
        for(int i =  2; i <= number; i++)
        {
            sum *= i;
            //sum=sum*i
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        System.out.println("10 팩토리얼은" + factorial(10));
    }

}