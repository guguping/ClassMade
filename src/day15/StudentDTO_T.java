package day15;

import java.util.Objects;

public class StudentDTO_T {
	private Long id; // 관리번호
	private String studentNumber; // 학번
	private String studentName; // 이름
	private String studentMajor; // 전공
	private String studentMobile; // 전화번호
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", studentNumber=" + studentNumber + ", studentName=" + studentName
				+ ", studentMajor=" + studentMajor + ", studentMobile=" + studentMobile + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, studentMajor, studentMobile, studentName, studentNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO_T other = (StudentDTO_T) obj;
		return Objects.equals(id, other.id) && Objects.equals(studentMajor, other.studentMajor)
				&& Objects.equals(studentMobile, other.studentMobile) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentNumber, other.studentNumber);
	}
	
	
	
	
	
	
}