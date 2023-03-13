package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Board> list = new ArrayList<>();

		while (true) {
			System.out.println("==============게시판==============");
			System.out.println("1.게시물등록 2.리스트 3.읽기 4.수정 5.삭제 0.종료");
			System.out.println("메뉴선택 >");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.println("제목");
				String title = sc.nextLine();
				System.out.println("작성자");
				String writer = sc.next();
				System.out.println("비밀번호 입력 >");
				String pw = sc.next();
				Board board = new Board(title, writer, pw);
				list.add(board);
				System.out.println(title + "이(가) 등록되었습니다");

			} else if (menu == 2) {
				System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
				System.out.println("----------------------------------------------------");
				for (Board b : list) {
					b.print();
				}
			} else if (menu == 3) {
				System.out.println("읽을 글 번호 >");
				int bno = sc.nextInt();
				System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
				System.out.println("----------------------------------------------------");
				boolean find = false;
				for (Board b : list) {
					if (bno == b.getBno()) {
						b.increaseCnt();
						b.print();
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("조회할 수 없는 글번호입니다");
				}

			} else if (menu == 4) {
				boolean find = false;
				System.out.println("수정할 글 번호 >");
				int updateBno = sc.nextInt();sc.nextLine();
				// 글을 입력하면 버퍼라는곳에 저장하는데 입력할때 사용하는 엔터까지 값으로 친다
				// 하지만 책제목의 nextLine은 엔터까지 먹어버리기 떄문에
				// 남은 엔터의 값을 없애줄 nextLine을 만들어줘야한다
				System.out.println("비밀번호 >");
				String updatePw = sc.next();sc.nextLine();
				for (Board up : list) {
					if (updateBno == up.getBno()) {
						if (updatePw.equals(up.getPw())) {
							System.out.println("수정할 제목 >");
							String updateTitle = sc.nextLine();
							System.out.println("수정할 작성자 >");
							String updateWriter = sc.next();
							up.setTitle(updateTitle);
							up.setWriter(updateWriter);
							System.out.println("글 수정 완료!");
							find = true;
							break;
						}
					}
				}
				if (!find) {
					System.out.println("글 번호 또는 비밀번호를 확인해주세요");
				}

			} else if (menu == 5) {
				System.out.println("삭제할 글번호 >");
				int deleteBno = sc.nextInt();
				System.out.println("비밀번호 >");
				String deletePw = sc.next();
				for(Board b : list) {
					if (deleteBno == b.getBno() && deletePw.equals(b.getPw())){
						System.out.println(b.getTitle()+" 이(가) 삭제되었습니다");
						list.remove(b);
						break;
					}
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램종료");
	}

}
