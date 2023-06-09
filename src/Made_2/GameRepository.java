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
	Map<Integer, gameItemDTO> gi = new TreeMap<>();

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
		gs.put(STO.getSkillBno(), STO);
	}

	public void gameStart(int key) {
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == key) {
				g.get(s).start();
			}
		}
	}

	public void newShop(gameItemDTO ITO, int key) {
		gi.put(key, ITO);
	}

	public gameItemDTO seeShop(int key) {
		for (Integer s : gi.keySet()) {
			if (s == key) {
				return gi.get(s);
			}
		}
		return null;
	}

	public gameCharacterDTO gameEnd(int key) {
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == key) {
				g.get(s).end();
				return g.get(s);
			}
		}
		return null;
	}

	public String seeMap(Integer mkey) {
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				return ga.get(s).toString();
			}

		}
		return "짜잔 오류입니다";
	}

	public gameCharacterDTO charSee(int key) {
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == (key)) {
				return g.get(s);
			}
		}
		return null;
	}

	public gameMonsterDTO Room(int key) {
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == key) {
				return ga.get(s);
			}
		}
		return null;
	}

	public gameMonsterDTO boRoom(int key) {
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == key) {
				return ga.get(s);
			}
		}
		return null;
	}

	public void reStart(int key) {
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == key) {
				g.remove(s);
			}
		}
	}

	public gameMonsterDTO move(Integer mkey) {
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				return ga.get(s);
			}
		}
		return null;
	}

	public gameMonsterDTO bomove(Integer mkey) {
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				return ga.get(s);
			}
		}
		return null;
	}

	public gameSkillDTO attMenu(int key) {
		for (Integer s : gs.keySet()) {
			if (gs.get(s).getSkillBno() == key) {
				return gs.get(s);
			}
		}
		return null;
	}

	public boolean death0(int mkey) { // 몬스터 평타 딜
		int monhp;
		int usatt;
		for (int s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				monhp = ga.get(s).getMon1hp();
				usatt = g.get(s).getAtt() - ga.get(s).getMon1arm();
				if (usatt < 0) {
					usatt = 0;
				}
				ga.get(s).setMon1hp(ga.get(s).getMon1hp() - usatt);
				if (ga.get(s).getMon1hp() <= 0) {
					ga.get(s).setMonmm(ga.get(s).getMonmm() - 1);
					ga.get(s).setMon1hp(monhp);
					if (ga.get(s).getMonmm() <= 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean bsdeath0(int mkey) { // 보스 평타 딜
		for (int s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				ga.get(s).setBosshp(ga.get(s).getBosshp() - (g.get(s).getAtt() - ga.get(s).getBossarm()));
				if (ga.get(s).getBosshp() <= 0) {
					ga.get(s).setBmonmm(ga.get(s).getBmonmm() - 1);
					if (ga.get(s).getBmonmm() <= 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean bsdeath1(int mkey, int skilld) { // 보스 스킬 딜
		for (int s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				ga.get(s).setBosshp(ga.get(s).getBosshp() - skilld);
				if (ga.get(s).getBosshp() <= 0) {
					ga.get(s).setBmonmm(ga.get(s).getBmonmm() - 1);
					if (ga.get(s).getBmonmm() <= 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean bsdeath2(int mkey, int skilld) { // 보스 스킬 딜
		for (int s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				ga.get(s).setBosshp(ga.get(s).getBosshp() - skilld);
				if (ga.get(s).getBosshp() <= 0) {
					ga.get(s).setBmonmm(ga.get(s).getBmonmm() - 1);
					if (ga.get(s).getBmonmm() <= 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean bsdeath3(int mkey, int skilld) { // 보스 스킬 딜
		for (int s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				ga.get(s).setBosshp(ga.get(s).getBosshp() - skilld);
				if (ga.get(s).getBosshp() <= 0) {
					ga.get(s).setBmonmm(ga.get(s).getBmonmm() - 1);
					if (ga.get(s).getBmonmm() <= 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean death1(int mkey, int skilld) { // 몬스터 스킬 딜
		int monhp;
		for (int s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				monhp = ga.get(s).getMon1hp();
				ga.get(s).setMon1hp(ga.get(s).getMon1hp() - skilld);
				if (ga.get(s).getMon1hp() <= 0) {
					ga.get(s).setMonmm(ga.get(s).getMonmm() - 1);
					ga.get(s).setMon1hp(monhp);
					if (ga.get(s).getMonmm() <= 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean death2(int mkey, int skilld) {// 몬스터 스킬 딜
		int monhp;
		for (int s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				monhp = ga.get(s).getMon1hp();
				ga.get(s).setMon1hp(ga.get(s).getMon1hp() - skilld);
				if (ga.get(s).getMon1hp() <= 0) {
					ga.get(s).setMonmm(ga.get(s).getMonmm() - 1);
					ga.get(s).setMon1hp(monhp);
					if (ga.get(s).getMonmm() <= 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean death3(int mkey, int skilld) {// 몬스터 스킬 딜
		int monhp;
		for (int s : ga.keySet()) {
			if (ga.get(s).getmodMon() == (mkey)) {
				monhp = ga.get(s).getMon1hp();
				ga.get(s).setMon1hp(ga.get(s).getMon1hp() - skilld);
				if (ga.get(s).getMon1hp() <= 0) {
					ga.get(s).setMonmm(ga.get(s).getMonmm() - 1);
					ga.get(s).setMon1hp(monhp);
					if (ga.get(s).getMonmm() <= 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public double hide(int key) {
		double hide;
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == key) {
				hide = g.get(s).getLuk() / (10 * ga.get(s).getMonmm());
				return hide;
			}
		}

		return 0;
	}

	public int dcheak(int key) {
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == key) {
				ga.get(s).setRoom(ga.get(s).getRoom() + 1);
				System.out.println("\t\t" + ga.get(s).getRoom() + "번방 클리어");
				if (ga.get(s).getRoom() == 3) {
					return 1;
				}
			}
		}
		return 0;
	}
//	public int bsdcheak(int mkey) {
//		for (Integer s : ga.keySet()) {
//			if (ga.get(s).getmodMon() == mkey) {
//				ga.get(s).setBossroom(ga.get(s).getBossroom() + 1);
//				System.out.println("\t\t" + ga.get(s).getBossroom() + "번방 클리어");
//				if (ga.get(s).getBossroom() == 1) {
//					return 1;
//				}
//			}
//		}
//		return 0;
//	}

	public int monAtt(int key) { // 몬스터가 반격
		int monatt;
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == key) {
				monatt = (int) (ga.get(s).getMon1att() - g.get(s).getarm());
				if (monatt > 0) {
					g.get(s).setHp(g.get(s).getHp() - monatt);
					return monatt;
				}
			}
		}
		return 0;
	}

	public int bosAtt(int key) { // 보스가 반격
		int bosatt;
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == key) {
				bosatt = ga.get(s).getBossatt() - (int) g.get(s).getarm();
				System.out.println();
				if (bosatt >= 0) {
					g.get(s).setHp(g.get(s).getHp() - bosatt);
					return bosatt;
				}
			}
		}
		return 0;
	}

	public int ubsatt(int key) { // 유저가 보스를 공격
		int ubsatt;
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == key) {
				ubsatt = (int) (g.get(s).getAtt() - ga.get(s).getBossarm());
				if (ubsatt >= 0) {
					return ubsatt;
				}
			}
		}
		return 0;
	}

	public int umoatt(int key) { // 유저가 몬스터를 공격
		int umoatt;
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == key) {
				umoatt = (int) (g.get(s).getAtt() - ga.get(s).getMon1arm());
				if (umoatt >= 0) {
					return umoatt;
				}
			}
		}
		return 0;
	}

	public int umostt1(int key) { // 유저가 몬스터를 스킬 공격
		int umostt;
		for (Integer s : gs.keySet()) {
			if (gs.get(s).skillBno == key) {
				umostt = gs.get(s).getSkilld1(g.get(s)) - ga.get(s).getMon1arm();
				if (umostt >= 0) {
					return umostt;
				}
			}
		}
		return 0;
	}

	public int ubostt1(int key) { // 유저가 보스를 스킬 공격
		int ubostt;
		for (Integer s : gs.keySet()) {
			if (gs.get(s).skillBno == key) {
				ubostt = gs.get(s).getSkilld1(g.get(s)) - ga.get(s).getBossarm();
				if (ubostt >= 0) {
					return ubostt;
				}
			}
		}
		return 0;
	}

	public int umostt2(int key) { // 유저가 몬스터를 스킬 공격
		int umostt;
		for (Integer s : gs.keySet()) {
			if (gs.get(s).skillBno == key) {
				umostt = gs.get(s).getSkilld2(key, g.get(s)) - ga.get(s).getMon1arm();
				if (umostt >= 0) {
					return umostt;
				}
			}
		}
		return 0;
	}

	public int ubostt2(int key) { // 유저가 보스를 스킬 공격
		int ubostt;
		for (Integer s : gs.keySet()) {
			if (gs.get(s).skillBno == key) {
				ubostt = gs.get(s).getSkilld2(key, g.get(s)) - ga.get(s).getBossarm();
				if (ubostt >= 0) {
					return ubostt;
				}
			}
		}
		return 0;
	}

	public int umostt3(int key) { // 유저가 몬스터를 스킬 공격
		int umostt;
		for (Integer s : gs.keySet()) {
			if (gs.get(s).skillBno == key) {
				umostt = gs.get(s).getSkilld3(g.get(s)) - ga.get(s).getMon1arm();
				if (umostt >= 0) {
					return umostt;
				}
			}
		}
		return 0;
	}

	public int ubostt3(int key) { // 유저가 보스를 스킬 공격
		int ubostt;
		for (Integer s : gs.keySet()) {
			if (gs.get(s).skillBno == key) {
				ubostt = gs.get(s).getSkilld3(g.get(s)) - ga.get(s).getBossarm();
				if (ubostt >= 0) {
					return ubostt;
				}
			}
		}
		return 0;
	}

	public int boss(int clkey, int mkey) {
		for (Integer s : ga.keySet()) {
			if (ga.get(s).getmodMon() == mkey) {
				if (clkey == 1) {
					ga.get(s).setRoom(0);
					return 0;
				}
			}
		}
		return clkey;
	}

	public int charmoney(int key) {
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == key) {
				return g.get(s).getMoney();
			}
		}
		return 0;
	}

	public boolean swordbuy(int menu, int key) {
		for (Integer s : g.keySet()) {
			if (s == key) {
				if (menu == 1) {
					if (g.get(s).getMoney() >= gi.get(s).get목검가격()) {
						g.get(s).setStr(g.get(s).getStr() + gi.get(s).get목검att(), key);
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get목검가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 2) {
					if (g.get(s).getMoney() >= gi.get(s).get하급철검가격()) {
						g.get(s).setStr(g.get(s).getStr() + gi.get(s).get하급att(), key);
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get하급철검가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 3) {
					if (g.get(s).getMoney() >= gi.get(s).get중급철검가격()) {
						g.get(s).setStr(g.get(s).getStr() + gi.get(s).get중급att(), key);
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get중급철검가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 4) {
					if (g.get(s).getMoney() >= gi.get(s).get고급철검가격()) {
						g.get(s).setStr(g.get(s).getStr() + gi.get(s).get고급att(), key);
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get고급철검가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 5) {
					if (g.get(s).getMoney() >= gi.get(s).get명검가격()) {
						g.get(s).setStr(g.get(s).getStr() + gi.get(s).get명검att(), key);
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get명검가격());
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return false;
	}

	public boolean shieldbuy(int menu, int key) {
		for (Integer s : g.keySet()) {
			if (s == key) {
				if (menu == 1) {
					if (g.get(s).getMoney() >= gi.get(s).get나무방패가격()) {
						g.get(s).setDex(g.get(s).getDex() + gi.get(s).get나무arm(), key);
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get나무방패가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 2) {
					if (g.get(s).getMoney() >= gi.get(s).get하급철방패가격()) {
						g.get(s).setDex(g.get(s).getDex() + gi.get(s).get하급arm(), key);
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get하급철방패가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 3) {
					if (g.get(s).getMoney() >= gi.get(s).get중급철방패가격()) {
						g.get(s).setDex(g.get(s).getDex() + gi.get(s).get중급arm(), key);
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get중급철방패가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 4) {
					if (g.get(s).getMoney() >= gi.get(s).get고급철방패가격()) {
						g.get(s).setDex(g.get(s).getDex() + gi.get(s).get고급arm(), key);
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get고급철방패가격());
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return false;
	}

	public boolean Lntup(int menu, int key) {
		for (Integer s : g.keySet()) {
			if (s == key) {
				if (menu == 1) {
					if (g.get(s).getMoney() >= gi.get(s).get럭1가격()) {
						g.get(s).setLnt(g.get(s).getLnt() + gi.get(s).get증가량1());
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get럭1가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 2) {
					if (g.get(s).getMoney() >= gi.get(s).get럭2가격()) {
						g.get(s).setLnt(g.get(s).getLnt() + gi.get(s).get증가량2());
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get럭2가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 3) {
					if (g.get(s).getMoney() >= gi.get(s).get럭3가격()) {
						g.get(s).setLnt(g.get(s).getLnt() + gi.get(s).get증가량3());
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get럭3가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 4) {
					if (g.get(s).getMoney() >= gi.get(s).get럭4가격()) {
						g.get(s).setLnt(g.get(s).getLnt() + gi.get(s).get증가량4());
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get럭4가격());
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return false;
	}

	public boolean portionbuy(int menu, int key) {
		for (Integer s : g.keySet()) {
			if (s == key) {
				if (menu == 1) {
					if (g.get(s).getMoney() >= gi.get(s).get하급포션가격()) {
						g.get(s).setHp(g.get(s).getHp() + gi.get(s).get하급hp());
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get하급포션가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 2) {
					if (g.get(s).getMoney() >= gi.get(s).get중급포션가격()) {
						g.get(s).setHp(g.get(s).getHp() + gi.get(s).get중급hp());
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get중급포션가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 3) {
					if (g.get(s).getMoney() >= gi.get(s).get고급포션가격()) {
						g.get(s).setHp(g.get(s).getHp() + gi.get(s).get고급hp());
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get고급포션가격());
						return true;
					} else {
						return false;
					}
				} else if (menu == 4) {
					if (g.get(s).getMoney() >= gi.get(s).get엘릭서가격()) {
						g.get(s).setHp(g.get(s).getHp() + gi.get(s).get엘릭서hp());
						g.get(s).setMoney(g.get(s).getMoney() - gi.get(s).get엘릭서가격());
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return false;
	}

	public int clearMoney(int key) {
		for (Integer s : g.keySet()) {
			if (g.get(s).getBno() == key) {
				g.get(s).setMoney(g.get(s).getMoney() + ga.get(s).getMonsterMoney());
				return ga.get(s).getMonsterMoney();
			}
		}
		return 0;
	}
}