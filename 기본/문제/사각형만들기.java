package 기본.문제;

public class 사각형만들기 {

    public static void main(String[] args) {
        
        int x = 10 ;

        // 사각형 넓이공식 x * y = r*r

        for( int N = x; N > 0 ; N-- )
        {
            for(int y = x; y > 0; y--)
            {
                if( N * y <= x * x )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }

            
        

    }

}