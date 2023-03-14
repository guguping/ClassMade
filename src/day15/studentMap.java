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
	}
}
