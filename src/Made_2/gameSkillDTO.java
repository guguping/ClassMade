package Made_2;

import java.util.Random;

public class gameSkillDTO {
	Random rand = new Random();
	String[] Skill = { "좌종", "스네", "우종", "붕권", "월광", "도발", "도제", "초풍", };

	int skillBno;
	private int skilld1;
	private int skilld2;
	private int skilld3;
	private int skilld4;
	private int skilld5;
	private int skilld6;
	private String skillname1;
	private String skillname2;
	private String skillname3;
	private String menu1;
	private String menu2;
	private String menu3;

	public gameSkillDTO(Integer key, gameCharacterDTO gc) {
		if (key == 1) {
			skillBno = 1;
			this.skilld4 = 10 + rand.nextInt(21); 
			this.skilld5 = 10 + rand.nextInt(21);
			this.skilld6 = 10 + rand.nextInt(21);
			this.skilld1 = this.skilld4 + gc.getLnt();
			this.skilld2 = this.skilld5 + gc.getLnt();
			this.skilld3 = this.skilld6 + gc.getLnt();
		} else if (key == 2) {
			skillBno = 2;
			this.skilld4 = 5 + rand.nextInt(11); 
			this.skilld5 = 5 + rand.nextInt(11);
			this.skilld6 = 5 + rand.nextInt(11);
			this.skilld1 = this.skilld4 + gc.getLnt();
			this.skilld2 = this.skilld5 + gc.getLnt();
			this.skilld3 = this.skilld6 + gc.getLnt();
		} else if (key == 3) {
			skillBno = 3;
			this.skilld4 = 1 + rand.nextInt(6); 
			this.skilld5 = 1 + rand.nextInt(6);
			this.skilld6 = 1 + rand.nextInt(6);
			this.skilld1 = this.skilld4 + gc.getLnt();
			this.skilld2 = this.skilld5 + gc.getLnt();
			this.skilld3 = this.skilld6 + gc.getLnt();
		}
		this.skillname1 = Skill[rand.nextInt(Skill.length)];
		this.skillname2 = Skill[rand.nextInt(Skill.length)];
		this.skillname3 = Skill[rand.nextInt(Skill.length)];
		this.menu1 = skillname1 + "(" + skilld1 + ")";
		this.menu2 = skillname2 + "(" + skilld2 + ")";
		this.menu3 = skillname3 + "(" + skilld3 + ")";
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
	public String toString1(gameCharacterDTO gc) {
		this.skilld1 = this.skilld4 + gc.getLnt();
		this.menu1 = skillname1 + "(" + skilld1 + ")";
		return menu1;
	}

	public String toString2(gameCharacterDTO gc) {
		this.skilld2 = this.skilld5 + gc.getLnt();
		this.menu2 = skillname2 + "(" + skilld2 + ")";
		return menu2;
	}

	public String toString3(gameCharacterDTO gc) {
		this.skilld3 = this.skilld6 + gc.getLnt();
		this.menu3 = skillname3 + "(" + skilld3 + ")";
		return menu3;
	}

	public int getSkilld1(gameCharacterDTO gc) {
		this.skilld1 = this.skilld4 + gc.getLnt();
		return skilld1;
	}

	public void setSkilld1(int skilld1) {
		this.skilld1 = skilld1;
	}

	public int getSkilld2(int key , gameCharacterDTO gc) {
		this.skilld2 = this.skilld5 + gc.getLnt();
		return skilld2;
	}

	public void setSkilld2(int skilld2) {
		this.skilld2 = skilld2;
	}

	public int getSkilld3(gameCharacterDTO gc) {
		this.skilld3 = this.skilld6 + gc.getLnt();
		return skilld3;
	}

	public void setSkilld3(int skilld3) {
		this.skilld3 = skilld3;
	}

}
