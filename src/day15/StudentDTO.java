package day15;

public class StudentDTO {
	
	int studentNumer;
	String studentName;
	String stuentMajor;
	String stuentMobile;
	public int getStudentNumer() {
		return studentNumer;
	}
	public void setStudentNumer(int studentNumer) {
		this.studentNumer = studentNumer;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStuentMajor() {
		return stuentMajor;
	}
	public void setStuentMajor(String stuentMajor) {
		this.stuentMajor = stuentMajor;
	}
	public String getStuentMobile() {
		return stuentMobile;
	}
	public void setStuentMobile(String stuentMobile) {
		this.stuentMobile = stuentMobile;
	}
	public String toString() {
		String str =  studentNumer+ "\t\t" +studentName+ "\t\t" +stuentMajor+ "\t\t" +stuentMobile;
		return str;
	}
}
