package 기본.연산자;

public class 연산자 {

    final static int SECOND = 1000;
    
    public static void main(String[] args) {
        
        int minute = SECOND / 60;
        int second = SECOND % 60;

        System.out.println(minute + "분" + second + "초");
    }
    
}
