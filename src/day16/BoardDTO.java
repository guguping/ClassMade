package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BoardDTO {
	// 데이터를 담아놓는 곳 class를 DTO , VO 라고 한다
	private static int number = 100;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String bno;
	private String rebno;
	private String title;
	private String writer;
	private int cnt;
	private String postDate;
	
	public BoardDTO() {
		this.bno = "B"+ number++;
		this.postDate = DTF.format(LocalDateTime.now());
	}
	
	public void setRebno() {
		this.bno = this.rebno;
	}
	
	public String getBno() {
		return bno;
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
	public void increasesetCnt() {
		this.cnt++;
	}
	public String getPostDate() {
		return postDate;
	}
	public void print() {
		System.out.printf("%s\t%s\t\t%s\t%d\t%s\n",bno,title,writer,cnt,postDate);
	}

	@Override
	public String toString() {
		return "\t"+ title + "\t\t" + writer + "\t" + cnt + "\t" + postDate+"\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bno, cnt, postDate, title, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardDTO other = (BoardDTO) obj;
		return Objects.equals(bno, other.bno) && cnt == other.cnt && Objects.equals(postDate, other.postDate)
				&& Objects.equals(title, other.title) && Objects.equals(writer, other.writer);
	}
	
	
}
