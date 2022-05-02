public class 연습옹1 {

    public static void function(int r){

        //x^2 + y^2 = r^2

        for(int x = -r; x <= r; x++)
        {
            for(int y = -r; y<= r; y++)
            {
                if(x * x + y * y <= r * r){
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

    public static void main(String[] args) throws Exception{

        function(15);
        
    }
    
}
 