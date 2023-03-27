package test_code;

import java.util.*;

public class StudentService {
	// 싱글톤 객체를 가져오기 위한 코드를 구현하시오.
	StudentRepository sr = StudentRepository.getInstance();

	Scanner sc = new Scanner(System.in);

	public void save() {
		// 학생 정보를 입력받고 처리결과를 출력하는 코드를 구현하시오.
		StudentDTO DTO = new StudentDTO();
		System.out.print("이름 >");
		DTO.setStudentName(sc.next());
		System.out.print("휴대폰 번호>");
		DTO.setStudentMobile(sc.next());
		System.out.print("학과 >");
		DTO.setStudentMajor(sc.next());
		if(sr.save(DTO)) {
			System.out.println("등록완료");
		}else {
			System.out.println("등록실패");
		}
		
	}

	public void findAll() {
		// map을 가져오기 위한 코드 및 출력을 위한 코드를 구현하시오.
		for(String s : sr.findAll().keySet()) {
			System.out.println(sr.findAll().get(s).toString());
		}
	}

}
