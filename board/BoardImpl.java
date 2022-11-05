package board;

import java.util.List;

public class BoardImpl implements Board {

	@Override
	public void insert(BoardVo vo) {
		System.out.println("BoardImpl(insert) -->" + vo);
		
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

	@Override
	public void transactionBegin() {
		System.out.println("===> Transaction 시작 ");
		
	}

	@Override
	public void transactionEnd() {
		System.out.println("===> Transaction 끝 ");
		
	}

}
