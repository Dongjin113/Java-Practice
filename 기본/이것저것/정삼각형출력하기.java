package 기본.이것저것;
public class 정삼각형출력하기 {

    public static void main(String[] args) {
        
        int x= 15;
        int b= x/2;
        int c = b;

            for(b=x/2; b>=1; b--){

                for(int a=1; a<x; a++)
                {

                    if(a<b) {  
                        System.out.print(".");
                    }else if(a<=c){
                        System.out.print("*");
                    }else {
                        System.out.print(",");
                    }
                }

                System.out.println("");
                c++;
            }
            System.out.println("end");
    }
}