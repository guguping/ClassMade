package day7;

public class Fruit {
	private String name;
	 String color;
	 boolean isSeed;

//	 public Fruit() {
//		 System.out.println("기본 생성자");
	// 생성자 특징 1. 리턴타입이 없다
	// 2. 생성자 명이 클래스 이름과 동일하다.
	// 3.기본생성자는 작성하지 않아도 자동으로 숨겨져 만들어진다
//		 
//	 }
	public Fruit() {
	}
	public Fruit(String name, String color, boolean isSeed) { 
		System.out.println("생성자1");
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
		// 필드에 값을 넣음과 동시에 생성하고 싶을때 생성자를 사용한다
		// 이런경우 기본 생성자를 수동으로 생성해주어야 한다
	}
	public Fruit( boolean isSeed ,String color,String name) { 
		System.out.println("생성자1");
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	// 생성자 오버로딩 : 매개 변수를 다르게 하는 생성자를 여러 개 선언 하는것

}
