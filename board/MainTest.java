package board;

public class MainTest {

	public static void main(String[] args) {
		
		BoardService service = new BoardServiceImpl();
		BoardVo vo= new  BoardVo();
		vo.setIdx(1001);
		vo.setName("둘리");
		vo.setTitle("자바 공부하기");
		service.insert(vo);
		
	}

}
