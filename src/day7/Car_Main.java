package day7;

public class Car_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.name = "그랜져";
		c1.tire = "한국타이어";
		c1.color = "빨강";
		c1.speed = 10;
		
		System.out.println(c1.name+"/"+c1.tire+"/"+c1.color+"/"+c1.speed);
		
		// 제네시스 , 넥센타이어 , 검정 , 20
		
		c2.name = "제네시스";
		c2.tire = "넥센타이어";
		c2.color = "검정";
		c2.speed = 20;
		
		System.out.println(c2.name+"/"+c2.tire+"/"+c2.color+"/"+c2.speed);
		
//		c1.run();
//		c1.run();
//		c2.run();
//		System.out.println(c1.name+"/"+c1.tire+"/"+c1.color+"/"+c1.speed);
//		System.out.println(c2.name+"/"+c2.tire+"/"+c2.color+"/"+c2.speed);
		
//		c1.run();
		c2.speedRun(5);
		c1.speedRun(5);

//		System.out.println(c1.name+"/"+c1.tire+"/"+c1.color+"/"+c1.speed);
//		System.out.println(c2.name+"/"+c2.tire+"/"+c2.color+"/"+c2.speed);
		
//		c1.print();
//		c2.print();
		
		
		System.out.println(c1.getColor());
		
	}

}
