package day2;

public class 반복문_for예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10까지 가로로 출력
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i+"\t");
//		}
//		System.out.println("\n");
//		System.out.println("안\t녕");
		
		//1~100까지의 합을 출력
//		int n = 0;
//		for(int i=1; i<=100; i++) {
//			n = n+i;
//		}
//		System.out.println(n);
		
		//1~100까지의 짝수의 합 출력
//		int n = 0;
//		for(int i=2; i<=100; i=i+2) {
//			n = n+i;
//		}
//		System.out.println(n);
		
		//문제) 6 * 1 = 6 으로 6 * 9 = 54 까지 출력
		int dan = 6;
		for(int i=1; i<10; i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
	}

}
