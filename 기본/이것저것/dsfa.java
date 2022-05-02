package 기본.이것저것;
public class dsfa {
    
    final static int N = 15;
    public static void main(String[] args) {
        
        // x * y = r/2 
        
        for(int i = N; i < 15; i++)
        {
            for(int j = N; j < 15; j++)
            {
                if((i * j) /2 <= (N * N)/2 )
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
