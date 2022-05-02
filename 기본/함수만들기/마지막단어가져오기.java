package 기본.함수만들기;

public class 마지막단어가져오기 {

    public static char function(String input){
        return input.charAt(input.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println("hello World의 마지막 단어는 " + function("hello World"));
    }
    
}
