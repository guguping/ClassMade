package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day8.User2;

public class Visitor {
	private String username;
	private String id;
	private String pw;
	private int price = 5000;
	private int price1 = 5000;
	private int price2 = 5000;
	private int quantity;

	private int balance = 0;
	private List<String> breakdown = new ArrayList<>();

	public Visitor() {

	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice() {
		this.price = price * quantity;
	}

	public int getPrice1() {
		return price1;
	}

	public void setPrice1(int price1) {
		this.price1 = price1;
	}

	public int getPrice2() {
		return price2;
	}

	public void setPrice2(int price2) {
		this.price2 = price2;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public void setId(List<Visitor> list, int max) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean find = false;
			String id = sc.next();
			if (id.length() > max) {
				System.out.print("아이디는" + max + "글자 이상 사용 불가!\n다시입력 >");
				find = true;
			}
			for (Visitor s : list) {
				if (s.getId().equals(id)) {
					System.out.println("중복된 아이디입니다\n다시입력 >");
					find = true;
				}
			}
			if (!find) {
				this.id = id;
				break;
			}
		}
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int money) {
		this.balance = money;
	}
	
}
