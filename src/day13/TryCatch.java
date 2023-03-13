package day13;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//트라이캐치 사용 양식
		try {
			//에러(예외)가 발생할 가능성이 있는 소스코드를 작성하는 곳
		}catch(Exception e) {
			//에러(예외)가 발생하면 대체할 소스코드를 작성하는 곳
		}
		
		try {
			int[] array = new int[5];
			System.out.println(array[5]);
		}catch(ArithmeticException a) {
			// 캐치는 여러개 사용 가능하다
		}catch(Exception e) {
			//()안에는 자리에 대비할 오류코드를 넣어 캐치로 해당 오류의 대체 소스를 출력하게 할 수 있다
			System.out.println("인덱스 초과");
		}finally {
			// finally는 무조건 실행됨
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 끝");
	}

}
