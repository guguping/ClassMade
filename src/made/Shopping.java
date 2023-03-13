package made;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Shopping {
	private static int number = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");

	
	// 구매수량 구매액 필드 새로 만들기!!!
	private int bno;
	private String pw;
	private String title;
	private String writer;
	private int cnt;
	private String postDate;
	private int cell;
	
	private int usercnt;
	private int usercell;

	public int getCell() {
		return cell;
	}

	public int getUsercnt() {
		return usercnt;
	}

	public void setUsercnt(int usercnt) {
		this.usercnt = usercnt;
	}

	public int getUsercell() {
		return usercell;
	}

	public void setUsercell(int usercell) {
		this.usercell = usercell;
	}

	public void setCell(int cell) {
		this.cell = cell;
	}

	public Shopping() {

	}
	


	public Shopping(String title, int cnt, int cell) {
		this.bno = ++number;
		this.postDate = DTF.format(LocalDateTime.now());
		this.title = title;
		this.cnt = cnt;
		this.cell = cell;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Shopping.number = number;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public void print() {
		System.out.printf("%d\t%s\t%d\t%d\t%s\n", this.bno, this.title, this.cnt, this.cell, this.postDate);
	}

	public void print1() {
		System.out.printf("%d\t%s\t%d\t%d\t%s\n", this.bno, this.title , this.cnt, this.cell, this.postDate);
	}

}
