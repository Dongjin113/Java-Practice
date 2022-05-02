package 기본.조건문과반복문;
public class while반복문 {
    
    public static void main(String[] args) {
        
        int i = 1, sum = 0;
        while(i <= 1000)
        {
            sum += i++;
        }
        System.out.println("1부터 100까지의 합은" + sum + "입니다.");
    }
}
