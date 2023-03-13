package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Bank> list = new ArrayList<>();

		while (true) {
			System.out.println("======================은행======================");
			System.out.println("1.계좌 생성 2.리스트 3.입금 4.출금 5.계좌이체 6.조회 0.종료");
			System.out.print("메뉴 선택 >");
			int menu = sc.nextInt();

			if (menu == 1) {
				Bank bank = new Bank();
				System.out.print("계좌 번호 >");
				bank.setAccount(sc.next());
				System.out.print("예금주 > ");
				bank.setName(sc.next());
				System.out.print("초기입금 금액 >");
				bank.setBalance(sc.nextLong());
				list.add(bank);
				System.out.println("계좌 생성 완료!");
			} else if (menu == 2) {
				System.out.println("계좌번호\t\t예금주\t잔액");
				System.out.println("--------------------------------------");
				for (Bank b : list) {
					b.print();
					System.out.println();
				}
			} else if (menu == 3) {
				System.out.println("입금 계좌 >");
				String account = sc.next();
				boolean find = false;
				for (Bank b : list) {
					if (account.equals(b.getAccount())) {
						System.out.println("입금 금액 >");
						int money = sc.nextInt();
						b.deposit(money);
						System.out.println("입금 완료!");
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("계좌번호를 확인해주세요");
				}
			} else if (menu == 4) {
				System.out.println("출금 계좌");
				String account = sc.next();
				boolean find = false;
				for (Bank b : list) {
					if (account.equals(b.getAccount())) {
						System.out.println("출금 금액>");
						int money = sc.nextInt();
						if (b.withdraw(money)) {
							System.out.println("출금 완료");
							find = true;
							break;
						} else {
							System.out.println("잔액이 부족합니다.");
						}
					}
				}
				if (!find) {
					System.out.println("계좌 번호를 확인해주세요");
				}

			} else if (menu == 5) {
				System.out.println("출금 계좌 >");
				String account = sc.next();
				System.out.println("이체 계좌 >");
				String account1 = sc.next();

				Bank w = null;
				Bank d = null;

				for (Bank b : list) {
					if (account.equals(b.getAccount())) {
						w = b;
					}
					if (account1.equals(b.getAccount())) {
						d = b;
					}
				}
				if (w == null) {
					System.out.println("출금계좌 없음");
				} else if (d == null) {
					System.out.println("입금계좌 없음");
				} else {
					System.out.println("계좌이체 금액 >");
					int money = sc.nextInt();
					if (w.withdraw(money)) {
						d.deposit(money);
						System.out.println("계좌 이체 완료");
					} else {
						System.out.println("잔액부족");
					}
				}

//				boolean find = false;
//				for (Bank b : list) {
//					if (account.equals(b.getAccount())) {
//						System.out.println("이체 금액 >");
//						int money = sc.nextInt();
//					} else if (account >= money) {
//						b.withdraw(money);
//					} else {
//						System.out.println("잔액이 부족합니다");
//					}
//					if (account1.equals(b.getAccount())) {
//						System.out.println("이체 완료!");
//						b.deposit(money);
//						find = true;
//						break;
//					}
//
//				}
//				
//				if (!find) {
//					System.out.println("계좌 확인 필요!");
//				}

			} else if (menu == 6) {
				System.out.println("조회할 계좌 번호 >");
				String searchAccount = sc.next();
				boolean find = false;
				for (Bank b : list) {
					if (searchAccount.equals(b.getAccount())) {
						b.breakdownPrint();
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("계좌번호를 확인해주세요");
				}

			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("없는 메뉴 입니다.");
			}
		}

	}
}
