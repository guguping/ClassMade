package made_1;

import java.util.ArrayList;
import java.util.List;

public class UserRepsitroy {
	List<UserDTO> list = new ArrayList<>();

	public boolean save(UserDTO userDTO) {
		return list.add(userDTO);
	}

	public boolean FindbyLogin(String id , String pw) {
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
	
	public UserDTO ReUserck(String name) {
		for(UserDTO userDTO : list) {
			if(userDTO.getName().equals(name)) {
				return userDTO;
			}
		}
		return null;
	}
	
	public boolean ReUser(UserDTO userDTO , String userName) {
		for(UserDTO s : list) {
			if(s.getName().equals(userName)) {
				s.setEmail(userDTO.getEmail()+"@"+userDTO.getDomain());
				s.setPassword(userDTO.getPassword());
				s.setAge(userDTO.getAge());
				return true;		
			}
		}
		return false;
	}
	
	public void Remove(UserDTO userDTO) {
		list.remove(userDTO);
	}
	

}
