package day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bank {
	private static int number = 1000;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM//dd hh:mm:ss");

	private String account;
	private String name;
	private long balance;
	private List<String> breakdown = new ArrayList<>(); // 내역을 집어 넣을 참조형 변수 기본변수가 null이기 떄문에 어레이를 꼭 해줘야함

	public void deposit(int money) {
		this.balance += money;
		String date = DTF.format(LocalDateTime.now());
		String str = "입금\t"+money+"\t잔액:"+balance+"\t"+date;
		breakdown.add(str);
	}
	
	public boolean withdraw(int money) {
		boolean result = false;
		if(this.balance >= money) {
			this.balance -= money;
			String date = DTF.format(LocalDateTime.now());
			String str = "출금\t"+money+"\t잔액:"+balance+"\t"+date;
			breakdown.add(str);
			result = true;
		}
		return result;
	}
	
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = number++ + "-" + account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
		String date = DTF.format(LocalDateTime.now());
		String str = "입금\t"+balance+"\t잔액:"+balance+"\t"+date;
		breakdown.add(str);
	}

	public List<String> getBreakdown() {
		return breakdown;
	}

	public void setBreakdown(List<String> breakdown) {
		this.breakdown = breakdown;
	}
	
	public void breakdownPrint() {
		System.out.println("구분\t금액\t거래후잔액\t\t거래날짜");
		System.out.println("----------------------------------------------");
		for(String s : breakdown) {
			System.out.println(s);
		}
	}


	public void print() {
		System.out.printf("%s\t%s\t%d\n", account, name, balance);
	}

}
