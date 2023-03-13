package day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Board {//필드는 각각 개체가 고유하게 가진 데이터
	//스태틱을 알아보자 = 스태틱은 공유
	private static int number = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
			//변경 불가능한 값을 표기할때 final을 앞에 붙여준다
	private int bno;
	private String pw;
	private String title;
	private String writer;
	private int cnt;
	private String postDate;

	public Board() {//객체를 생성하는 생성자 보드에 스태틱 넘버를 넣어 생성자 보드로 객체를 만들면 1씩증가하게함
		this.bno = ++number;
		this.cnt = 0;
		this.postDate = DTF.format(LocalDateTime.now());
		
		//객체가 생성될때 자동으로값이 들어가는 개체들을 굳이 적지 않고 자동으로 들어가게 함 
				
	}

	public Board(String title , String writer , String pw) {
		this.bno = ++number;
		this.cnt = 0;
		this.postDate = DTF.format(LocalDateTime.now());
		this.title = title;
		this.writer = writer;
		this.pw = pw;
	}

	public int getBno() {
		return this.bno;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return this.writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void increaseCnt() {
		this.cnt++;
	}
	
	public void print() {
		System.out.printf("%d\t%s\t\t%s\t%d\t%s\n",bno,title,writer,cnt,postDate);
	}
}
