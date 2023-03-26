package Made_2;

public class gameItemDTO {
	//검
	private String 목검;
	private int 목검att;
	private int 목검갯수;
	private int 목검가격;
	private String 하급철검;
	private int 하급att;
	private int 하급철검갯수;
	private int 하급철검가격;
	private String 중급철검;
	private int 중급att;
	private int 중급철검갯수;
	private int 중급철검가격;
	private String 고급철검;
	private int 고급att;
	private int 고급철검갯수;
	private int 고급철검가격;
	private String 명검;
	private int 명검att;
	private int 명검갯수;
	private int 명검가격;
	//방패
	private String 나무방패;
	private int 나무arm;
	private int 나무방패갯수;
	private int 나무방패가격;
	private String 하급철방패;
	private int 하급arm;
	private int 하급철방패갯수;
	private int 하급철방패가격;
	private String 중급철방패;
	private int 중급arm;
	private int 중급철방패갯수;
	private int 중급철방패가격;
	private String 고급철방패;
	private int 고급arm;
	private int 고급철방패갯수;
	private int 고급철방패가격;
	//INT
	private String 럭1;
	private int 증가량1;
	private int 럭1갯수;
	private int 럭1가격;
	private String 럭2;
	private int 증가량2;
	private int 럭2갯수;
	private int 럭2가격;
	private String 럭3;
	private int 증가량3;
	private int 럭3갯수;
	private int 럭3가격;
	private String 럭4;
	private int 증가량4;
	private int 럭4갯수;
	private int 럭4가격;
	//포션
	private String 하급포션;
	private int 하급hp;
	private int 하급포션갯수;
	private int 하급포션가격;
	private String 중급포션;
	private int 중급hp;
	private int 중급포션갯수;
	private int 중급포션가격;
	private String 고급포션;
	private int 고급hp;
	private int 고급포션갯수;
	private int 고급포션가격;
	private String 엘릭서;
	private int 엘릭서hp;
	private int 엘릭서갯수;
	private int 엘릭서가격;
	
	
	public gameItemDTO() {
		//힘스텟
		this.목검 = "STR+1";
		this.목검att = 1;
		this.목검가격 = 1;
		this.하급철검 = "\u001B[32mSTR+5\u001B[0m";
		this.하급att = 5;
		this.하급철검가격 = 1;
		this.중급철검 = "\u001B[35mSTR+10\u001B[0m";
		this.중급att = 10;
		this.중급철검가격 = 1;
		this.고급철검 = "\u001B[33mSTR+15\u001B[0m";
		this.고급att = 15;
		this.고급철검가격 = 1;
		this.명검 = "\u001B[31mSTR+20\u001B[0m";
		this.명검att = 20;
		this.명검가격 = 1;
		//방패
		this.나무방패 = "DEX+1";
		this.나무arm = 1;
		this.나무방패가격 = 1;
		this.하급철방패 = "\u001B[32mDEX+5\u001B[0m";
		this.하급arm = 5;
		this.하급철방패가격 = 1;
		this.중급철방패 = "\u001B[35mDEX+10\u001B[0m";
		this.중급arm = 10;
		this.중급철방패가격 = 1;
		this.고급철방패 = "\u001B[33mDEX+15\u001B[0m";
		this.고급arm = 15;
		this.고급철방패가격 = 1;
		//덱
		this.럭1 = "INT+1";
		this.증가량1 = 1;
		this.럭1가격 = 1;
		this.럭2 = "\u001B[32mINT+5\u001B[0m";
		this.증가량2 = 5;
		this.럭2가격 = 1;
		this.럭3 = "\u001B[35mINT+10\u001B[0m";
		this.증가량3 = 10;
		this.럭3가격 = 1;
		this.럭4 = "\u001B[33mINT+15\u001B[0m";
		this.증가량4 = 15;
		this.럭4가격 = 1;
		
		//포션
		this.하급포션 = "\u001B[32m포션(하급)\u001B[0m";
		this.하급hp = 10;
		this.하급포션가격 = 1;
		this.중급포션= "\u001B[35m포션(중급)\u001B[0m";
		this.중급hp = 20;
		this.중급포션가격 = 1;
		this.고급포션= "\u001B[33m포션(고급)\u001B[0m";
		this.고급hp = 30;
		this.고급포션가격 = 1;
		this.엘릭서= "\u001B[31m엘릭서(???)\u001B[0m";
		this.엘릭서hp = 100;
		this.엘릭서가격 = 1;
	}
	public String toString0(gameCharacterDTO gc) {
		return "┌──────────────────상점──────────────────┐\n"+"\t\tGold:"+gc.getMoney()+"\n\t  1.STR\t\t 2.DEX\n\t  3.INT\t\t 4.포션\n\t\t0.뒤로가기\n"+"└───────────────────────────────────────┘";
	}
	public String toStirng1(gameCharacterDTO gc) {
		return "┌──────────────────상점──────────────────┐\n"+"\t\tGold:"+gc.getMoney()+"\n\t1."+목검+"("+목검가격+")"+"\t2."+하급철검+"("+하급철검가격+")"+"\n\t3."+중급철검+"("+중급철검가격+")"+"\t4."+고급철검+"("+고급철검가격+")"+"\n\t5."+명검+"("+명검가격+")"+"\t0.뒤로가기"+"\n└───────────────────────────────────────┘";
	}
	public String toStirng2(gameCharacterDTO gc) {
		return "┌──────────────────상점──────────────────┐\n"+"\t\tGold:"+gc.getMoney()+"\n\t1."+나무방패+"("+나무방패가격+")"+"\t2."+하급철방패+"("+하급철방패가격+")"+"\n\t3."+중급철방패+"("+중급철방패가격+")"+"\t4."+고급철방패+"("+고급철방패가격+")"+"\n\t\t0.뒤로가기"+"\n└───────────────────────────────────────┘";
	}
	public String toStirng3(gameCharacterDTO gc) {
		return "┌──────────────────상점──────────────────┐\n"+"\t\tGold:"+gc.getMoney()+"\n\t1."+하급포션+"("+하급포션가격+")"+"\t2."+중급포션+"("+중급포션가격+")"+"\n\t3."+고급포션+"("+고급포션가격+")"+"\t4."+엘릭서+"("+엘릭서가격+")"+"\n\t\t0.뒤로가기"+"\n└───────────────────────────────────────┘";
	}
	public String toString4(gameCharacterDTO gc) {
		return "┌──────────────────상점──────────────────┐\n"+"\t\tGold:"+gc.getMoney()+"\n\t1."+럭1+"("+럭1가격+")"+"\t2."+럭2+"("+럭2가격+")"+"\n\t3."+럭3+"("+럭3가격+")"+"\t4."+럭4+"("+럭4가격+")"+"\n\t\t0.뒤로가기"+"\n└───────────────────────────────────────┘";
	}

