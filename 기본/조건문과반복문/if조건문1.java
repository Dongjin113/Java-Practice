package 기본.조건문과반복문;
public class if조건문1 {
    
    public static void main(String[] args) {
        
        String a = "Man";
        int b = 0;

        //자바는 String을 비교할 때 equal()을 이용합니다.
        // 그 이름은 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
        if(a.equals("Man"))

        {   System.out.println("남자입니다.");        }
        
        else

        {System.out.println("남자가 아닙니다");       }
        
        if(b == 3 )

        {System.out.println("b는 3입니다.");          }

        else
        {System.out.println("3이 아닙니다.");         }

        if(a.equalsIgnoreCase("man") && b == 0);

        {System.out.println("참입니다.");             }


    }
}
