package day7;

public class Calculator {
	int num1;
	int num2;



	// 문제)
	// 접근제한자 : public
	// 리턴타입 : 없음
	// 메소드명 : sum
	// 매개변수 : 없음
	// 실행문구 : 필드 두개를 더한값 출력

	public void sum() {
		System.out.println(num1 + num2);
	}

	// 문제)
	// 접근제한자 : public
	// 리턴타입 : 없음
	// 메소드명 : sub
	// 매개변수 : int 두개
	// 실행문구 : 매개변수로 받은 두수를 뺀값 출력

	public void sub(int num1, int num2) {
		if(num1 < num2) {
			System.out.println(num2 - num1);
		}else {
			System.out.println(num1 - num2);
		}
	}

	// 문제)
	// 접근제한자 : public
	// 리턴타입 : int
	// 메소드명 : mul
	// 매개변수 : int 두개
	// 실행문구 : 매개변수로 받은 두수를 곱한값 리턴

	public int mul() {
		return num1*num2;
		
	}

	// 문제)
	// 접근제한자 : public
	// 리턴타입 : ?
	// 메소드명 : div
	// 매개변수 : int 두개
	// 실행문구 : 매개변수로 받은 두수를 나눈값 리턴
	
	public double div() {
		return num1 / (double)num2;
	}

}
