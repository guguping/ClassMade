package day7;

public class Car {
	String name;
	String tire;
	String color;
	int speed;

	// 필드
	
//	접근제한자   //리턴타입  //메소드이름 //매개변수
//	public      void      run       () {
//		speed = speed + 1;
		// 메소드		
//	}
//	접근제한자   //리턴타입  //메소드이름 //매개변수
	public      void    speedRun    () {
		speed = speed+2;
	}
//	접근제한자   //리턴타입  //메소드이름 //매개변수		
	public		String	 speedUp(int speed) {
		String str = "스피드는"+speed;
		return str;
	}
		// 문제) 메서드 print만들기
		// 기능 : 이름 , 타이어 , 컬러 ,스피드 
		
	
	
	// 문제) 메서드 print만들기
	// 기능 : 이름 , 타이어 , 컬러 ,스피드
	
	public void print() {
		System.out.println(name+"/"+tire+"/"+color+"/"+speed);
	}
	
	// 문제)
	// 접근제한자 : public
	// 리턴타입 : 없음
	// 메소드명 : speedRun
	// 매개변수 : int s
	// 실행문구 "그랜져 speedRun메소드 호출됌"
//					스피드를 s만큼 올리기
	
	public void speedRun(int s) {
		System.out.println(name+"speedRun메소드 호출됌"+(speed+s));
		
	}
	
	// 문제)
	// 접근제한자 : public
	// 리턴타입 : String
	// 메소드명 : getColor
	// 매개변수 : 없음
	// 실행문구 : 컬러를 리턴
	
	public String getColor() {
		String get = color;
		return get;
	}
	
	
}