	public String get목검() {
		return 목검;
	}
	public void set목검(String 목검) {
		this.목검 = 목검;
	}

	public int get목검att() {
		return 목검att;
	}

	public void set목검att(int 목검att) {
		this.목검att = 목검att;
	}

	public String get하급철검() {
		return 하급철검;
	}

	public void set하급철검(String 하급철검) {
		this.하급철검 = 하급철검;
	}


	public int get하급att() {
		return 하급att;
	}


	public void set하급att(int 하급att) {
		this.하급att = 하급att;
	}


	public String get중급철검() {
		return 중급철검;
	}


	public void set중급철검(String 중급철검) {
		this.중급철검 = 중급철검;
	}


	public int get중급att() {
		return 중급att;
	}


	public void set중급att(int 중급att) {
		this.중급att = 중급att;
	}


	public String get고급철검() {
		return 고급철검;
	}


	public void set고급철검(String 고급철검) {
		this.고급철검 = 고급철검;
	}


	public int get고급att() {
		return 고급att;
	}


	public void set고급att(int 고급att) {
		this.고급att = 고급att;
	}


	public String get명검() {
		return 명검;
	}


	public void set명검(String 명검) {
		this.명검 = 명검;
	}


	public int get명검att() {
		return 명검att;
	}


	public void set명검att(int 명검att) {
		this.명검att = 명검att;
	}


	public String get나무방패() {
		return 나무방패;
	}


	public void set나무방패(String 나무방패) {
		this.나무방패 = 나무방패;
	}


	public int get나무arm() {
		return 나무arm;
	}


	public void set나무arm(int 나무arm) {
		this.나무arm = 나무arm;
	}


	public String get하급철방패() {
		return 하급철방패;
	}


	public void set하급철방패(String 하급철방패) {
		this.하급철방패 = 하급철방패;
	}


	public int get하급arm() {
		return 하급arm;
	}


	public void set하급arm(int 하급arm) {
		this.하급arm = 하급arm;
	}


	public String get중급철방패() {
		return 중급철방패;
	}


	public void set중급철방패(String 중급철방패) {
		this.중급철방패 = 중급철방패;
	}


	public int get중급arm() {
		return 중급arm;
	}


	public void set중급arm(int 중급arm) {
		this.중급arm = 중급arm;
	}


	public String get고급철방패() {
		return 고급철방패;
	}


