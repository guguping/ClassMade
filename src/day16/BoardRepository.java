package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day11.BoardDTO;
import day15.StudentDTO;

public class BoardRepository {
	//데이터 베이스에 가공 정보를 저장하는곳 데이터 베이스에서 가져오고 저장하기만 가능하다
		private List<BoardDTO> list = new ArrayList<>();
		private Map<String, BoardDTO> bRepository = new HashMap<>();

		public void save(BoardDTO boardDTO) {
			bRepository.put( boardDTO.getBno() , boardDTO);
			// add는 list의 숨겨진 메소드이다
			// 저장되면 true를 리턴하고 저장 실패하면 false를 리턴한다
		}
		
		public Map<String, BoardDTO> findAll(){
			return bRepository;
		}
		
		public BoardDTO findById(String bno){
			for(String b : bRepository.keySet()) {
				if(b.equals(bno)) {
					BoardDTO a = bRepository.get(b);
					return a;
				}
			}
			return null;
		}
		
		public boolean update(BoardDTO boardDTO , String bno) {
			for(String b : bRepository.keySet()) {
				if(bRepository.get(b).getBno().equals(bno)) {
					BoardDTO a = bRepository.get(b);
					a.setTitle(boardDTO.getTitle());
					a.setWriter(boardDTO.getWriter());
					return true;
				}
			}
			return false;
					
		}
		
		// 선생님이 만든 삭제
		public boolean delete(String bno) {
			for(String b : bRepository.keySet()) {
				if(bRepository.get(b).getBno().equals(bno)) {
					bRepository.remove(b);
					return true;
				}
			}
			return false;
		}
}