package day11;

import java.util.ArrayList;
import java.util.List;

public class UserRepsitroy {
	List<UserDTO> list = new ArrayList<>();

	public boolean save(UserDTO userDTO) {
		return list.add(userDTO);
	}

	public boolean LoginCheck(String id , String pw) {
		for(UserDTO userDTO : list) {
			if(userDTO.getEmail().equals(id)&&userDTO.getPassword().equals(pw)) {
				return true;
			}
		}
		return false;
	}
	
	public List<UserDTO> findAll(){
		return list;
	}
	
	public boolean ReUserck(String name) {
		for(UserDTO userDTO : list) {
			if(userDTO.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public UserDTO findById(String loginEmail , String loginPassword) {
		for(UserDTO u : list) {
			if(loginEmail.equals(u.getEmail())&&loginPassword.equals(u.getPassword())) {
				return u;
			}
		}
		return null;
	}


}
