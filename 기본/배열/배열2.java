package 기본.배열;

public class 배열2 {

    public static void main(String[] args) {
        
        int[] array = new int[100];
        for(int i = 0; i < 100; i++){
            //1부터 100까지의 랜덤한수
            array[i] = (int) (Math.random() * 100 + 1);
        }
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += array[i];
        }
        System.out.println("100개의 랜덤 정수의 평균 값은 " + sum / 100 + "입니다.");
    }
    
}
