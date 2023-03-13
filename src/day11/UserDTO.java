package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserDTO {
	private final static DateTimeFormatter DFT = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private static String domain = "naver.com"; 
	
	private String email;
	private String password;
	private String name;
	private int age;
	private String joinDate;

	public UserDTO() {
		this.joinDate = DFT.format(LocalDateTime.now());
	}

	public UserDTO(String email, String password, String name, int age) {
		this(); // 기본 생성자 호출
		this.email = email +"@"+domain;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	public static String getDomain() {
		return domain;
	}
	
	public static void setDomain(String domain) {
		
		UserDTO.domain = domain;
		// static을 메소드에 넣으면 공용 메소드가 되는데 공유 메서드에서는 this를 사용할 수 없다
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJoinDate() {
		return joinDate;
	}
	
	public String toString() {
		return email+"\t"+password+"\t"+name+"\t"+age+"\t"+joinDate;
		// UserDTO를 숨겨져있는 toString을 상속받아 오버라이딩 한 모습
		// toString은 재정의 하지 않으면 출력이 정상적으도되지 않는다
	}

}
