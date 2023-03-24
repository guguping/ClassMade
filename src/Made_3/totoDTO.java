package Made_3;

public class totoDTO {
	
	private static int dosin = 0;
	private Integer game; // game1_1 사용
	private Integer game1 = 1; // game2_1 사용
	private Integer game2; // game2_1 사용
	private Integer game3; // game2_1 사용
	private Integer game4;
	
	public totoDTO() {
		this.dosin++;
	}
	public int getDosin() {
		return dosin;
	}
	public Integer getGame() {
		return game;
	}
	public void setGame(Integer game) {
		this.game = game;
	}
	public Integer getGame1() {
		return game1;
	}
	public void setGame1(Integer game1) {
		this.game1 =  game1;
	}
	public Integer getGame2() {
		return game2;
	}
	public void setGame2(Integer game2) {
		this.game2 = game2;
	}
	public Integer getGame3() {
		return game3;
	}
	public void setGame3(Integer game3) {
		this.game3 = game3;
	}
	public Integer getGame4() {
		return game4;
	}
	public void setGame4(Integer game4) {
		this.game4 = game4;
	}
	
	
	
}
