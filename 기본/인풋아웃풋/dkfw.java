package 기본.인풋아웃풋;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class dkfw {

    public static void main(String[] args) throws Exception {
        
        File file = new File("C://input.txt");
        System.out.println("파일있는지부터 체크 : " +  file.exists());

        //메모장파일 내용 한글있으면 메모장파일 인코딩ansi로저장
        Scanner sc =new Scanner(new FileInputStream(file));

        String ar = (String.valueOf(sc.next()));

        System.out.println("여기" + ar);



    }
    
}

