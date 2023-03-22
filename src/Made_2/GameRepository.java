package Made_2;

import java.util.Map;
import java.util.TreeMap;

public class gameRepository {
	private static gameRepository br = new gameRepository();

	private gameRepository() {
	}

	public static gameRepository getInstance() {
		return br;
	}

	Map<Integer, gameCharacterDTO> g = new TreeMap<>();
	Map<String, gameMonsterDTO> ga = new TreeMap<>();
	Map<Integer, gameSkillDTO> gs = new TreeMap<>();

	public String newGame(gameCharacterDTO DTO) {
		if (g.put(DTO.getBno(), DTO) == null) {
			for (Integer s : g.keySet()) {
				return g.get(s).toString();
			}
		}
		return "짜잔 오류입니다";
	}

	public boolean newMonster(gameMonsterDTO MTO) {
		if (ga.put(MTO.getmodMon(), MTO) == null) {
			for (String s : ga.keySet()) {
				return true;
			}
		}
		return false;
	}
	public void newSkill(gameSkillDTO STO) {
		gs.put(STO.getSkillBno() , STO);
	}

	public String seeMap(String mkey) {
		for (String s : ga.keySet()) {
			if (ga.get(s).getmodMon().equals(mkey)) {
				return ga.get(s).toString();
			}

		}
		return "짜잔 오류입니다";
	}

	public String charSee(int key) {
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == (key)) {
				return g.get(s).toString();
			}
		}
		return "짜잔 오류입니다!";
	}

	public void reStart(int key) {
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == key) {
				g.remove(s);
			}
		}
	}
	public gameMonsterDTO move(String mkey) {
		for(String s : ga.keySet()) {
			if(ga.get(s).getmodMon().equals(mkey)) {
				return ga.get(s);
			}
		}
		return null;
	}
	public gameSkillDTO attMenu(int key) {
		for(Integer s : gs.keySet()) {
			if(gs.get(s).getSkillBno() == key) {
				return gs.get(s);
			}
		}
		return null;
	}
}
