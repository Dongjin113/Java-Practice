import java.util.Arrays;
import java.util.Random;

public class 로또번호만들기 {


    public static void main(String[] args) {
        
        Random random = new Random();
        int[] array = new int[6];
        for(int r = 0; r < 6; r++){
            
            array[r] = random.nextInt(45);

        }
        System.out.println(Arrays.toString(array));
       

    }
    
}
