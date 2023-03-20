package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_ClientRepository {
	Map<Integer, Map_BreakdownDTO> b = new HashMap<>();
	Map<String, Map_ClientDTO> c = new HashMap<>();
	private String login = null;
	private Integer key = null;
	private static Map_ClientRepository repository = new Map_ClientRepository();

	private Map_ClientRepository() {}
	public static Map_ClientRepository getInstance() {
		return repository;
	}
	public boolean save(Map_ClientDTO DTO) {
		if (c.put(DTO.getAccount(), DTO) == null) {
			return true;
		} else {
			return false;
		}
	}
	public boolean idCheak(String id) {
		for (String p : c.keySet()) {
			if (c.get(p).getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	public boolean loginCheak(String id, String pw) {
		for (String d : c.keySet()) {
			if (c.get(d).getId().equals(id) && c.get(d).getPassword().equals(pw)) {
				login = d;
				return true;
			}
		}
		return false;
	}
	public void delete() {
		c.remove(login);
		login = null;
	}
	public void update(String updatePassword) {
		c.get(login).setPassword(updatePassword);
		login = null;
	}
	public Map_ClientDTO findById() {
		if (login != null) {
			return c.get(login);
		}
		return null;
	}
	public Map<String, Map_ClientDTO> findAll() {
		return c;
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
	public boolean deposit(Map_ClientDTO Account, long money) {
		key = null;
		if (key == null) {
			Map_BreakdownDTO breakdownDTO = new Map_BreakdownDTO();
			breakdownDTO.getdw(Account, money, key);
			b.put(breakdownDTO.getDpo(), breakdownDTO);
			return true;
		}
		return false;
	}
	public boolean withdraw(Map_ClientDTO Account, long money) {
		key = 1;
		if (Account.getBalance() >= money && key == 1) {
			Map_BreakdownDTO breakdownDTO = new Map_BreakdownDTO();
			breakdownDTO.getdw(Account, money, key);
			b.put(breakdownDTO.getWit(), breakdownDTO);
			return true;
		} else {
			return false;
		}
	}
	public Map_ClientDTO getAccount(String transferAccount) {
		for (String d : c.keySet()) {
			if (c.get(d).getAccount().equals(transferAccount)) {
				return c.get(d);
			}
		}
		return null;
	}
}