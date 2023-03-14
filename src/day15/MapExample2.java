package day15;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map2 = new HashMap<>();
		
		map2.put("첫번째", "java");
		map2.put("두번째", "mysql");
		map2.put("세번째", "spring");
		
//		System.out.println(map2.get("두번째"));
//		
		map2.remove("세번째");
//		System.out.println(map2.get("세번째"));
		// key는 문자도 가능하다
		// Map은 무조건 key로 접근해야한다
		
		// Map은 규칙이 없이 값을 넣을 수 있기 때문에 반복문 사용이 조금 어렵다
		for(String key : map2.keySet()) {
			System.out.println(key);// key값 확인
			System.out.println(map2.get(key)); //value값 확인	
		}
	}

}
