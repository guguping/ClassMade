package Made_2;

import java.util.Random;

public class gameMonsterDTO {
	Random rand = new Random();
//	private static int mno = 0;

	private int modMon;
	private String mon1;
	private int mon1hp;
	private int mon1att;
	private int mon1arm;
	private int mon1hid;
	private String boss;
	private int bosshp;
	private int bossatt;
	private int bossarm;
	private int bosshid;
	private int monexp;
	private int monmm;
	private int bmonmm;
	private int monsterM;
	private static int room = 0;
	private static int bossroom = 0;

	public gameMonsterDTO() {
	}

	public gameMonsterDTO(Integer key) {
		String[] bossname = { "샌드 골렘", "아이언 골렘", "스톤 골렘" };
		if (key == 1) {
			this.modMon = 1;
			String[] raname = { "슬라임", "고블린", "타우렌" };
			this.mon1 = raname[rand.nextInt(raname.length)];
			this.mon1hp = 400 + rand.nextInt(5);
			this.mon1att = 30 + rand.nextInt(5);
			this.mon1arm = 1 + rand.nextInt(5);
			this.mon1hid = 1 + rand.nextInt(5);
			this.monexp = 1 + rand.nextInt(5);
			this.monmm = 1 + rand.nextInt(3);
			this.boss = bossname[rand.nextInt(bossname.length)];
			this.bosshp = 5 + rand.nextInt(6);
			this.bossatt = 5 + rand.nextInt(6);
			this.bossarm = 5 + rand.nextInt(6);
			this.bosshid = 5 + rand.nextInt(6);
			this.monexp = 5 + rand.nextInt(6);
			this.bmonmm = 1;
			this.monsterM = 10 + rand.nextInt(50);
		} else if (key == 2) {
			this.modMon = 2;
			String[] raname = { "큰 슬라임", "홉 고블린", "큰 타우렌" };
			this.mon1 = raname[rand.nextInt(raname.length)];
			this.mon1hp = 2 + rand.nextInt(6);
			this.mon1att = 2 + rand.nextInt(6);
			this.mon1arm = 2 + rand.nextInt(6);
			this.mon1hid = 2 + rand.nextInt(6);
			this.monexp = 2 + rand.nextInt(6);
			this.monmm = 1 + rand.nextInt(3);
			this.boss = bossname[rand.nextInt(bossname.length)];
			this.bosshp = 7 + rand.nextInt(8);
			this.bossatt = 50 + rand.nextInt(8);
			this.bossarm = 7 + rand.nextInt(8);
			this.bosshid = 7 + rand.nextInt(8);
			this.monexp = 7 + rand.nextInt(8);
			this.bmonmm = 1;
			this.monsterM = 50 + rand.nextInt(100);
		} else if (key == 3) {
			this.modMon = 3;
			String[] raname = { "슬라임 킹", "고블린 킹", "타우렌 킹" };
			this.mon1 = raname[rand.nextInt(raname.length)];
			this.mon1hp = 4 + rand.nextInt(11);
			this.mon1att = 4 + rand.nextInt(11);
			this.mon1arm = 4 + rand.nextInt(11);
			this.mon1hid = 4 + rand.nextInt(11);
			this.monexp = 4 + rand.nextInt(11);
			this.monmm = 1 + rand.nextInt(3);
			this.boss = bossname[rand.nextInt(bossname.length)];
			this.bosshp = 10 + rand.nextInt(11);
			this.bossatt = 10 + rand.nextInt(11);
			this.bossarm = 10 + rand.nextInt(11);
			this.bosshid = 10 + rand.nextInt(11);
			this.monexp = 10 + rand.nextInt(11);
			this.bmonmm = 1;
			this.monsterM = 100 + rand.nextInt(500);
		}
	}

	@Override
	public String toString() {
		return "   그림자가 " + monmm + "개 보인다";
	}

	public int getBmonmm() {
		return bmonmm;
	}

	public void setBmonmm(int bmonmm) {
		this.bmonmm = bmonmm;
	}

	public String toString1() {
		return "\t       이름 :" + mon1 + "*" + monmm + "\n\t    체력 :" + (mon1hp) + "\t공격력 :" + (mon1att);
	}

	public String toString2() {
		return "\t     이름 :" + boss + "*" + bmonmm + "\n\t   체력 :" + (bosshp) + "\t공격력 :" + (bossatt);
	}

	public static int getBossroom() {
		return bossroom;
	}

	public static void setBossroom(int bossroom) {
		gameMonsterDTO.bossroom = bossroom;
	}

	public String getMon1() {
		return mon1;
	}

	public void setMon1(String mon1) {
		this.mon1 = mon1;
	}

	public int getMon1hp() {
		return mon1hp;
	}

	public void setMon1hp(int mon1hp) {
		this.mon1hp = mon1hp;
	}

	public int getMon1att() {
		return mon1att;
	}

	public void setMon1att(int mon1att) {
		this.mon1att = mon1att;
	}

	public int getMon1arm() {
		return mon1arm;
	}

	public void setMon1arm(int mon1arm) {
		this.mon1arm = mon1arm;
	}

	public int getMon1hid() {
		return mon1hid;
	}

	public void setMon1hid(int mon1hid) {
		this.mon1hid = mon1hid;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	public int getBosshp() {
		return bosshp;
	}

	public void setBosshp(int bosshp) {
		this.bosshp = bosshp;
	}

	public int getBossatt() {
		return bossatt;
	}

	public void setBossatt(int bossatt) {
		this.bossatt = bossatt;
	}

	public int getBossarm() {
		return bossarm;
	}

	public void setBossarm(int bossarm) {
		this.bossarm = bossarm;
	}

	public int getBosshid() {
		return bosshid;
	}

	public void setBosshid(int bosshid) {
		this.bosshid = bosshid;
	}

	public int getMonexp() {
		return monexp;
	}

	public void setMonexp(int monexp) {
		this.monexp = monexp;
	}

	public int getMonmm() {
		return monmm;
	}

	public void setMonmm(int monmm) {
		this.monmm = monmm;
	}

	public int getmodMon() {
		return modMon;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void setmodMon(int modMon) {
		this.modMon = modMon;
	}

	public int getMonsterMoney() {
		return monsterM;
	}

	public void setMonsterMoney(int monsterMoney) {
		this.monsterM = monsterMoney;
	}

}
