import java.util.Scanner;

public class 도어락 {

    public static void main(String[] args) throws Exception {
        


        Scanner Scanner = new Scanner(System.in);
        System.out.print("비밀번호를 입력해주세요: ");
        String number = Scanner.next();
        int x = number.length();
        String[] lock = new String[x];
        for(int i = 0; i < x; i++){
        System.out.println("비밀번호를 한글자씩 다시 입력해주세요: ");
            lock[i] = Scanner.next();
        }

        for(int y = 0; y < x; y++){
            if(lock[y].equals(number.charAt(y))){
                System.out.println("비밀번호가 일치합니다");
            }
            else{
                System.out.println("비밀번호가 일치하지않습니다");

            }
        }
                  

         
        Scanner.close();
    }  
        
}
 