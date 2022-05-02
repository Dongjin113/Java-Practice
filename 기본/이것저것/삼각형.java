package 기본.이것저것;
public class 삼각형 {

    final static int N = 15;
    
    public static void main(String[] args) {
        
        for(int i = -N; i < N; i++)
        {
            for(int j = -i; j < N; j++)
             {
                 if((i * j) / 2 <= (N * N) / 2)
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
