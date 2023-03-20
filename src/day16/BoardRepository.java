package day16;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import day11.BoardDTO;



public class BoardRepository {
	private Map<String, BoardDTO> bRepository = new HashMap<>();
	ArrayList<String> keyset = new ArrayList<>(bRepository.keySet());
	
	public boolean save(BoardDTO boardDTO) {
		BoardDTO result = bRepository.put(boardDTO.getBno(), boardDTO);
		if (result == null) {
			return true;
		} else {
			return false;
		}
	}

	public Map<String, BoardDTO> findAll() {
		return bRepository;
	}

	public BoardDTO findById(String bno) {
		/*
		 * map 반복문 돌리고
		 * bno와 일치하는 객체를 찾고
		 * 찾으면 리턴
		 */
		for (String b : bRepository.keySet()) {
			if (bRepository.get(b).getBno().equals(bno)) {
				//bRepository.get(b)는 벨류값이 객체이기 때문에 객체까지만 접근되고
				// 뒤에 .getBno를 작성해야 벨류값인 boardDTO안에 있는 Bno로 접근 가능하다
				return bRepository.get(b);
			}
		}
		return null;
	}

	public boolean update(String bno, String updateTitle, String updateWriter) {
		for (String b : bRepository.keySet()) {
			if (bRepository.get(b).getBno().equals(bno)) {
				bRepository.get(b).setTitle(updateTitle);
				bRepository.get(b).setWriter(updateWriter);
				return true;
			}
		}
		return false;
	}
	// 선생님이 만든 삭제
	public boolean delete(String bno) {
		for (String b : bRepository.keySet()) {
			if (bRepository.get(b).getBno().equals(bno)) {
				bRepository.remove(b);
				return true;
			}
		}
		return false;
	}

//		public List<BoardDTO> search(String usearch) {
//			ArrayList<BoardDTO> b = new ArrayList<>();
//			for(String m : bRepository.keySet()) {
//				if(bRepository.get(m).getWriter().equals(usearch)) {
//					BoardDTO boardDTO = new BoardDTO();
//					boardDTO = bRepository.get(m);
//					b.add(boardDTO);
//				}
//			}
//			return b;
//		}

	public List<BoardDTO> search(String usearch) {
		ArrayList<BoardDTO> b = new ArrayList<>();
		ArrayList<String> search = new ArrayList<>(bRepository.keySet());
		search.sort(Comparator.naturalOrder());
		for (String m : search) {
			if (bRepository.get(m).getWriter().equals(usearch)) {
				b.add(bRepository.get(m));
			}
		}
		return b;
	}
}