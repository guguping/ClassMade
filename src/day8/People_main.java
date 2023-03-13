package day8;

public class People_main {
	public static void main(String[] arge) {
		People p1 = new People();
//		p1.name = "홍길동"; 클래스의 변수가 프리베잇이기 떄문에 이렇게 넣을 수 없음
		p1.setName("홍길동");

//		System.out.println(p1.name); 마찬가지로 프리베잇이기에 넣어지지 않아 출력도 불가능하다
		System.out.println(p1.getNane());
		System.out.println(p1.getAge());
		if(true) {
			System.out.println(p1.ageUp());
		}
		
		People p2 = new People("이순신", 90);
		System.out.printf(p2.getNane()+"\n"+p2.getAge()+"\n");
		
		if(true) {
			System.out.println(p2.ageUp());
		}

	}
}
