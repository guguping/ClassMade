package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//담은 정보를 가공하는 곳

import day11.BoardDTO;

public class BoardService {
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);

	public void save() {
		BoardDTO boardDTO = new BoardDTO();
		System.out.print("제목 >");
		boardDTO.setTitle(sc.nextLine());
		System.out.print("작성자 >");
		boardDTO.setWriter(sc.next());
		sc.nextLine();
		br.save(boardDTO);
	}

	public void findAll() {
		
		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
		System.out.println("==============================================");
		Map<String, BoardDTO> mapList = br.findAll();
		ArrayList<String> keyset = new ArrayList<>(mapList.keySet());
		keyset.sort(Comparator.naturalOrder());
		for (String u : keyset ) {
			mapList.get(u).print();
		}
	}

	public void findById() {
		System.out.println("읽을 글 번호");
		String bno = sc.next();
		sc.nextLine();
		BoardDTO boardDTO = br.findById(bno);
		if (boardDTO == null) {
			System.out.println("찾을 수 없는 글입니다");
		} else {
			boardDTO.increasesetCnt();
			System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
			System.out.println("==============================================");
			boardDTO.print();
		}
	}

	public void update() {
		System.out.print("수정 글 번호>");
		String bno = sc.nextLine();
		BoardDTO b = br.findById(bno);
		if (b == null) {
			System.out.println("찾을 수 없는 글입니다");
		} else {
			BoardDTO boardDTO = new BoardDTO();
			System.out.print("수정할 제목 >");
			boardDTO.setTitle(sc.nextLine());
			System.out.print("수정할 작성자 >");
			boardDTO.setWriter(sc.nextLine());
			if (br.update(boardDTO, bno)) {
				System.out.println("업데이트 완료!");
			} else {
				System.out.println("업데이트 실패!");
			}
		}
	}

	// 선생님이 만든 삭제
	public void delete() {
		System.out.println("삭제할 글 번호");
		String bno = sc.next();
		sc.nextLine();
		if (br.delete(bno)) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		}
	}

	public void test() {
		for (int i = 1; i <= 5; i++) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("title" + i);
			boardDTO.setWriter("write" + i);
			br.save(boardDTO);
		}
	}
	public void search() {
	System.out.println("작성자글 검색 >");
	String usearch = sc.next();sc.nextLine();
	List<BoardDTO> list = br.search(usearch);
	System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
	System.out.println("==============================================");
	for(BoardDTO b : list) {
		b.print();
	}
}
	
//	public void seach() {
//		System.out.println("작성자글 검색 >");
//		String useach = sc.next();sc.nextLine();
//		List<BoardDTO> list = br.seach(useach);
//
//		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
//		System.out.println("==============================================");
//		for(BoardDTO b : list) {
//			b.print();
//		}
//	}
}