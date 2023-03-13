package day8;

public class User {
	//sc.hasNextInt() > 입력받은 수가 숫자면 참 문자면 거짓
	//sc.nextLine() > 띄어쓰기까지 문장을 입력받을 수 있음
	
	private String name;
	private String id;
	private String pw;
	
	public User() {
		
	}
	public User(String name ,String id,String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
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
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\n",name,id,pw);
	}
	
}
