package day10_1;

public abstract class Animal {
	// abstract class 클래스에 추상 메소드가 하나라도 존재하면 추상 클레스라고 한다
	// 여러 클래스에 중복되는 메소드나 필드를 한곳에 몰아 넣고 나누어 쓰는걸 추상화라고한다
	String name;
	
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public abstract String cry();
	public abstract String move();
	public abstract String food();
	public abstract void print();
	
}
