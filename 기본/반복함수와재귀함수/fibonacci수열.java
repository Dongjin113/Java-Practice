package 기본.반복함수와재귀함수;

public class fibonacci수열 {

    public static int fibonacci (int number) {

        int one = 1;
        int two = 1;
        int result = -1;
        if(number == 1){
            return one;
        }
        else if (number == 2){
            return two;
        }
        else
        {
            for(int i = 2; i<number; i++)
            {
                result = one + two;
                one = two;
                two = result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println("피브나치 수열의 10번째 원소는 " + fibonacci(50)+ "입니다.");

    }

}