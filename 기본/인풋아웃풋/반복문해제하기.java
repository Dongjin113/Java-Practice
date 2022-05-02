package 기본.인풋아웃풋;

public class 반복문해제하기 {

    public static void main(String[] args) {
       
        int count = 0;

        for(;;)
        {
            System.out.println("출력");
            count++;
            if(count == 10)
            {
                break;
            }
        }
    }
    
}