	public void set고급철방패(String 고급철방패) {
		this.고급철방패 = 고급철방패;
	}


	public int get고급arm() {
		return 고급arm;
	}


	public void set고급arm(int 고급arm) {
		this.고급arm = 고급arm;
	}


	public String get하급포션() {
		return 하급포션;
	}


	public void set하급포션(String 하급포션) {
		this.하급포션 = 하급포션;
	}


	public int get하급hp() {
		return 하급hp;
	}


	public void set하급hp(int 하급hp) {
		this.하급hp = 하급hp;
	}


	public String get중급포션() {
		return 중급포션;
	}


	public void set중급포션(String 중급포션) {
		this.중급포션 = 중급포션;
	}


	public int get중급hp() {
		return 중급hp;
	}


	public void set중급hp(int 중급hp) {
		this.중급hp = 중급hp;
	}


	public String get고급포션() {
		return 고급포션;
	}


	public void set고급포션(String 고급포션) {
		this.고급포션 = 고급포션;
	}


	public int get고급hp() {
		return 고급hp;
	}


	public void set고급hp(int 고급hp) {
		this.고급hp = 고급hp;
	}


	public String get엘릭서() {
		return 엘릭서;
	}


	public void set엘릭서(String 엘릭서) {
		this.엘릭서 = 엘릭서;
	}


	public int get엘릭서hp() {
		return 엘릭서hp;
	}


	public void set엘릭서hp(int 엘릭서hp) {
		this.엘릭서hp = 엘릭서hp;
	}


	public int get명검갯수() {
		return 명검갯수;
	}


	public void set명검갯수(int 명검갯수) {
		this.명검갯수 = 명검갯수;
	}


	public int get고급철방패갯수() {
		return 고급철방패갯수;
	}


	public void set고급철방패갯수(int 고급철방패갯수) {
		this.고급철방패갯수 = 고급철방패갯수;
	}


	public int get하급포션갯수() {
		return 하급포션갯수;
	}


	public void set하급포션갯수(int 하급포션갯수) {
		this.하급포션갯수 = 하급포션갯수;
	}


	public int get중급포션갯수() {
		return 중급포션갯수;
	}


	public void set중급갯수(int 중급포션갯수) {
		this.중급포션갯수 = 중급포션갯수;
	}


	public int get고급포션갯수() {
		return 고급포션갯수;
	}


	public void set고급갯수(int 고급포션갯수) {
		this.고급포션갯수 = 고급포션갯수;
	}


	public int get엘릭서갯수() {
		return 엘릭서갯수;
		
	}


