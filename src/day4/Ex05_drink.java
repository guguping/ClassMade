package day4;

import java.util.Scanner;

public class Ex05_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int balance = 0;
		int a = 1000;
		int b = 1200;
		int c = 1500;
//		int min = Math.min(Math.min(a, b), c);
		while (true) {
			System.out.printf("====자판기==== 현재잔액 : %,d\n", balance);
			System.out.println("1.콜라 (" + a + ")" + "2.사이다 (" + b + ")" + "3.우유 (" + c + ")" + "4.충전");
			System.out.println("");
			System.out.print("메뉴 선택 >");
			int menu = sc.nextInt();
			System.out.println("");

			if (menu <= 0 || menu > 4) {
				System.out.println("1~4까지의 메뉴만 선택 가능합니다\n");
				continue;
			} else if (balance < 1000 && menu != 4) {
				System.out.println("최소 주문 가능금액은 1000원입니다");
				System.out.print("충전하시겠습니까?1 (Y/N)");
				String p = sc.next();
				if (p.equals("y") || p.equals("Y")) {
					System.out.print("충전금액을 입력해주세요1 >");
					int pp = sc.nextInt();
					if (pp > 0) {
						System.out.println("");
						balance = balance + pp;
						// System.out.println("나는 pp");
						continue;
					} else if (pp < 0) {
						System.out.println("잔머리 금지\n");
						continue;
					}
				} else if (p.equals("n") || p.equals("N")) {
					System.out.println("");
					continue;
				} else if (!(p.equals("n" + "N")) || !(p.equals("y" + "Y"))) {
					System.out.println("");
					continue;
				}
			} else if (menu == 1) {
				System.out.print("수량 > ");
				int quantiry = sc.nextInt();
				System.out.println("");
				int aq = a * quantiry;
				boolean con1 = true;
				
				if (quantiry <= 0) {
					continue;
				}
				while (con1) {
					if (balance < aq) {
						System.out.println((aq - balance) + "원 부족합니다2");
						System.out.printf("충전하시겠습니까?2 (Y/N)");
						String p1 = sc.next();
						System.out.println("");
						if (p1.equals("Y") || p1.equals("y")) {
							System.out.print("충전금액을 입력해주세요2 >");
							int pp1 = sc.nextInt();
							if (pp1 >= 0) {
								System.out.println("");
								balance = balance + pp1;
								// System.out.println("나는 pp1");
								continue;
							} else if (pp1 < 0) {
								System.out.println("잔머리 금지\n");
								continue;
							}
						} else if (p1.equals("N") || p1.equals("n")) {
							System.out.print("");
							break;
						} else if (!(p1.equals("n" + "y")) || !(p1.equals("Y" + "N"))) {
							System.out.print("");
							continue;
						}
					} else if (balance > aq || balance == aq) {
						System.out.println("콜라 구매 성공\n");
						con1 = false;
					} else if (balance < aq || balance < 0) {
						continue;
					}
					balance = balance - aq;
					// System.out.println(balance);
				}
			} else if (menu == 2) {
				System.out.print("수량 > ");
				int quantiry = sc.nextInt();
				System.out.println("");
				int bq = b * quantiry;
				boolean con1 = true;
				
				if (quantiry <= 0) {
					continue;
				}
				while (con1) {
					if (balance < bq) {
						System.out.println((bq - balance) + "원 부족합니다3");
						System.out.print("충전하시겠습니까?3 (Y/N)");
						String p1 = sc.next();
						System.out.println("");
						if (p1.equals("Y") || p1.equals("y")) {
							System.out.print("충전금액을 입력해주세요3 >");
							int pp1 = sc.nextInt();
							if (pp1 >= 0) {
								System.out.println("");
								balance = balance + pp1;
								// System.out.println("나는 pp1");
								continue;
							} else if (pp1 < 0) {
								System.out.println("잔머리 금지\n");
								continue;
							}
						} else if (p1.equals("N") || p1.equals("n")) {
							System.out.print("");
							break;
						} else if (!(p1.equals("n" + "y")) || !(p1.equals("Y" + "N"))) {
							System.out.print("");
							continue;
						}
					} else if (balance > bq || balance == bq) {
						System.out.println("사이다 구매 성공\n");
						con1 = false;
					} else if (balance < bq || balance < 0) {
						continue;
					}
					balance = balance - bq;
				}
			} else if (menu == 3) {
				System.out.print("수량 > ");
				int quantiry = sc.nextInt();
				System.out.println("");
				int cq = c * quantiry;
				boolean con1 = true;
				
				if (quantiry <= 0) {
					continue;
				}
				while (con1) {
					if (balance < cq) {
						System.out.println((cq - balance) + "원 부족합니다4");
						System.out.print("충전하시겠습니까?4 (Y/N)");
						String p1 = sc.next();
						System.out.println("");
						if (p1.equals("Y") || p1.equals("y")) {
							System.out.print("충전금액을 입력해주세요4 >");
							int pp1 = sc.nextInt();
							if (pp1 >= 0) {
								System.out.println("");
								balance = balance + pp1;
								// System.out.println("나는 pp1");
								continue;
							} else if (pp1 < 0) {
								System.out.println("잔머리 금지\n");
								continue;
							}
						} else if (p1.equals("N") || p1.equals("n")) {
							System.out.print("");
							break;
						} else if (!(p1.equals("n" + "y")) || !(p1.equals("Y" + "N"))) {
							System.out.print("");
							continue;
						}
					} else if (balance > cq || balance == cq) {
						System.out.println("우유 구매 성공\n");
						con1 = false;
					} else if (balance < cq || balance < 0) {
						continue;
					}
					balance = balance - cq;
					// System.out.println(balance);
				}
			} else if (menu == 4) {
				System.out.print("충전금액을 입력해주세요 >");
				int pp = sc.nextInt();
				System.out.println("");

				if (pp > 0) {
					balance = balance + pp;
				} else if (pp < 0) {
					System.out.println("잔머리 금지\n");
				}
			}
		}

	}

}

