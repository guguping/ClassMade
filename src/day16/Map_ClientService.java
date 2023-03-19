package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class Map_ClientService {
	private Scanner sc = new Scanner(System.in);
	// 싱글톤패턴
	Map_ClientRepository br = Map_ClientRepository.getInstance();
	private static Map_ClientService service = new Map_ClientService();

	private Map_ClientService() {
	}

	public static Map_ClientService getInstance() {
		return service;
	}
	// 싱글톤패턴
	private String loginId = null;
	private String loginPw = null;

	public void save() {
		Map_ClientDTO DTO = new Map_ClientDTO();
		while (true) {
			System.out.print("id >");
			String id = sc.next();
			if (br.idCheak(id)) {
				System.out.println("중복 아이디");
				continue;
			}
			DTO.setId(id);
			System.out.print("password >");
			DTO.setPassword(sc.next());
			System.out.print("이름 >");
			DTO.setName(sc.next());
			if (br.save(DTO)) {
				System.out.println("가입 성공");
				break;
			} else {
				System.out.println("세션 오류");
			}
		}
	}
	public boolean loginCheak() {
		System.out.print("id >");
		String id = sc.next();
		System.out.print("pw >");
		String pw = sc.next();
		if (br.loginCheak(id, pw)) {
			System.out.println("로그인 성공");
			loginId = id;
			loginPw = pw;
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	public void findAll() {
		Map<String, Map_ClientDTO> cList = br.findAll();
		ArrayList<String> keyset = new ArrayList<>(cList.keySet());
		keyset.sort(Comparator.naturalOrder());
		System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
		System.out.println("----------------------------------------------------");
		for (String c : keyset) {
			System.out.println(cList.get(c).toString());
		}
	}
	public void logout() {
		loginId = null;
		loginPw = null;
		System.out.println("로그아웃");
	}
	public boolean delete() {
		if (br.loginCheak(loginId, loginPw)) {
			br.delete();
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		return false;
	}
	public boolean update() {
		System.out.print("비밀번호 확인 >");
		String passowrd = sc.next();
		if (loginPw.equals(passowrd)) {
			System.out.print("수정할 비밀번호 >");
			String updatePassword = sc.next();
			if (br.loginCheak(loginId, loginPw)) {
				br.update(updatePassword);
				System.out.println("업데이트 성공");
				loginId = null;
				loginPw = null;
				return true;
			} else {
				System.out.println("업데이트 실패");
				return false;
			}
		} else {
			System.out.println("비밀번호 확인필요");
			return false;
		}
	}
	public void findById() {
		Map_ClientDTO d = br.findById();
		if (d == null) {
			System.out.println("이걸본 당신 최고야");
		} else {
			System.out.println("----------------------------▼사용자정보▼-----------------------------");
			System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
			System.out.println("------------------------------------------------------------------");
			System.out.println(d.toString());
			if (br.breakList(d.getAccount()).size() == 0) {
				System.out.println("----------------------------▼입출금내역▼-----------------------------");
				System.out.println("계좌번호\t\t거래내역\t거래액\t잔액\t가입일");
				System.out.println("입출금 내역이 없습니다");
			} else {
				System.out.println("----------------------------▼입출금내역▼-----------------------------");
				System.out.println("계좌번호\t\t거래내역\t거래액\t잔액\t가입일");
				for (Map_BreakdownDTO w : br.breakList(d.getAccount())) {
					System.out.println(w.toString());
				}
			}
			System.out.println("-----------------------------------------------------------------");
		}

	}
	public void deposit() {
		Map_ClientDTO account = br.findById();
		if (account == null) {
			System.out.println("이걸본 당신 최고야");
		} else {
			System.out.print("입금 금액 >");
			long money = sc.nextLong();
			if (br.deposit(account, money)) {
				System.out.println("입금 성공");
			} else {
				System.out.println("입금 실패");
			}
		}
	}
	public void withdraw() {
		Map_ClientDTO Account = br.findById();
		if (Account == null) {
			System.out.println("이걸본 당신 최고야");
		} else {
			System.out.print("출금 금액 >");
			long money = sc.nextLong();
			if (br.withdraw(Account, money)) {
				System.out.println(money + "원 출금 완료");
			} else {
				System.out.println("잔액 부족");
			}
		}
	}
	public void transfer() {
		Map_ClientDTO Account = br.findById();
		if (Account == null) {
			System.out.println("로그인 오류");
			return;
		}
		System.out.println("이체받는 계좌 >");
		String transferAccount = sc.next();
		System.out.println("이체하는 금액 >");
		long transferMoney = sc.nextLong();
		if (br.getAccount(transferAccount)!=null) {
			if (br.withdraw(Account, transferMoney)) {
				if (br.deposit(br.getAccount(transferAccount) , transferMoney)) {
					System.out.println("이체 완료");
				}
			} else {
				System.out.println("출금계좌 잔액 부족");
			}
		} else {
			System.out.println("이체 계좌 확인");
		}
	}
}