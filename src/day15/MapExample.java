package day15;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map 은 키와 벨류로 나누어지고
		//list , 배열과는 다르게
		//index가 자동으로 지정되는게 아닌 키의 이름을 제작자가 지정할 수 있다
		
		Map<Integer, String> map1 = new HashMap<>();
		// Map 이라는 인터페이스에 		 HashMap 이라는 클래스의 생성자를 사용
		// Map 을 사용할때는 어떤타입의 키를 쓸건지와 어떤 타입의 벨류를 쓸건지 정해줘야함
		List<String> list1 = new ArrayList<>();
		// List이라는 인터페이스에  		ArrayList 라는 클래스의 생성자를 사용
		
		map1.put(1,"안녕하세요");
		
		map1.get(1);
		
	}

}
