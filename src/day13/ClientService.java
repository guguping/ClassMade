package day13;

import java.util.List;
import java.util.Scanner;

public class ClientService {
	private Scanner sc = new Scanner(System.in);
	// 싱글톤패턴
	ClientRepository repository = ClientRepository.getInstance();
	private static ClientService service = new ClientService();
	private ClientService() {}
	public static ClientService getInstance() {
		return service;
	}
	// 싱글톤패턴
	private String loginId = null;
	private String loginPw = null;

	public void save() {
		ClientDTO clientDTO = new ClientDTO();
		System.out.print("id >");
		clientDTO.setId(sc.next());
		System.out.print("password >");
		clientDTO.setPassword(sc.next());
		System.out.print("이름 >");
		clientDTO.setName(sc.next());
		if (repository.save(clientDTO)) {
			System.out.println("회원가입 완료");
		} else {
			System.out.println("회원가입 실패");
		}
	}

	public boolean loginCheak() {
		System.out.print("id >");
		String id = sc.next();
		System.out.print("pw >");
		String pw = sc.next();
		if(repository.loginCheak(id , pw)) {
			System.out.println("로그인 성공");
			loginId = id;
			loginPw = pw;
			return true;
		}else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	public void findAll() {
		List<ClientDTO> cList = repository.findAll();
		System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
		System.out.println("----------------------------------------------------");
		for(ClientDTO c : cList) {
			System.out.println(c.toString());
		}
	}
	public void logout() {
		loginId = null;
		loginPw = null;
		System.out.println("로그아웃");
	}
	
	public boolean delete() {
		if(repository.delete(loginId , loginPw)) {
			System.out.println("삭제 성공");
			return false;
		}else {
			System.out.println("삭제 실패");
			return true;
		}
	}
	public void update() {
		System.out.print("비밀번호 확인 >");
		String passowrd = sc.next();
		if(loginPw.equals(passowrd)) {
		System.out.print("수정할 비밀번호 >");
		String updatePassword = sc.next();
		if(repository.update(loginId , loginPw ,updatePassword)) {
			loginPw = updatePassword;
			System.out.println("업데이트 성공");
		}else {
			System.out.println("업데이트 실패");
		}
		}else {
			System.out.println("세션 만료");
		}
	}
	public void deposit() {
		String account = repository.getAccount(loginId , loginPw);
		if(account == null) {
			System.out.println("이걸본 당신 최고야");
		}else {
			System.out.print("입금 금액 >");
			long money = sc.nextLong();
			if(repository.deposit(account,money)) {
				System.out.println("입금 성공");
			}else {
				System.out.println("입금 실패");
			}
		}
	}
	public void findById() {
		ClientDTO clientDTO = repository.findById(loginId , loginPw);
		if(clientDTO == null) {
			System.out.println("이걸본 당신 최고야");
		}else {
			System.out.println("----------------------------▼사용자정보▼-----------------------------");
			System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
			System.out.println("------------------------------------------------------------------");
			System.out.println(clientDTO.toString());
			List<BreakdownDTO> bList = repository.breakList(clientDTO.getAccount());
			if(bList.size()==0) {
				System.out.println("----------------------------▼입출금내역▼-----------------------------");
				System.out.println("입출금 내역이 없습니다");
			}else {
				System.out.println("----------------------------▼입출금내역▼-----------------------------");
				System.out.println("계좌번호\t\t거래내역\t거래액\t잔액\t가입일");
				for(BreakdownDTO b : bList) {
					System.out.println(b.toString());
				}
			}
			System.out.println("-----------------------------------------------------------------");
		}
	}
	public void withdraw() {
		String Account = repository.getAccount(loginId, loginPw);
		if(Account == null) {
			System.out.println("이걸본 당신 최고야");
		}else {
			System.out.print("출금 금액 >");
			long money = sc.nextLong();
			if(repository.withdraw(Account,money)) {
				System.out.println(money+"원 출금 완료");
			}else {
				System.out.println("잔액 부족");
			}
		}
	}
	public void transfer() {
		String Account = repository.getAccount(loginId, loginPw);
		if(Account == null) {
			System.out.println("로그인 오류");
			return;
		}
		System.out.println("이체받는 계좌 >");
		String transferAccount = sc.next();
		System.out.println("이체받는 금액 >");
		long transferMoney = sc.nextLong();
		if(repository.transferCheck(transferAccount)) {
			if(repository.withdraw(Account, transferMoney)) {
				if(repository.deposit(transferAccount, transferMoney)) {
					System.out.println("이체 완료");
				}
			}else {
				System.out.println("출금계좌 잔액 부족");
			}
		}else {
			System.out.println("이체 계좌 확인");
		}
	}
}
