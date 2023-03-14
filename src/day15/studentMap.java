package day15;

import java.util.HashMap;
import java.util.Map;

public class studentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDTO s = new StudentDTO();
		Map<Integer, String> map2 = new HashMap<>();

		s.setStudentNumer(1111);
		s.setStudentName("김자바");
		s.setStuentMajor("컴퓨터공학");
		s.setStuentMobile("010-1111-1111");

		map2.put(1, s.toString());
		s.setStudentNumer(2222);
		s.setStudentName("이자바");
		s.setStuentMajor("경영학");
		s.setStuentMobile("010-2222-2222");

		map2.put(2, s.toString());
		s.setStudentNumer(3333);
		s.setStudentName("박자바");
		s.setStuentMajor("전자공학");
		s.setStuentMobile("010-3333-3333");

		map2.put(3, s.toString());

		System.out.println("id\tStudentNumer\tStudentName\tStuentMajor\tStuentMobile");
		System.out.println("----------------------------------------------------------------------");
		for (int key : map2.keySet()) {
			System.out.print(key + "\t");
			System.out.println(map2.get(key));
		}
//======================================================================================================================
		//다른 방법 이게 더 맞는듯
//		Map<Integer, StudentDTO> student = new HashMap<>();
//		StudentDTO s1 = new StudentDTO();
//		s1.setStudentNumer(1111);
//		s1.setStudentName("김자바");
//		s1.setStuentMajor("컴퓨터공학");
//		s1.setStuentMobile("010-1111-1111");
//		student.put(1, s1);
//		
//		StudentDTO s2 = new StudentDTO();
//		s2.setStudentNumer(2222);
//		s2.setStudentName("이자바");
//		s2.setStuentMajor("경영학");
//		s2.setStuentMobile("010-2222-2222");
//		student.put(2, s2);
//		
//		StudentDTO s3 = new StudentDTO();
//		s3.setStudentNumer(3333);
//		s3.setStudentName("박자바");
//		s3.setStuentMajor("전자공학");
//		s3.setStuentMobile("010-3333-3333");
//		student.put(3, s3);
//		
//	
//		System.out.printf("번호(id)\t학번\t이름\t전공\t전화번호\n");
//		System.out.println("================================================");
//		for(int key:student.keySet()) {
//			System.out.println(key+"\t"+student.get(key).toString());
//			
//		}
	}
}
