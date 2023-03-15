package day15;

import java.util.*;

public class StudentMain_T {

	public static void main(String[] args) {
		// 학생정보를 관리할 Map
		Map<Long, StudentDTO_T> studentMap = new HashMap<>();
		StudentDTO_T studentDTO = new StudentDTO_T();
		studentDTO.setId(1L);
		studentDTO.setStudentNumber("1111");
		studentDTO.setStudentName("김자바");
		studentDTO.setStudentMajor("컴퓨터공학");
		studentDTO.setStudentMobile("010-1111-1111");
		
		studentMap.put(studentDTO.getId(), studentDTO);
		
		StudentDTO_T studentDTO1 = new StudentDTO_T();
		studentDTO1.setId(2L);
		studentDTO1.setStudentNumber("2222");
		studentDTO1.setStudentName("이자바");
		studentDTO1.setStudentMajor("경영학");
		studentDTO1.setStudentMobile("010-2222-2222");
		
		studentMap.put(studentDTO1.getId(), studentDTO1);
		
		// 반복문으로 출력 
		for(Long id: studentMap.keySet()) {
			System.out.println(id);
			System.out.println(studentMap.get(id));
		}

	}

}
