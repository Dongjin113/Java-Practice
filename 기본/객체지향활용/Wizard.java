package 기본.객체지향활용;

public class Wizard extends Hero{

    public Wizard(String name) {
        super(name);
    }
    
    public void freezing(){
        System.out.println("얼리기!");
    }
}
