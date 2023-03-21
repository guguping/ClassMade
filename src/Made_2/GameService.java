package Made_2;

import java.util.Scanner;

public class gameService {
	gameRepository br = gameRepository.getInstance();
	private static gameService sr = new gameService();
	private gameService() {}
	public static gameService getInstance() {
		return sr;
	}
	Integer key = null;
	
	
	public void newgame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t1.이지 2.노멀 3.하드");
		System.out.print("   모드 선택 >");
		key = sc.nextInt();
		if(key == 1) {
		gameCharacterDTO gc = new gameCharacterDTO(key);
		
		System.out.println(gc.toString());
		}else if(key==2) {
			
		}else if(key==3) {
			
		}
	}
	public void mode() {

	}
	
}
