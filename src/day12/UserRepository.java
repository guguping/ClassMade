package day12;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	// static 변수로 객체 생성
	private static UserRepository repository = new UserRepository();

	// 외부에서 new로 생성할 수 없게 생성자를 private으로 선언
	private UserRepository() {
		// 필드로 선언된 객체를 리턴하는 메소드
	}

	public static UserRepository getInstance() {
		return repository;
	}

	List<UserDTO> list = new ArrayList<>();

	public boolean save(UserDTO userDTO) {
		return list.add(userDTO);

	}

	public boolean login(String Email, String pw) {
		for (UserDTO s : list) {
			if (s.getEmail().equals(Email) && s.getPassword().equals(pw)) {
				return true;
			}
		}
		return false;
	}

	public List<UserDTO> list() {
		return list;
	}

	public UserDTO findById(String loginEmail, String loginPassword) {
		for (UserDTO s : list) {
			if (s.getEmail().equals(loginEmail) && s.getPassword().equals(loginPassword)) {
				return s;
			}
		}
		return null;
	}

	public void userout(UserDTO userDTO) {
		list.remove(userDTO);
	}

	public boolean upDate(UserDTO userDTO1 , UserDTO userDTO) {
		for (UserDTO s : list) {
			if (s.equals(userDTO)) {
				s.setName(userDTO1.getName());
				s.setAge(userDTO1.getAge());
				s.setPassword(userDTO1.getPassword());
				return true;
			}
		}
		return false;
	}

}
