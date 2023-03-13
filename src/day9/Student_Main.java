package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();

		while (true) {
			System.out.println("===============성적표 리스트==============");
			System.out.println("1.학생등록 2. 리스트 3.검색 4.수정 5.삭제 0.종료");
			System.out.print("메뉴선택 >");
			int menu = sc.nextInt();
			System.out.println();

			if (menu == 1) {
				Student student = new Student();
				System.out.print("이름 >");
				student.setName(sc.next());
				System.out.print("비밀 번호 >");
				student.setPw(sc.next());
				System.out.print("국어 점수 >");
				student.setKor(sc.nextInt());
				System.out.print("영어 점수 >");
				student.setEng(sc.nextInt());
				System.out.print("수학 점수 >");
				student.setMat(sc.nextInt());
				student.setTotal();
				student.setAvg();
				student.setGrade();
				list.add(student);
				System.out.println(student.getName() + "님 등록되었습니다\n");
			} else if (menu == 2) {
				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("-----------------------------------------------------------");
				for (Student s : list) {
					s.print();
				}
			} else if (menu == 3) {
				System.out.print("학번 입력 >");
				String src = sc.next();
				System.out.print("비밀번호 입력 >\n");
				String pw = sc.next();
				boolean find = false;
				for (Student s : list) {
					if (s.getSno().equals(src)) {
						if (s.getPw().equals(pw)) {
							System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
							System.out.println("-----------------------------------------------------------");
							s.print();
							find = true;
						}
					}
				}
				if(!find) {
					System.out.println("입력 정보를 확인해주세요\n");
				}

			} else if (menu == 4) {
				System.out.print("학번 입력 >");
				String src = sc.next();
				System.out.print("비밀 번호입력 >");
				String pw = sc.next();
				boolean find = false;
				for (Student s : list) {
					if (s.getSno().equals(src)) {
						if (s.getPw().equals(pw)) {
							System.out.print("국어 점수 >");
							s.setKor(sc.nextInt());
							System.out.print("영어 점수 >");
							s.setEng(sc.nextInt());
							System.out.print("수학 점수 >");
							s.setMat(sc.nextInt());
							s.setTotal();
							s.setAvg();
							s.setGrade();
							System.out.println(s.getName()+"님 정보 수정 완료!\n");
							find = true;
						}
					}
				}
				if(!find) {
					System.out.println("입력 정보를 확인해주세요\n");
				}

			} else if (menu == 5) {
				System.out.print("학번 입력 >");
				String src = sc.next();
				System.out.print("비밀 번호입력 >");
				String pw = sc.next();
				boolean find = false;
				for (Student s : list) {
					if (s.getSno().equals(src)) {
						if (s.getPw().equals(pw)) {
							System.out.println(s.getName()+"님 삭제 완료!\n");
							list.remove(s);
							find = true;
							break;
						}
					}
				}
				if(!find) {
					System.out.println("입력 정보를 확인해주세요\n");
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("없는 메뉴입니다\n");
			}
		}
		System.out.println("없는 메뉴입니다\n");
	}

}
