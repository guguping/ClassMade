package test_code;

import java.util.*;

public class StudentRepository {
	// 싱글톤 패턴을 구현하시오.
	private static StudentRepository sr = new StudentRepository();

	public StudentRepository() {
	}

	public static StudentRepository getInstance() {
		return sr;
	}

	private Map<String, StudentDTO> studentMap = new HashMap<>();

	public boolean save(StudentDTO studentDTO) {
		// 저장을 위한 코드를 구현하시오.
		if (studentMap.put(studentDTO.getStudentNumber(), studentDTO) == null) {
			return true;
		} else {
			return false;
		}
	}

	public Map<String, StudentDTO> findAll() {
		// map을 리턴하기 위한 코드를 구현하시오.
		return studentMap;
	}

}
