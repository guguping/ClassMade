package Made_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class gameCharacterDTO {
	private static int bno = 1;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd");   
	
	private int str;
	private	int dex;
	private int lnt;
	private int luk;
	private int att;
	private double acc;
	private int hp;
	private int mp;
	private String name;
	private String joinDate;
	
	public gameCharacterDTO(Integer key) {
		this.bno++;
		this.joinDate = DTF.format(LocalDateTime.now());
		this.str = 1;
		this.dex = 1;
		this.lnt = 1;
		this.luk = 1;
		this.att = str + 1;
		this.acc = dex%2 +1;
		this.hp = str*2 + 100;
		this.mp = lnt*3 + 100;
		this.name = "GUPING";
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getLnt() {
		return lnt;
	}
	public void setLnt(int lnt) {
		this.lnt = lnt;
	}
	public int getLuk() {
		return luk;
	}
	public void setLuk(int luk) {
		this.luk = luk;
	}
	public int getAtt() {
		return att;
	}
	public void setAtt(int att) {
		this.att = att;
	}
	public double getAcc() {
		return acc;
	}
	public void setAcc(double acc) {
		this.acc = acc;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		
		return "┌─────────────────상태창─────────────────┐\n"+"\t\t\t\t\n\t공격력: " + att+ "\t명중률: " + acc + "\n\n\t체력: " + hp + "\t마나: " + mp + "\n\n\t이름: "+ name +"   생일: " + joinDate+"\n\n   str: " + str + "   dex: " + dex + "   lnt: " + lnt + "   luk: " + luk + "\n└───────────────────────────────────────┘";
	}
	
}
