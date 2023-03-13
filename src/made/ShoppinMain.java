package made;

import java.util.*;

import day9.Student;

public class ShoppinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Visitor> userList = new ArrayList<>();
		List<Shopping> shopList = new ArrayList<>();
		boolean login = false;
		Scanner sc = new Scanner(System.in);
		Utill utill = new Utill();
		int p = 0;
		Shopping Index = null;
		String userIndex1 = "";
		while (true) {
			if (login) {
				System.out.println("=========" + userIndex1 + "님========");
				System.out.println("1.상품목록 2.상품검색 3.주문내역 4.로그아웃 0.종료");
				System.out.print("메뉴선택> ");
			} else if (!login) {
				System.out.println("=========쇼핑몰==========");
				System.out.println("1.회원가입 2.로그인 3.회원리스트 4.ID찾기 5.PW찾기  0.나가기");
				System.out.print("메뉴 > ");
			}
			int menu = utill.numberCheck();
			if (menu == 1) {
				if (login) {
					while (true) {
						System.out.printf("상품번호\t상품명\t남은수량\t가격\t올린시간\n");
						for (Shopping s : shopList) {
							s.print();
						}
						System.out.print("1.주문하기 2.뒤로가기 >");
						int usermenu = utill.numberCheck();
						if (usermenu == 1) {
							System.out.print("상품 번호 >");
							usermenu = utill.numberCheck();
							for (Shopping s : shopList) {
								if (usermenu == s.getBno()) {
									System.out.print("수량 >");
									int ccnt = sc.nextInt();
									if (ccnt <= s.getCnt()) {
										s.setCnt(s.getCnt() - ccnt);
										Index = s;
										System.out.println("주문 완료!");
										break;
									} else {
										System.out.println(s.getCnt() + "개이하 구매가능");
										break;
									}
								} else {
									System.out.println("없는 상품입니다.");
									continue;
								}
							}
						} else if (usermenu == 2) {
							break;
						} else {
							System.out.println("없는 메뉴입니다");
						}
					}
				} else if (!login) {
					Visitor visitor = new Visitor();
					System.out.print("이름 입력 > ");
					visitor.setName(sc.next());
					System.out.print("ID 입력 > ");
					visitor.setId(userList, 7);
					System.out.print("PW 입력 > ");
					visitor.setPw(sc.next());
					System.out.print("연락처 입력 > ");
					visitor.setPhone(sc.next());
					userList.add(visitor);
					System.out.println(visitor.getName() + "님의 회원 가입을 축하 드립니다.");
				}
			} else if (menu == 2) {
				if (login) {
					System.out.print("검색할 상품을 입력해주세요 > ");
					String searchTitle = sc.next();
					boolean find = false;
					for (Shopping s : shopList) {
						if (searchTitle.equals(s.getTitle())) {
							System.out.printf("상품번호\t상품명\t남은수량\t가격\t올린시간\n");
							s.print();
							find = true;
							break;
						}
						if (!find) {
							System.out.println("상품명이 없습니다");
						}
					}

				} else if (!login) {
					boolean idCheck = false;
					boolean pwCheck = false;
					System.out.print("로그인할 id를 입력해주세요 > ");
					String loginId = sc.next();
					for (Visitor v : userList) {
						if (loginId.equals(v.getId())) {
							idCheck = true;
							userIndex1 = v.getName();
						}
					}
					System.out.print("로그인할 pw를 입력해주세요 > ");
					String loginPw = sc.next();
					for (Visitor v : userList) {
						if (loginPw.equals(v.getPw())) {
							pwCheck = true;
						}
					}
					if (!idCheck || !pwCheck) {
						System.out.println("id또는 pw를 확인해주세요");
						continue;
					}
					System.out.println("로그인성공");
					login = true;
				}
			} else if (menu == 3) {
				if (login) {
					System.out.printf("상품번호\t상품\t구매수량\t가격\t구매시간\n");
//					System.out.println(Index);
					for(Shopping s : shopList)
						if(s.equals(Index)) {
							s.print1();
						}else {
							System.out.println("주문내역 없음");
						}
				} else if (!login) {
					System.out.println("이름\tID\tPW\t회원번호\t휴대폰번호\t\t가입일");
					for (Visitor s : userList) {
						s.print();
					}
				}

			} else if (menu == 4) {
				if (login) {
					System.out.println("로그아웃 완료");
					login = false;
				} else if (!login) {
					boolean phoneCheck = false;
					while (!phoneCheck) {
						System.out.print("찾고자 하는 유저의 연락처를 입력해주세요 > ");
						String phone = sc.next();
						for (Visitor v : userList) {
							if (phone.equals(v.getPhone())) {
								System.out.println("찾고자 하는 유저의 id는 " + v.getId() + " 입니다.");
								phoneCheck = true;
								break;
							}
						}
						if (!phoneCheck) {
							System.out.println("등록된 전화가 없습니다.");
						}
					}

				}

			} else if (menu == 5) {
				if (!login) {
					boolean find = false;
					while (!find) {
						System.out.print("찾고자 하는 유저의 연락처를 입력해주세요 > ");
						String serachPhone = sc.next();
						System.out.print("찾고자 하는 유저의 아이디를 입력해주세요 > ");
						String searchId = sc.next();
						for (Visitor v : userList) {
							if (serachPhone.equals(v.getPhone()) && searchId.equals(v.getId())) {
								System.out.println("찾고자하는 유저의 비밀번호는" + v.getPw() + "입니다.");
								find = true;
								break;
							}
						}
						if (!find) {
							System.out.println("아이디 또는 연락처를 확인해주세요");
						}
					}
				}
			} else if (menu == 999) {
				boolean pwCheck = false;
				System.out.print("로그인할 pw를 입력해주세요 > ");
				int loginPw = sc.nextInt();
				if (loginPw == Visitor.gmpw) {
					pwCheck = true;
				}
				if (!pwCheck) {
					System.out.println("pw를 확인해주세요");
					continue;
				}
				System.out.println("로그인성공");

				while (true) {
					System.out.println("=========관리자==========");
					System.out.println("1. 상품등록 2.상품목록 3.상품검색 4.상품수정 5.상품삭제 6.로그아웃 0.관리자 생성");
					System.out.print("메뉴선택> ");
					int gmmenu = utill.numberCheck();
					if (gmmenu == 1) {
						System.out.print("상품등록할 품명을 적어주세요 > ");
						String title = sc.next();
						System.out.print("상품등록할 수량을 적어주세요 > ");
						int cnt = sc.nextInt();
						System.out.print("상품의 가격을 입력해주세요 > ");
						int cell = sc.nextInt();
						Shopping shopping = new Shopping(title, cnt, cell);
						shopList.add(shopping);
						System.out.println("상품등록 완료");
					} else if (gmmenu == 2) {
						System.out.printf("상품번호\t상품명\t남은수량\t가격\t올린시간\n");
						for (Shopping s : shopList) {
							s.print();
						}
					} else if (gmmenu == 3) {
						System.out.print("검색할 상품을 입력해주세요 > ");
						String searchTitle = sc.next();
						boolean find = false;
						for (Shopping s : shopList) {
							if (searchTitle.equals(s.getTitle())) {
								System.out.printf("상품번호\t상품명\t남은수량\t가격\t올린시간\n");
								s.print();
								find = true;
								break;
							}
							if (!find) {
								System.out.println("상품명이 없습니다");
							}
						}
					} else if (gmmenu == 4) {
						System.out.print("수정할 상품번호를 입력하세요 > ");
						int edit = sc.nextInt();
						boolean find2 = false;
						for (Shopping s : shopList) {
							if (edit == s.getBno()) {
								System.out.print("수정할 상품명을 입력하세요 > ");
								s.setTitle(sc.next());
								System.out.print("수정할 수량을 입력하세요 > ");
								s.setCnt(sc.nextInt());
								System.out.print("수정할 가격을 입력하세요 > ");
								s.setCell(sc.nextInt());
								System.out.println(s.getBno() + "의 정보 수정완료");
								find2 = true;
								break;
							}
						}
						if (!find2) {
							System.out.println("상품번호가 잘못되었습니다");

						}
					} else if (gmmenu == 5) {
						System.out.print("삭제할 상품번호를 입력하세요 > ");
						int deleteBno = sc.nextInt();
						boolean find = false;
						for (Shopping s : shopList) {
							if (deleteBno == s.getBno()) {
								System.out.println(s.getBno() + "번의 " + s.getTitle() + "이(가) 삭제되었습니다");
								shopList.remove(s);
								find = true;
								break;
							}
						}
						if (!find) {
							System.out.println("상품번호가 잘못되었습니다");
						}
					} else if (gmmenu == 6) {
						break;
					} else if (gmmenu == 0) {

					}
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("숫자를 다시 입력해주세요");
			}

		}

		System.out.println("프로그램이 종료되었습니다.");
	}
}
