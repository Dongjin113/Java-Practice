package 기본.인터페이스;

public class Main implements dog,cat{

    public static void main(String[] args) {

        Main main =new Main();
        main.crying();
        main.show();
        
    }

    @Override
    public void crying() {

        System.out.println("월! 월!");
        
    }

    @Override
    public void show() {
        System.out.println("Hello world");
    }

    @Override
    public void two() {
        System.out.println("two!");
    }

    @Override
    public void one() {
        System.out.println("one!");
    }
    
}
