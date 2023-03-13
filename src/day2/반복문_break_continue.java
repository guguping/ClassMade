package day2;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			if(i == 5) {
//				break;
//			}
//		}
//		System.out.println("끝");
		

		
		for(int i=0; i<10; i++) {
			for(int j=2; j<10; j++) {
				if(i==0) {
					System.out.print(j+"단\t\t");
				}else{
					System.out.printf("%d * %d = %d\t", j,i,(j*i));
				}
			}
			System.out.println();
		}
	
		
//		for(int j=2; j<10; j++) {
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d * %d = %d\n", j,i,(j*i));
//			}
//			System.out.println();
//			if(j == 5) {
//				break;
//			}
//		}
		
//		for(int i=1; i<=10; i++) {
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
//		for(int i=2; i<10; i++) {
//			if(i<4) {
//				continue;
//			}else if(i>7) {
//				break;
//			}
//			System.out.println(i+"단");
//			for(int j=1; j<10; j++) {
//				System.out.printf("%d * %d = %d\n", i,j,(i*j));
//			}
//			System.out.println();
//		}
	}
}
