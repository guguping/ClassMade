package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Map_BreakdownDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String account;
	private String division;
	private long dealMoney;
	private long totalMoney;
	private String dealDate;
	private static int dpo = 0;
	private static int wit = 0;
	
	public Map_BreakdownDTO() {
		this.dpo++;
		this.wit++;
		this.dealDate = DTF.format(LocalDateTime.now());
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public long getDealMoney() {
		return dealMoney;
	}
	public void setDealMoney(long dealMoney) {
		this.dealMoney = dealMoney;
	}
	public long getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(long totalMoney) {
		this.totalMoney = totalMoney;
	}
	public String toString() {
		String str = account +"\t"+ division +"\t"+ dealMoney +"\t"+ totalMoney +"\t"+ dealDate;
		return str;
	}
	public int getDpo() {
		return dpo;
	}
	public int getWit() {
		return wit;
	}
	public void getdw(Map_ClientDTO Account , long money , Integer key) {
		if(key == null) {
		Account.setBalance(Account.getBalance() + money);
		this.division = "입금";
		} else {
			Account.setBalance(Account.getBalance() - money);
		this.division = "출금";
		}
		this.account = Account.getAccount();
		this.dealMoney = money;
		this.totalMoney = Account.getBalance();
	}
}