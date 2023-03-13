package made_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
	UserRepsitroy repository = new UserRepsitroy();
	Scanner sc = new Scanner(System.in);
	
	public void save() {
		System.out.print("이메일 >");
		String email = sc.next();
		System.out.print("비밀번호 >");
		String password = sc.next();
		System.out.print("이름 >");
		String name = sc.next();
		System.out.print("나이 >");
		int age = sc.nextInt();
		UserDTO userDTO = new UserDTO(email,password,name,age);
		if(repository.save(userDTO)) {
			System.out.println("가입 완료");
		}else {
			System.out.println("가입 실패");
		}
	}
	
	public boolean FindbyLogin() {
		System.out.print("이메일 >");
		String loginId = sc.next();
		System.out.print("비밀번호 >");
		String loginPw = sc.next();
		if(repository.FindbyLogin(loginId, loginPw)) {
			System.out.println("로그인 성공");
			return true;
		}else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	public void findAll() {
		List<UserDTO> list = repository.findAll();
		System.out.println("이메일\t\t비밀번호\t이름\t나이\t가입일");
		System.out.println("-------------------------------------------------");
		for(UserDTO u : list) {
			System.out.println(u.toString());
		}
	}
	
	public void ReUser() {
		System.out.print("이름 확인 >");
		String userName = sc.next();
		UserDTO DTO =repository.ReUserck(userName);
		if(DTO == null) {
			System.out.println("본인확인 실패");
		}else {
			System.out.println("본인확인 성공");
			System.out.println("---------");
			UserDTO userDTO = new UserDTO();
			System.out.print("수정 이메일 >");
			userDTO.setEmail(sc.next());
			System.out.print("수정 비밀번호 >");
			userDTO.setPassword(sc.next());
			System.out.print("수정 나이 >");
			userDTO.setAge(sc.nextInt());
			if(repository.ReUser(userDTO,userName)) {
				System.out.println("수정 완료");
			}else {
				System.out.println("수정 실패");
			}
		}
	}
	
	public void Remove() {
		System.out.print("이름 확인 >");
		String userName = sc.next();
		UserDTO DTO = repository.ReUserck(userName);
		if(DTO == null) {
			System.out.println("본인확인 실패");
		}else {
			repository.Remove(DTO);
			System.out.println("삭제 완료");
		}
	}
	
}
