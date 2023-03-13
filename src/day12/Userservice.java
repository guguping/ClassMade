package day12;

import java.util.List;
import java.util.Scanner;

public class Userservice {

	String loginEmail = null;
	String loginPassword = null;
	// static 변수로 객체 생성
//	Util util = new Util();
	private static Userservice service = new Userservice();

	// 외부에서 new로 생성할 수 없게 생성자를 private으로 선언
	private Userservice() {
		// 필드로 선언된 객체를 리턴하는 메소드
	}

	public static Userservice getInstance() {
		return service;
	}

	UserRepository repository = UserRepository.getInstance(); // 싱글톤으로 만든 객체를 사용하는 방법
	Scanner sc = new Scanner(System.in);

	public void save() {
		UserDTO userDTO = new UserDTO();
		System.out.print("이름 >");
		userDTO.setName(sc.next());
		System.out.print("이메일 >");
		userDTO.setEmail(sc.next());
		Util.overlapCheck(repository.list ,userDTO);
		System.out.print("비밀번호 >");
		userDTO.setPassword(sc.next());
		System.out.print("나이 >");
		userDTO.setAge(sc.nextInt());
		userDTO.setGender(Util.genderCheak());
		if (repository.save(userDTO)) {
			System.out.println("회원가입 완료");
		} else {
			System.out.println("회원가입 실패");
		}
	}

	public boolean login() {
		System.out.print("이메일 입력 >");
		String email = sc.next();
		System.out.print("비밀번호 입력 >");
		String pw = sc.next();

		if (repository.login(email, pw)) {
			System.out.println("로그인 성공");
			loginEmail = email;
			loginPassword = pw;
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}
	}

	public void list() {
		List<UserDTO> array = repository.list();
		System.out.println("이메일\t\t비밀번호\t이름\t나이\t성별\t가입일");
		System.out.println("--------------------------------------------------------");
		for (UserDTO s : array) {
			System.out.println(s.toString());
		}
	}

	public void domainChange() {
		String before = UserDTO.getDomain();
		System.out.print("변경할 도메인 >");
		UserDTO.setDomain(sc.next());
		System.out.println(before + "=>" + UserDTO.getDomain() + "변경완료!");
	}

	public void findById() {
		if (loginEmail == null || loginPassword == null) {
			System.out.println("로그인 오류");
			return;
		}
		UserDTO userDTO = repository.findById(loginEmail, loginPassword);
		if (userDTO == null) {
			System.out.println("세션 오류");
		} else {
			System.out.println("이메일\t\t비밀번호\t이름\t나이\t성별\t가입일");
			System.out.println("--------------------------------------------------------");
			System.out.println(userDTO.toString());
		}
	}

	public boolean logout() {
		loginEmail = null;
		loginPassword = null;
		return false;
	}

	public boolean upDate() {
		UserDTO userDTO = repository.findById(loginEmail, loginPassword);
		if (userDTO == null) {
			System.out.println("세션 오류");
			return true;
		} else {
			UserDTO userDTO1 = new UserDTO();
			System.out.print("이름 >");
			userDTO1.setName(sc.next());;
			System.out.print("나이 >");
			userDTO1.setAge(sc.nextInt());
			System.out.print("비밀번호 >");
			userDTO1.setPassword(sc.next());
			if(repository.upDate( userDTO1 ,userDTO)) {
				loginEmail = null;
				loginPassword = null;
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
			}
			return false;
		}
	}
	public boolean delete() {
		UserDTO userDTO = repository.findById(loginEmail, loginPassword);
		if(userDTO == null) {
			System.out.println("오류덩어리!");
			return true;
		}else {
			repository.userout(userDTO);
			System.out.println("탈퇴 완료");
			loginEmail = null;
			loginPassword = null;
			return false;
		}
	}
}
