package Made_2;

import java.util.Random;

public class gameMapDTO {
	private Random rand = new Random();
	private int ezKey1 = rand.nextInt(3);
	private int noKey2 = rand.nextInt(3);
	private int hrKey3 = rand.nextInt(3);
	
	
	public gameMapDTO() {}
	public int getMapKey1() {
		return ezKey1;
	}
	public void setMapKey1(int mapKey1) {
		this.ezKey1 = mapKey1;
	}
	public int getMapKey2() {
		return noKey2;
	}
	public void setMapKey2(int mapKey2) {
		this.noKey2 = mapKey2;
	}
	public int getMapKey3() {
		return hrKey3;
	}
	public void setMapKey3(int mapKey3) {
		this.hrKey3 = mapKey3;
	}
	public String mapMonster(int key) {
		
		return null;
	}
	
	
}
