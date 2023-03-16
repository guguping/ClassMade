package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import day11.BoardDTO;
import day11.UserDTO;
import day15.StudentDTO;

public class BoardRepository {
	private Map<String, BoardDTO> bRepository = new HashMap<>();
	ArrayList<String> keyset = new ArrayList<>(bRepository.keySet());

	public void save(BoardDTO boardDTO) {
		bRepository.put(boardDTO.getBno(), boardDTO);
	}

	public Map<String, BoardDTO> findAll() {
		return bRepository;
	}

	public BoardDTO findById(String bno) {
		for (String b : bRepository.keySet()) {
			if (bRepository.get(b).getBno().equals(bno)) {
				BoardDTO a = bRepository.get(b);
				return a;
			}
		}
		return null;
	}

	public boolean update(BoardDTO boardDTO, String bno) {
		for (String b : bRepository.keySet()) {
			if (bRepository.get(b).getBno().equals(bno)) {
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
				BoardDTO boardDTO = new BoardDTO();
				boardDTO = bRepository.get(m);
				b.add(boardDTO);
			}
		}
		return b;
	}
}