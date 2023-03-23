package Made_2;

import java.util.Random;

public class gameSkillDTO {
	Random rand = new Random();
	
	int skillBno;
	String menu1;
	String menu2;
	String menu3;
	String menu4;
	int skilld1;
	int skilld2;
	int skilld3;

	public gameSkillDTO(Integer key , gameCharacterDTO gc) {
		String[] Skill = { "좌종", "스네", "우종", "붕권", "월광", "도발", "도제", "초풍", };
		if (key == 1) {
			skillBno = 1;
			this.skilld1 = 10 + rand.nextInt(21)+gc.getAtt();
			this.skilld2 = 10 + rand.nextInt(21)+gc.getAtt();
			this.skilld3 = 10 + rand.nextInt(21)+gc.getAtt();
		}else if(key == 2) {
			skillBno = 2;
			this.skilld1 = 5 + rand.nextInt(11)+gc.getAtt();
			this.skilld2 = 5 + rand.nextInt(11)+gc.getAtt();
			this.skilld3 = 5 + rand.nextInt(11)+gc.getAtt();
		}else if(key==3) {
			skillBno = 3;
			this.skilld1 = 1 + rand.nextInt(6)+gc.getAtt();
			this.skilld2 = 1 + rand.nextInt(6)+gc.getAtt();
			this.skilld3 = 1 + rand.nextInt(6)+gc.getAtt();
		}
		this.menu1 = Skill[rand.nextInt(Skill.length)]+"("+skilld1+")";
		this.menu2 = Skill[rand.nextInt(Skill.length)]+"("+skilld2+")";
		this.menu3 = Skill[rand.nextInt(Skill.length)]+"("+skilld3+")";
	}
	public String toString1() {
		return menu1;
	}
	public String toString2() {
		return menu2;
	}
	public String toString3() {
		return menu3;
	}
	public String toString4() {
		return menu4;
	}
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
	public int getSkilld1() {
		return skilld1;
	}
	public void setSkilld1(int skilld1) {
		this.skilld1 = skilld1;
	}
	public int getSkilld2() {
		return skilld2;
	}
	public void setSkilld2(int skilld2) {
		this.skilld2 = skilld2;
	}
	public int getSkilld3() {
		return skilld3;
	}
	public void setSkilld3(int skilld3) {
		this.skilld3 = skilld3;
	}

}
