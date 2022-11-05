package board;

import java.util.List;

public class BoardServiceImpl implements BoardService  {
	
	private Board board =null;
	
	BoardServiceImpl(){
		board =new BoardImpl();	
		
	}
	
	
	@Override
	public void insert(BoardVo vo) {
		
		// System.out.println("BoardServiceImpl(insert) -->" + vo);
		
		board.transactionBegin();
		board.insert(vo);
		board.transactionEnd();
		
	}

	@Override
	public BoardVo content(int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
