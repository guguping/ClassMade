package day13;

import java.util.ArrayList;
import java.util.List;


public class ClientRepository {
	List<ClientDTO> cList = new ArrayList<>();
	List<BreakdownDTO> bList = new ArrayList<>();
	private static ClientRepository repository = new ClientRepository();

	private ClientRepository() {
	}

	public static ClientRepository getInstance() {
		return repository;
	}

	public boolean save(ClientDTO clientDTO) {
		return cList.add(clientDTO);
	}

	public boolean loginCheak(String id, String pw) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(id) && c.getPassword().equals(pw)) {
				return true;
			}
		}
		return false;
	}

	public List<ClientDTO> findAll() {
		return cList;
	}

	public boolean delete(String loginId, String loginPw) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(loginId) && c.getPassword().equals(loginPw)) {
				cList.remove(c);
				return true;
			}
		}
		return false;
	}

	public boolean update(String loginId, String loginPw, String updatePassword) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(loginId) && c.getPassword().equals(loginPw)) {
				c.setPassword(updatePassword);
				return true;
			}
		}
		return false;
	}

	public boolean deposit(String Account, long money) {
		for (ClientDTO c : cList) {
			if (c.getAccount().equals(Account)) {
				c.setBalance(c.getBalance() + money);
				BreakdownDTO breakdownDTO = new BreakdownDTO();
				breakdownDTO.setAccount(Account);
				breakdownDTO.setDivision("입금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(c.getBalance());
				bList.add(breakdownDTO);
				return true;
			}
		}
		return false;
	}

	public boolean withdraw(String Account, long money) {
		for (ClientDTO c : cList) {
			if (c.getAccount().equals(Account)) {
				if (c.getBalance() >= money) {
					c.setBalance(c.getBalance() - money);
					BreakdownDTO breakdownDTO = new BreakdownDTO();
					breakdownDTO.setAccount(Account);
					breakdownDTO.setDivision("출금");
					breakdownDTO.setDealMoney(money);
					breakdownDTO.setTotalMoney(c.getBalance());
					bList.add(breakdownDTO);
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}

	public String getAccount(String loginId, String loginPw) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(loginId) && c.getPassword().equals(loginPw)) {
				return c.getAccount();
			}
		}
		return null;
	}

	public ClientDTO findById(String loginId, String loginPw) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(loginId) && c.getPassword().equals(loginPw)) {
				return c;
			}
		}
		return null;
	}

	public List<BreakdownDTO> breakList(String Account) {
		List<BreakdownDTO> list = new ArrayList<>();
		for (BreakdownDTO b : bList) {
			if (b.getAccount().equals(Account)) {
				list.add(b);
			}
		}
		return list;
	}
	public boolean transferCheck(String Account) {
		for(ClientDTO c : cList) {
			if(c.getAccount().equals(Account)) {
				return true;
			}
		}
		return false;
	}
}
