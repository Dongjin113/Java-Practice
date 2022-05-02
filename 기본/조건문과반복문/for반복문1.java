package 기본.조건문과반복문;

public class for반복문1 {

    final static int N = 30;

    public static void main(String[] args) {
        
             // for문 : 초기화 부분, 조건 부분, 연산부분
            for(int i = N; i > 0; i--)
            {             
                for(int j = i; j>0; j--)             
                {
                    System.out.print("*");               
                } 
                System.out.println();
            }
    }
    
}

 