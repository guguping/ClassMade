package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day11.BoardDTO;

public class Map_ClientRepository {
	Map<Integer, Map_BreakdownDTO> b = new HashMap<>();
	Map<String, Map_ClientDTO> c = new HashMap<>();
	private static Map_ClientRepository repository = new Map_ClientRepository();

	private Map_ClientRepository() {
	}

	public static Map_ClientRepository getInstance() {
		return repository;
	}

	public boolean save(Map_ClientDTO DTO) {
		Map_ClientDTO result = c.put(DTO.getAccount(), DTO);
		if(result == null) {
			return true;
		}else {
			return false;
		}
	}

	public boolean loginCheak(String id, String pw) {
		for(String d : c.keySet()) {
			if(c.get(d).getId().equals(id)&&c.get(d).getPassword().equals(pw)){
				return true;
			}
		}
		return false;
	}

	public Map<String, Map_ClientDTO> findAll() {
		return c;
	}

	public boolean delete(String loginId, String loginPw) {
		for(String d : c.keySet()) {
			if(c.get(d).getPassword().equals(loginPw)&&c.get(d).getId().equals(loginPw)) {
				c.remove(d);
				return true;
			}
		}
		return false;
	}
	public boolean update(String loginId, String loginPw, String updatePassword) {
		for(String d : c.keySet()) {
			if(c.get(d).getPassword().equals(loginPw)&&c.get(d).getId().equals(loginId)) {
				c.get(d).setPassword(updatePassword);
				return true;
			}
		}
		return false;
	}
	public boolean deposit(String Account, long money) {
		for(String d : c.keySet()) {
			if(c.get(d).getAccount().equals(Account)) {
				c.get(d).setBalance(c.get(d).getBalance()+money);
				Map_BreakdownDTO breakdownDTO = new Map_BreakdownDTO();
				breakdownDTO.setAccount(Account);
				breakdownDTO.setDivision("입금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(c.get(d).getBalance());
				b.put(breakdownDTO.getDpo(),breakdownDTO);
				return true;
			}
		}
		return false;
	}
	public boolean withdraw(String Account, long money) {
		for(String d : c.keySet()) {
			if(c.get(d).getAccount().equals(Account)) {
				if(c.get(d).getBalance() >= money) {
					c.get(d).setBalance(c.get(d).getBalance()-money);
					Map_BreakdownDTO breakdownDTO = new Map_BreakdownDTO();
					breakdownDTO.setAccount(Account);
					breakdownDTO.setDivision("출금");
					breakdownDTO.setDealMoney(money);
					breakdownDTO.setTotalMoney(c.get(d).getBalance());
					b.put(breakdownDTO.getWit(),breakdownDTO);
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}
	public String getAccount(String loginId, String loginPw) {
		for(String s : c.keySet()) {
			if(c.get(s).getId().equals(loginId)&&c.get(s).getPassword().equals(loginPw)) {
				return c.get(s).getAccount();
			}
		}
		return null;
	}
	public Map_ClientDTO findById(String loginId, String loginPw) {
		for(String d : c.keySet()) {
			if(c.get(d).getId().equals(loginId)&&c.get(d).getPassword().equals(loginPw)) {
				return c.get(d);
			}
		}
		return null;
	}
	public List<Map_BreakdownDTO> breakList(String Account) {
		List<Map_BreakdownDTO> list = new ArrayList<>();
		for (Integer q : b.keySet()) {
			if (b.get(q).getAccount().equals(Account)) {
				list.add(b.get(q));
			}
		}
		return list;
	}
	public boolean transferCheck(String Account) {
		for(String d : c.keySet()) {
			if(c.get(d).getAccount().equals(Account)) {
				return true;
			}
		}
		return false;
	}
}
