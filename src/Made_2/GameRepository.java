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
	Map<Integer, gameMonsterDTO> ga = new TreeMap<>();
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
			for (Integer s : ga.keySet()) {
				return true;
			}
		}
		return false;
	}
	public void newSkill(gameSkillDTO STO) {
		gs.put(STO.getSkillBno() , STO);
	}

	public String seeMap(Integer mkey) {
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
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
	public gameMonsterDTO move(Integer mkey) {
		for(Integer s : ga.keySet()) {
			if(ga.get(s).getmodMon() == (mkey)) {
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
	public void death1(int mkey) {
		for(int s : ga.keySet()) {
			if(ga.get(s).getmodMon()== (mkey)) {
				ga.get(s).setMon1hp(ga.get(s).getMon1hp()-gs.get(s).getSkilld1());
				if(ga.get(s).getMon1hp() <= 0) {
					System.out.println("몬스터  사망");
				}
			}
		}
	}
	public void death2(int mkey) {
		for(int s : ga.keySet()) {
			if(ga.get(s).getmodMon()== (mkey)) {
				ga.get(s).setMon1hp(ga.get(s).getMon1hp()-gs.get(s).getSkilld2());
				if(ga.get(s).getMon1hp() <= 0) {
					System.out.println("몬스터  사망");
				}
			}
		}
	}
	public void death3(int mkey) {
		for(int s : ga.keySet()) {
			if(ga.get(s).getmodMon()== (mkey)) {
				ga.get(s).setMon1hp(ga.get(s).getMon1hp()-gs.get(s).getSkilld3());
				if(ga.get(s).getMon1hp() <= 0) {
					System.out.println("몬스터  사망");
				}
			}
		}
	}
}
