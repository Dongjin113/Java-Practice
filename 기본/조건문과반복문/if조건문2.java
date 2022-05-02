package 기본.조건문과반복문;

public class if조건문2 {
    
    public static void main(String[] args) {
        
        int score = 40;
        if(score >= 90)
        {
            System.out.println("A+입니다.");
        }
        else if((score >80) || (score == 80))
        {
            System.out.println("B+입니다.");
        }
        else if(score >= 70)
        {
            System.out.println("C+입니다.");
        }
        else
        {
            System.out.println("F입니다.");
        }
    }
}
