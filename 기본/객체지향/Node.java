package 기본.객체지향;

public class Node {

    //private = 외부에서 한번에 접근할수없는 형태
    private int x;
    private int y;

    /*외부에서 접근할수있도록 public으로 형태를 만들어줌
    현재자신이 가지고있는 X를 반화할수 있게해줌 
    get - 값을 가져오는 함수 set - 값을 바꿔주는 함수*/
    public int getX() {
        return x;
    }

    /* setX :x의 값을 설정하기 위해사용 
    this.x 자신이 가지고있는 고유의 x의 값을 지금들어온 intx로 값을 바꾸어줄때 사용 */
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    /* 생성자 - 객체를 하나만들어줄때 자동으로 값들을 초기화해주는 함수
    클래스와 동일한 이름을 가지고 있는것이 하나의 특징 */
    public Node(int x,int y){
        this.x= x;
        this.y= y;
    }
    public Node getCenter(Node other){
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
    }
    
}
