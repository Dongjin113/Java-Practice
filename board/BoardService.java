package board;

import java.util.List;

public interface BoardService {
	
	   void   insert( BoardVo vo);
	   
	   BoardVo content( int k );
	   
	   List<BoardVo> selectAll();
}
