package day7;

public class Calculator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		cal.num1 = 15;
		cal.num2 = 5;
		
		// 메소드를 이용하여 더하기 , 빼기 , 곱하기 , 나누기 값 출력
		cal.sum();
		cal.sub(cal.num1,cal.num2);
		System.out.println(cal.mul());
		System.out.println(cal.div());
		
//		System.out.println(cal.num3);
//		System.out.println(cal.num4);
		
		
		
	}

}
