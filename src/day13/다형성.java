package day13;

public class 다형성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Animal ab = new Dog(); //다형성
		//부모 클래스를 자식의 생성자로 생성하는게 다형성
		//특이점은 자식객체에서 오버라이딩 된 것만 자식메소드를 사용가능하다
		a = new Dog(); 
		//필드에도 상속받는 객체를 넣을 수 있다
		ab.cry();
		a.cry();
	}
}
// Animal을 상속자받아 cry를 오버라이딩
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
	public void cry() {
		System.out.println("울다");
	}
}
class Dog extends Animal{
	public void cry() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	public void cry() {
		System.out.println("야옹");
	}
}