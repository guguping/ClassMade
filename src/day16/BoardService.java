package day16;

import java.util.ArrayList;
import java.util.Comparator;
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
		if(br.save(boardDTO)) {
			System.out.println("업로드 완료");
		}else {
			System.out.println("업로드 실패");
		}
	}

	public void findAll() {

		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
		System.out.println("==============================================");
		Map<String, BoardDTO> mapList = br.findAll();
		ArrayList<String> keyset = new ArrayList<>(mapList.keySet());
		// keyset이라는 리스트를 선언하고 = ArrayList에 매개변수로 Map.keyset을 사용해 
		// 								Map.keyset으로 이루어진 ArrayList를 만들었다
		keyset.sort(Comparator.naturalOrder());
		// ArrayList는 저장하면서 저장공간이 늘어나고 sort는 정렬한다
		for (String u : keyset) {
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
			System.out.print("수정할 제목 >");
			String updateTitle = sc.nextLine();
			System.out.print("수정할 작성자 >");
			String updateWriter = sc.nextLine();
			if (br.update(bno , updateTitle , updateWriter )) {
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
		System.out.print("작성자글 검색 >");
		String usearch = sc.next();
		sc.nextLine();
		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
		System.out.println("==============================================");
		if (br.search(usearch).size() == 0) {
			System.out.println("없는 작성자입니다");
			System.out.println();
		} else if (br.search(usearch).size() != 0) {
			for (BoardDTO b : br.search(usearch)) {
				b.print();
			}
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