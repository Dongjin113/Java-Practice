package board;

import java.util.List;

public interface Board {
	
   void   insert( BoardVo vo);
   
   BoardVo content( int k );
   
   List<BoardVo> selectAll();
   
   void  transactionBegin();
   
   void  transactionEnd();
   
}
