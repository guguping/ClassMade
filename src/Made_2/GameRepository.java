package Made_2;

public class gameRepository {
	private static gameRepository br = new gameRepository();
	private gameRepository() {}
	public static gameRepository getInstance() {
		return br;
	}
	
	
	
}
