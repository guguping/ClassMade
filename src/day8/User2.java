package day8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class User2 {

	private String name;
	private String id;
	private String pw;
	private String joinDate;

	public User2() {
		DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss");
		this.joinDate = dtf.format(LocalDateTime.now());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(List<User2> list, int max) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean find = false;
			String id = sc.next();
			if (id.length() > max) {
				System.out.print("아이디는" + max + "글자 이상 사용 불가!\n다시입력 >");
				find = true;
			}
			for (User2 u : list) {
				if (u.getId().equals(id)) {
					System.out.println("중복된 아이디입니다\n다시입력 >");
					find = true;
				}
			}
			if (!find) {
				this.id = id;
				break;
			}
		}
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\t\n", name, id, pw, joinDate);
	}

}
