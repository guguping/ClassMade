package Made_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class gameCharacterDTO {
	private Random rand = new Random();
	private static Integer bno = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MM/dd");

	private int str;
	private int dex;
	private int lnt;
	private int luk;
	private int att;
	private int arm;
	private int hp;
	private int mp;
	private long startTime;
	private long endTime;
	private long elapsedTime;
	private String name = "";
	private String joinDate;

	public gameCharacterDTO() {
		Random rand = new Random();
		this.name = "";

	}

	public gameCharacterDTO(Integer key) {
		this.bno = key;
		String[] raname = { "제임스", "나루토", "사스케", "포치타", "이은수" };
		this.joinDate = DTF.format(LocalDateTime.now());
		this.name = raname[rand.nextInt(raname.length)];
		if (key == 1) {
			this.str = 10 + rand.nextInt(21);
			this.dex = 10 + rand.nextInt(21);
			this.lnt = 10 + rand.nextInt(21);
			this.luk = 10 + rand.nextInt(21);
			this.att = str + 10;
			this.arm = 10 + (dex / 2);
		} else if (key == 2) {
			this.str = 5 + rand.nextInt(11);
			this.dex = 5 + rand.nextInt(11);
			this.lnt = 5 + rand.nextInt(11);
			this.luk = 5 + rand.nextInt(11);
			this.att = str + 5;
			this.arm = 5 + (dex / 2);
		} else if (key == 3) {
			this.str = 1;
			this.dex = 1;
			this.lnt = 1;
			this.luk = 1;
			this.att = str + 1;
			this.arm = 1 + (dex / 2);
		}
		this.hp = 100 + (str * 2);
		this.mp = 100 + (lnt * 3);
	}

	public void start() {
		startTime = System.currentTimeMillis();
		// 게임 시작 코드
	}

	public void end() {
		endTime = System.currentTimeMillis();
		// 게임 종료 코드
		this.elapsedTime = endTime - startTime;
	}

	public long getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBno() {
		return bno;
	}

	public int getStr() {
		return (int) str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return (int) dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getLnt() {
		return (int) lnt;
	}

	public void setLnt(int lnt) {
		this.lnt = lnt;
	}

	public int getLuk() {
		return (int) luk;
	}

	public void setLuk(int luk) {
		this.luk = luk;
	}

	public int getAtt() {
		return (int) att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public double getarm() {
		return arm;
	}

	public void setarm(double acc) {
		this.arm = (int) acc;
	}

	public int getHp() {
		return (int) hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return (int) mp;
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

		return "\n┌───────────── " + name + "의 상태창 ─────────────┐\n" + "\t\t\t\t\n\t공격력: " + att + "\t방어력: " + arm
				+ "\n\n\t체력: " + hp + "\t\t마나: " + mp + "\n\n\t이름: " + name + "     생일: " + joinDate + "\n\n   str: "
				+ str + "   dex: " + dex + "   lnt: " + lnt + "   luk: " + luk + "\n└───────────────────" + bno
				+ "───────────────────┘";
	}

}
