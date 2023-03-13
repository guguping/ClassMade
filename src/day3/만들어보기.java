package day3;

import java.util.Scanner;

import day2.반복문_break_continue;

public class 만들어보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int bab = 3000;
		int la = 4500;
		int je = 7500;
		long hab = 0;

		boolean r = true;
		while (r) {
			System.out.println("====키오스크====");
			System.out.print("얼마를 투입하시겠습니까?>");
			int money = sc.nextInt();
			System.out.println("투입금액은 " + money + "원입니다");
			System.out.print("\n");
			
			while (r) {
					System.out.println("1.한식 2.중식 3.일식");
					System.out.print("음식 종류를 선택해주세요");
					int me = sc.nextInt();
					System.out.print("\n");
				if (me == 1) {
					System.out.println("1번.라면(4500원) 2번. 김밥(3000원) 3번.제육(7500원)");
					System.out.print("메뉴를 선택해주세요");
					int a = sc.nextInt();
					System.out.print("\n");
					if (a == 1) {
						System.out.println("라면을 선택하셨습니다 현재 누적 금액은" + (hab + la) + "입니다");
						hab = hab + la;
						System.out.println("예상 반환 금액은" + (money - hab) + "입니다");
						System.out.print("\n");
						System.out.print("추가 구매를 원하시면 1 결제를 원하시면 2");
						int a1 = sc.nextInt();
						System.out.print("\n");
						if (a1 == 1) {
							continue;
						} else if (a1 == 2) {
							r = false;
						}
					} else if (a == 2) {
						System.out.println("김밥을 선택하셨습니다 현재 누적 금액은" + (hab + bab) + "입니다");
						hab = hab + bab;
						System.out.println("예상 반환 금액은" + (money - hab) + "입니다");
						System.out.print("\n");
						System.out.println("추가 구매를 원하시면 1 결제를 원하시면 2");
						int a2 = sc.nextInt();
						if (a2 == 1) {
							continue;
						} else if (a2 == 2) {
							r = false;
						}
					} else if (a == 3) {
						System.out.println("제육을 선택하셨습니다 현재 누적 음액은" + (hab + je) + "입니다");
						hab = hab + je;
						System.out.println("예상 반환 금액은" + (money - hab) + "입니다");
						System.out.print("\n");
						System.out.println("추가 구매를 원하시면 1 결제를 원하시면 2");
						int a3 = sc.nextInt();
						if (a3 == 1) {
							hab = hab += je;
							continue;
						} else if (a3 == 2) {
							r = false;
						}
					}
				} else if (me == 2) {
					System.out.println("1번.짜장3000원 2번.짬뽕4500원 3번.탕수육7500원");
					System.out.print("메뉴를 선택해주세요");
					int a = sc.nextInt();
					System.out.print("\n");
					if (a == 1) {
						System.out.println("짜장을 선택하셨습니다 현재 누적 금액은" + (hab + bab) + "입니다");
						hab = hab + bab;
						System.out.println("예상 반환 금액은" + (money - hab) + "입니다");
						System.out.print("\n");
						System.out.print("추가 구매를 원하시면 1 결제를 원하시면 2");
						int a1 = sc.nextInt();
						System.out.print("\n");
						if (a1 == 1) {
							continue;
						} else if (a1 == 2) {
							r = false;
						}
					} else if (a == 2) {
						System.out.println("짬뽕을 선택하셨습니다 현재 누적 금액은" + (hab + la) + "입니다");
						hab = hab + la;
						System.out.println("예상 반환 금액은" + (money - hab) + "입니다");
						System.out.print("\n");
						System.out.println("추가 구매를 원하시면 1 결제를 원하시면 2");
						int a2 = sc.nextInt();
						if (a2 == 1) {
							continue;
						} else if (a2 == 2) {
							r = false;
						}
					} else if (a == 3) {
						System.out.println("탕수육을 선택하셨습니다 현재 누적 음액은" + (hab + je) + "입니다");
						hab = hab + je;
						System.out.println("예상 반환 금액은" + (money - hab) + "입니다");
						System.out.print("\n");
						System.out.println("추가 구매를 원하시면 1 결제를 원하시면 2");
						int a3 = sc.nextInt();
						if (a3 == 1) {
							hab = hab += je;
							continue;
						} else if (a3 == 2) {
							r = false;
						}
					}
				} else if (me == 3) {
					System.out.println("1번.기본돈(4500원) 2번.치즈돈(3000원) 3번.고구마돈(7500원)");
					System.out.print("메뉴를 선택해주세요");
					int a = sc.nextInt();
					System.out.print("\n");
					if (a == 1) {
						System.out.println("기본돈을 선택하셨습니다 현재 누적 금액은" + (hab + la) + "입니다");
						hab = hab + la;
						System.out.println("예상 반환 금액은" + (money - hab) + "입니다");
						System.out.print("\n");
						System.out.print("추가 구매를 원하시면 1 결제를 원하시면 2");
						int a1 = sc.nextInt();
						System.out.print("\n");
						if (a1 == 1) {
							continue;
						} else if (a1 == 2) {
							r = false;
						}
					} else if (a == 2) {
						System.out.println("김밥을 선택하셨습니다 현재 누적 금액은" + (hab + bab) + "입니다");
						hab = hab + bab;
						System.out.println("예상 반환 금액은" + (money - hab) + "입니다");
						System.out.print("\n");
						System.out.println("추가 구매를 원하시면 1 결제를 원하시면 2");
						int a2 = sc.nextInt();
						if (a2 == 1) {
							continue;
						} else if (a2 == 2) {
							r = false;
						}
					} else if (a == 3) {
						System.out.println("제육을 선택하셨습니다 현재 누적 금액은" + (hab + je) + "입니다");
						hab = hab + je;
						System.out.println("예상 반환 금액은" + (money - hab) + "입니다");
						System.out.print("\n");
						System.out.println("추가 구매를 원하시면 1 결제를 원하시면 2");
						int a3 = sc.nextInt();
						if (a3 == 1) {
							hab = hab += je;
							continue;
						} else if (a3 == 2) {
							r = false;
						}

					}

				}
				System.out.println("거스름돈은" + (money - hab) + "입니다 \n이용해 주셔서 감사합니다");
			}

		}
	}
}
