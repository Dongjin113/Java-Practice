import java.util.Scanner;

public class 도어락copy {

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

        for(int y = 0; y <    x; y++){
            System.out.print(lock[0]);
            System.out.println(number.charAt(0));
            System.out.print(lock[1]);
            System.out.println(number.charAt(1));
        }  
        Scanner.close();
    }
}