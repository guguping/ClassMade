package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping_Main {

	private static final Visitor List = null;
	private static final Visitor String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Visitor> list = new ArrayList<>();
		boolean login = false;
		int a = 0;

		while (true) {
			if (login == false) {
				System.out.println("====인터넷 쇼핑====");
				System.out.println("1.회원가입 2.로그인 0.종료");
				System.out.print("메뉴 선택 >");
			} else if (login == true) {
				System.out.println("====인터넷 쇼핑====" + "P:" + a);
				System.out.println("1.상품 목록 2.충전 3.구매 목록 0.로그아웃");
				System.out.print("메뉴 선택 >");
			}
			int menu = sc.nextInt();

			if (menu == 1) {
				Visitor shopping = new Visitor();
				if (login == false) {
					System.out.print("이름 입력 >");
					shopping.setUsername(sc.next());
					System.out.print("아이디 입력 >");
					shopping.setId(list, 4);
					System.out.print("비밀번호 입력 >");
					shopping.setPw(sc.next());
					list.add(shopping);
					System.out.println("회원가입 완료");
				} else if (login == true) {
					while (true) {
						System.out.println("====인터넷 쇼핑====" + "P:" + a);
						System.out.println("1.모니터(5000P) 2.키보드(5000P) 3.마우스(5000P) 0.뒤로가기");
						System.out.print("메뉴 선택 >");
						int mainMenu = sc.nextInt();
						if (mainMenu == 1) {
							System.out.println("모니터(5000)을 선택하셨습니다");
							System.out.print("수량을 입력해주세요 >");
							shopping.setQuantity(sc.nextInt());
							System.out.print("구매하시겠습니까 ? Y/N >");
							String yn = sc.next();
							if (yn.equals("Y") || yn.equals("y")) {
								System.out.print("아이디 확인 >");
								String id = sc.next();
								for (Visitor s : list) {
									if (id.equals(s.getId())) {
										if (s.getBalance() >= s.getPrice() * shopping.getQuantity()) {
											s.setBalance(s.getBalance() - (s.getPrice() * shopping.getQuantity()));
											a = s.getBalance();
											System.out.println("구매 성공!");
										} else if (s.getBalance() < s.getPrice() * shopping.getQuantity()) {
											System.out.println("충전이 필요합니다");
										}
									}
								}
							} else if (yn.equals("N") || yn.equals("n")) {
								System.out.println("취소하였습니다");
							} else {
								System.out.println("없는 메뉴입니다");
							}
						} else if (mainMenu == 2) {
							System.out.println("키보드(5000)을 선택하셨습니다");
							System.out.print("수량을 입력해주세요 >");
							shopping.setQuantity(sc.nextInt());
							System.out.print("구매하시겠습니까 ? Y/N >");
							String yn = sc.next();
							if (yn.equals("Y") || yn.equals("y")) {
								System.out.print("아이디 확인 >");
								String id = sc.next();
								for (Visitor s : list) {
									if (id.equals(s.getId())) {
										if (s.getBalance() >= s.getPrice1() * shopping.getQuantity()) {
											s.setBalance(s.getBalance() - (s.getPrice1() * shopping.getQuantity()));
											a = s.getBalance();
											System.out.println("구매 성공!");
										} else if (s.getBalance() < s.getPrice1() * shopping.getQuantity()) {
											System.out.println("충전이 필요합니다");
										}
									}
								}
							} else if (yn.equals("N") || yn.equals("n")) {
								System.out.println("취소하였습니다");
							} else {
								System.out.println("없는 메뉴입니다");
							}
						} else if (mainMenu == 3) {
							System.out.println("마우스(5000)을 선택하셨습니다");
							System.out.print("수량을 입력해주세요 >");
							shopping.setQuantity(sc.nextInt());
							System.out.print("구매하시겠습니까 ? Y/N >");
							String yn = sc.next();
							if (yn.equals("Y") || yn.equals("y")) {
								System.out.print("아이디 확인 >");
								String id = sc.next();
								for (Visitor s : list) {
									if (id.equals(s.getId())) {
										if (s.getBalance() >= s.getPrice2() * shopping.getQuantity()) {
											s.setBalance(s.getBalance() - (s.getPrice2() * shopping.getQuantity()));
											a = s.getBalance();
											System.out.println("구매 성공!");
										} else if (s.getBalance() < s.getPrice2() * shopping.getQuantity()) {
											System.out.println("충전이 필요합니다");
										}
									}
								}
							} else if (yn.equals("N") || yn.equals("n")) {
								System.out.println("취소하였습니다");
							} else {
								System.out.println("없는 메뉴입니다");
							}

						} else if (mainMenu == 0) {
							break;
						} else {
							System.out.println("없는 메뉴입니다");
						}

					}
				}
			} else if (menu == 2) {
				if (login == false) {
					boolean find = false;
					System.out.print("아이디 입력 >");
					String userId = sc.next();
					System.out.print("비밀번호 입력 >");
					String userPw = sc.next();
					for (Visitor s : list) {
						if (userId.equals(s.getId()) && userPw.equals(s.getPw())) {
							System.out.println(s.getUsername() + "님 로그인 성공!");
							a = s.getBalance();
							find = true;
							login = true;
							break;
						}
					}
					if (!find) {
						System.out.println("입력 정보를 확인해주세요");
						login = false;
					}
				} else if (login == true) {
					boolean find = false;
					System.out.print("아이디 확인 >");
					String id = sc.next();
					for (Visitor s : list) {
						if (id.equals(s.getId())) {
							System.out.print("충전 금액 > ");
							int money = sc.nextInt();
							s.setBalance(s.getBalance() + money);
							a = s.getBalance();
							find = true;
							break;
						}
					}
					if (!find) {
						System.out.println("아이디를 확인해 주세요");
					}
				}

			} else if (menu == 0) {

				if (login == false) {
					System.out.println("종료합니다");
					break;
				} else if (login == true) {
					System.out.println("이용해주셔서 감사합니다");
					a = 0;
					login = false;
				}
			} else {
				System.out.println("없는 메뉴 입니다.");
			}
		}
	}
}
