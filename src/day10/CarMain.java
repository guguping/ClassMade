package day10;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar scar = new SportCar();
		scar.run();
		System.out.println(scar.speed);
		
	}

}
class Car {
	String color;
	String tire;
	int speed;
	
	public void run() {
		System.out.println("Car run메소드");
		this.speed++;
	}
}

class SportCar extends Car {
	String engine;
	
	public void run() {
		System.out.println("SportCar run메소드");
		this.speed += 2; 
		// 상속 받은 메소드를 자식이 재정의 하는것을 오버라이딩이라고 한다
		// 단 메소드의 선언법은 동일해야한다 
	}
	
	public void rue1() {
		System.out.println("SportCar rum1메소드");
		this.speed += 4;
		// 이렇게 메소드 선언법이 다르면 그냥 다른 메소드일 뿐이다
	}
}