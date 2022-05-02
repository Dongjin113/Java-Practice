package 기본.조건문과반복문;

public class if조건문3 {

    public static void main(String[] args) {
        
        String a= "I LOVE YOU.";
        if(a.contains("LOVE"))
        {
            // 포함하는 경우 실행되는 부분
            System.out.println("ME TOO.");
        }
        else
        {
            // 포함하지 않는 경우 실행되는 부분
            System.out.println("I Hate You");
        }
    }
    
}
