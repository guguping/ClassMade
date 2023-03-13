package day2;

public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10까지 출력
		for(int i = 0; i < 5; i++) { // i++ = i=i+1 , int i=1 i=i+2(홀수), int i=2 i=i+2(짝수)
			System.out.println(i);
		}
		System.out.println("끝");
		
		//1~10까지 홀수출력
		for(int i=1; i<=10; i=i+2) {
			System.out.println(i);
		}
		
		//1~10까지 짝수출력
		for(int i=2; i<=10; i=i+2) {
					System.out.println(i);
		}
	}

}
