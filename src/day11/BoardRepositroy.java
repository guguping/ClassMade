package day11;

import java.util.ArrayList;
import java.util.List;

public class BoardRepositroy {
	//데이터 베이스에 가공 정보를 저장하는곳 데이터 베이스에서 가져오고 저장하기만 가능하다
		private List<BoardDTO> list = new ArrayList<>();

		public boolean save(BoardDTO boardDTO) {
			return list.add(boardDTO);
			// add는 list의 숨겨진 메소드이다
			// 저장되면 true를 리턴하고 저장 실패하면 false를 리턴한다
		}
		
		public List<BoardDTO> findAll(){
			return list;
		}
		
		public BoardDTO findById(String bno){
			for(BoardDTO b : list) {
				if(b.getBno().equals(bno)) {
					return b;
				}
			}
			return null;
		}
		
		public boolean update(BoardDTO boardDTO , String bno) {
			for(BoardDTO b : list) {
				if(b.getBno().equals(bno)) {
					b.setTitle(boardDTO.getTitle());
					b.setWriter(boardDTO.getWriter());
					return true;
				}
			}
			return false;
		}
		
		// 내가만든 삭제
		public void remove(BoardDTO boardDTO) {
			
			list.remove(boardDTO);
		}
		// 선생님이 만든 삭제
		public boolean delete(String bno) {
			for(BoardDTO b : list) {
				if(b.getBno().equals(bno)) {
					
					list.remove(b);
					return true;
				}
			}
			return false;
		}
}
