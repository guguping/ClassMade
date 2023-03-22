package Made_2;

import java.util.Random;

public class gameSkillDTO {
	Random rand = new Random();
	
	int skillBno;
	String menu1;
	String menu2;
	String menu3;
	String menu4;
//	String 좌종;
//	String 스네이크;
//	String 우종;
//	String 붕권;
//	String 월광섬;
//	String 도발;
//	String 도발제트어퍼;
//	String 초풍;
//	String 초오찌;

	public gameSkillDTO(Integer key) {
		String[] Skill = { "좌종", "스네이크", "우종", "붕권", "월광섬", "도발", "도발제트어퍼", "초풍", "초오찌" };
		if (key == 1) {
			skillBno = 1;
//			this.좌종 = 10 + rand.nextInt(21);
//			this.스네이크 = 10 + rand.nextInt(21);
//			this.우종 = 10 + rand.nextInt(21);
//			this.붕권 = 10 + rand.nextInt(21);
//			this.월광섬 = 10 + rand.nextInt(21);
//			this.도발 = 10 + rand.nextInt(21);
//			this.도발제트어퍼 = 10 + rand.nextInt(21);
//			this.초풍 = 10 + rand.nextInt(21);
//			this.초오찌 = 10 + rand.nextInt(21);
			
		}else if(key == 2) {
			skillBno = 2;
//			this.좌종 = 5 + rand.nextInt(11);
//			this.스네이크 = 5 + rand.nextInt(11);
//			this.우종 = 5 + rand.nextInt(11);
//			this.붕권 = 5 + rand.nextInt(11);
//			this.월광섬 = 5 + rand.nextInt(11);
//			this.도발 = 5 + rand.nextInt(11);
//			this.도발제트어퍼 = 5 + rand.nextInt(11);
//			this.초풍 = 5 + rand.nextInt(11);
//			this.초오찌 = 5 + rand.nextInt(11);
		}else if(key==3) {
			skillBno = 3;
//			this.좌종 = 1 + rand.nextInt(6);
//			this.스네이크 = 1 + rand.nextInt(6);
//			this.우종 = 1 + rand.nextInt(6);
//			this.붕권 = 1 + rand.nextInt(6);
//			this.월광섬 = 1 + rand.nextInt(6);
//			this.도발 = 1 + rand.nextInt(6);
//			this.도발제트어퍼 = 1 + rand.nextInt(6);
//			this.초풍 = 1 + rand.nextInt(6);
//			this.초오찌 = 1 + rand.nextInt(6);
		}
		this.menu1 = Skill[rand.nextInt(Skill.length)];
		this.menu2 = Skill[rand.nextInt(Skill.length)];
		this.menu3 = Skill[rand.nextInt(Skill.length)];
	}
	public String toString1() {
		return "1."+menu1;
	}
	public String toString2() {
		return "2."+menu2;
	}
	public String toString3() {
		return "3."+menu3;
	}
	public String toString4() {
		return "4."+menu4;
	}
//	public String toString5() {
//		return "5."+menu1;
//	}
	public int getSkillBno() {
		return skillBno;
	}

	public void setSkillBno(int skillBno) {
		this.skillBno = skillBno;
	}

	public String getMenu1() {
		return menu1;
	}

	public void setMenu1(String menu1) {
		this.menu1 = menu1;
	}

	public String getMenu2() {
		return menu2;
	}

	public void setMenu2(String menu2) {
		this.menu2 = menu2;
	}

	public String getMenu3() {
		return menu3;
	}

	public void setMenu3(String menu3) {
		this.menu3 = menu3;
	}

	public String getMenu4() {
		return menu4;
	}

	public void setMenu4(String menu4) {
		this.menu4 = menu4;
	}

}