	public void set엘릭서갯수(int 엘릭서갯수) {
		this.엘릭서갯수 = 엘릭서갯수;
	}
	public int get목검갯수() {
		return 목검갯수;
	}
	public void set목검갯수(int 목검갯수) {
		this.목검갯수 = 목검갯수;
	}
	public int get하급철검갯수() {
		return 하급철검갯수;
	}
	public void set하급철검갯수(int 하급철검갯수) {
		this.하급철검갯수 = 하급철검갯수;
	}
	public int get중급철검갯수() {
		return 중급철검갯수;
	}
	public void set중급철검갯수(int 중급철검갯수) {
		this.중급철검갯수 = 중급철검갯수;
	}
	public int get고급철검갯수() {
		return 고급철검갯수;
	}
	public void set고급철검갯수(int 고급철검갯수) {
		this.고급철검갯수 = 고급철검갯수;
	}
	public int get나무방패갯수() {
		return 나무방패갯수;
		
	}
	public void set나무방패갯수(int 나무방패갯수) {
		this.나무방패갯수 = 나무방패갯수;
	}
	public int get하급철방패갯수() {
		return 하급철방패갯수;
	}
	public void set하급철방패갯수(int 하급철방패갯수) {
		this.하급철방패갯수 = 하급철방패갯수;
	}
	public int get중급철방패갯수() {
		return 중급철방패갯수;
	}
	public void set중급철방패갯수(int 중급철방패갯수) {
		this.중급철방패갯수 = 중급철방패갯수;
	}
	public void set중급포션갯수(int 중급포션갯수) {
		this.중급포션갯수 = 중급포션갯수;
	}
	public void set고급포션갯수(int 고급포션갯수) {
		this.고급포션갯수 = 고급포션갯수;
	}
	public String get럭1() {
		return 럭1;
	}
	public void set럭1(String 럭1) {
		this.럭1 = 럭1;
	}
	public int get증가량1() {
		return 증가량1;
	}
	public void set증가량1(int 증가량1) {
		this.증가량1 = 증가량1;
	}
	public String get럭2() {
		return 럭2;
	}
	public void set럭2(String 럭2) {
		this.럭2 = 럭2;
	}
	public int get증가량2() {
		return 증가량2;
	}
	public void set증가량2(int 증가량2) {
		this.증가량2 = 증가량2;
	}
	public String get럭3() {
		return 럭3;
	}
	public void set덱3(String 럭3) {
		this.럭3 = 럭3;
	}
	public int get증가량3() {
		return 증가량3;
	}
	public void set증가량3(int 증가량3) {
		this.증가량3 = 증가량3;
	}
	public String get럭4() {
		return 럭4;
	}
	public void set덱4(String 럭4) {
		this.럭4 = 럭4;
	}
	public int get증가량4() {
		return 증가량4;
	}
	public void set증가량4(int 증가량4) {
		this.증가량4 = 증가량4;
	}
	public int get럭1갯수() {
		return 럭1갯수;
	}
	public void set럭1갯수(int 럭1갯수) {
		this.럭1갯수 = 럭1갯수;
	}
	public int get럭2갯수() {
		return 럭2갯수;
	}
	public void set럭2갯수(int 럭2갯수) {
		this.럭2갯수 = 럭2갯수;
	}
	public int get럭3갯수() {
		return 럭3갯수;
	}
	public void set럭3갯수(int 럭3갯수) {
		this.럭3갯수 = 럭3갯수;
	}
	public int get럭4갯수() {
		return 럭4갯수;
	}
	public void set럭4갯수(int 럭4갯수) {
		this.럭4갯수 = 럭4갯수;
	}
	public int get목검가격() {
		return 목검가격;
	}
	public void set목검가격(int 목검가격) {
		this.목검가격 = 목검가격;
	}
	public int get하급철검가격() {
		return 하급철검가격;
	}
	public void set하급철검가격(int 하급철검가격) {
		this.하급철검가격 = 하급철검가격;
	}
	public int get중급철검가격() {
		return 중급철검가격;
	}
	public void set중급철검가격(int 중급철검가격) {
		this.중급철검가격 = 중급철검가격;
	}
	public int get고급철검가격() {
		return 고급철검가격;
	}
	public void set고급철검가격(int 고급철검가격) {
		this.고급철검가격 = 고급철검가격;
	}
	public int get명검가격() {
		return 명검가격;
	}
	public void set명검가격(int 명검가격) {
		this.명검가격 = 명검가격;
	}
	public int get나무방패가격() {
		return 나무방패가격;
	}
	public void set나무방패가격(int 나무방패가격) {
		this.나무방패가격 = 나무방패가격;
	}
	public int get하급철방패가격() {
		return 하급철방패가격;
	}
	public void set하급철방패가격(int 하급철방패가격) {
		this.하급철방패가격 = 하급철방패가격;
	}
	public int get중급철방패가격() {
		return 중급철방패가격;
	}
	public void set중급철방패가격(int 중급철방패가격) {
		this.중급철방패가격 = 중급철방패가격;
	}
	public int get고급철방패가격() {
		return 고급철방패가격;
	}
	public void set고급철방패가격(int 고급철방패가격) {
		this.고급철방패가격 = 고급철방패가격;
	}
	public int get럭1가격() {
		return 럭1가격;
	}
	public void set럭1가격(int 럭1가격) {
		this.럭1가격 = 럭1가격;
	}
	public int get럭2가격() {
		return 럭2가격;
	}
	public void set럭2가격(int 럭2가격) {
		this.럭2가격 = 럭2가격;
	}
	public int get럭3가격() {
		return 럭3가격;
	}
	public void set럭3가격(int 럭3가격) {
		this.럭3가격 = 럭3가격;
	}
	public int get럭4가격() {
		return 럭4가격;
	}
	public void set럭4가격(int 럭4가격) {
		this.럭4가격 = 럭4가격;
	}
	public int get하급포션가격() {
		return 하급포션가격;
	}
	public void set하급포션가격(int 하급포션가격) {
		this.하급포션가격 = 하급포션가격;
	}
	public int get중급포션가격() {
		return 중급포션가격;
	}
	public void set중급포션가격(int 중급포션가격) {
		this.중급포션가격 = 중급포션가격;
	}
	public int get고급포션가격() {
		return 고급포션가격;
	}
	public void set고급포션가격(int 고급포션가격) {
		this.고급포션가격 = 고급포션가격;
	}
	public int get엘릭서가격() {
		return 엘릭서가격;
	}
	public void set엘릭서가격(int 엘릭서가격) {
		this.엘릭서가격 = 엘릭서가격;
	}
	
	
}
