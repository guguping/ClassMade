package day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex03_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] name = new String[100];
		String[] account = new String[100];
		String[] date = new String[100];
		int[] balance = new int[100];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		int cnt = 0;
		int index = 0;
		int index1 = 0;

		while (true) {
			System.out.println("====인천일보은행====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌이체 5.계좌 목록 0.종료");
			System.out.print("메뉴선택 >");
			int menu = sc.nextInt();
			System.out.println("");

			if (menu == 1) {
				System.out.print("예금주명 >");
				name[cnt] = sc.next();
				System.out.print("계좌 번호 >");
				account[cnt] = sc.next();
				System.out.print("초기입금 금액 >");
				balance[cnt] = sc.nextInt();
				LocalDateTime now = LocalDateTime.now();
				date[cnt] = dtf.format(now);
				System.out.println(name[cnt] + "님 계좌가 계설되었습니다!");
				cnt++;
			} else if (menu == 2) {
				System.out.print("입금 계좌 >");
				String dAccount = sc.next();
				System.out.print("입금 금액 >");
				int depposit = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (dAccount.equals(account[i])) {
						balance[i] += depposit;
						System.out.println("입금 완료!");
						break;
					} else if (i == cnt - 1) {
						System.out.println("잘못된 계좌입니다");
					}
				}

			} else if (menu == 3) {
				System.out.print("출금 계좌 >");
				String wAccount = sc.next();
				System.out.print("출금 금액 >");
				int withdraw = sc.nextInt();
				boolean accountCheck = false;

				for (int i = 0; i < cnt; i++) {
					if (wAccount.equals(account[i])) {
						if (balance[i] >= withdraw) {
							balance[i] -= withdraw;
							System.out.println("출금 완료");
						} else {
							System.out.println("잔액 부족");
						}
						accountCheck = true;
						break;
					}
				}
				if (!accountCheck) {
					System.out.println("잘못된 계좌 번호입니다");
				}
			} else if (menu == 4) {
				int fa = 0;
				System.out.print("출금 계좌 >");
				String wAccount = sc.next();
				System.out.print("입금 계좌 >");
				String dAccount = sc.next();
				System.out.print("이체 금액 > ");
				int money = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (wAccount.equals(account[i])) {
						index = i;
					}
					if (dAccount.equals(account[i])) {
						index1 = i;
					} else if (i == cnt - 1) {
						System.out.println("계좌 확인 필요");
						fa = 1;
						break;
					}
				}
				if (balance[index] >= money && fa == 0) {
					balance[index] -= money;
					balance[index1] += money;
					System.out.println("이체 성공!\n");
					System.out.println(name[index] + "님 계좌 잔액은" + balance[index] + "입니다1");
					System.out.println(name[index1] + "님 계좌 잔액은" + balance[index1] + "입니다2");
				} else if (!(balance[index] >= money )&& fa == 0) {
					System.out.println("잔액이 부족합니다\n");
				}

			} else if (menu == 5) {
				System.out.println("이름\t계좌번호\t계좌잔액\t계좌생성일\t");
				System.out.println("----------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\t%s\n", name[i], account[i], balance[i], date[i]);
					System.out.println("");
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.print("다시 입력");
			}
		}
		System.out.println("프로그램 종료");
	}

}