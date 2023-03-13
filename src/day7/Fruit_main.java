package day7;

public class Fruit_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit apple = new Fruit();
						// 생성자
		apple.setName("사과");
//		System.out.println(apple.getName());
		apple.color = "빨강";
		apple.isSeed = true;
		System.out.println(apple.getName()+apple.color+apple.isSeed);
		
		Fruit apple1 = new Fruit("사과","빨강",true);
		System.out.println(apple1.getName()+apple1.color+apple1.isSeed);
		
		Fruit banana = new Fruit();
		   				// 생성자
		banana.setName("바나나");
//		System.out.println(banana.getName());
		banana.color = "노랑";
		banana.isSeed = false;
		
		Fruit melon = new Fruit("멜론","초록",true);
		System.out.println(melon.getName()+melon.color+melon.isSeed);
		
		Fruit orange = new Fruit();
						// 생성자
		orange.setName("오렌지");
		orange.color = "주황";
		orange.isSeed = true;
		System.out.println(orange.getName()+orange.color+orange.isSeed);
		
		
		
	}

}
