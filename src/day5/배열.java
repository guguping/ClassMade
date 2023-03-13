package day5;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "홍길동";
		String name2 = "이순신";
		String name3 = "심청이";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		String[] name = new String[3]; // 문자열이 들어갈 수 있는 배열3칸 만들기		
		name[0] = "배열홍길동"; // 배열의 칸을 index라고 하는데 index는 칸 번호는 0부터 시작한다
		name[1] = "배열이순신";
		name[2] = "배열심청이";
		name[1] = "변경"; //이런 경우 "배열이순신"이 아닌 "변경"이 출력된다
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		
		int[] i = new int[10]; //정수가 들어갈 수 있는 배열 10칸 만들기
//		int i[] = new int[10]; 이렇게 작성해도 상관없음
		//int[] i = { 34. 123 .94 ....} 있는 배열에 만들면서 추가할때
		i[0] = 34;
		i[1] = 34;
		i[2] = 34;
		i[3] = 34;
		i[4] = 34;
		i[5] = 34;
		i[6] = 34;
		i[7] = 34;
		i[8] = 34;
		i[9] = 34;
//		System.out.println(i[1]); 이런 경우 하나씩 적어줘야한다
		for(int j = 0; j<i.length;j++) { // length는 길이를 뜻하고 i는 10칸이기 때문에 10으로 계산된다
			System.out.println(i[j]); // 이렇게하면 0~9까지 한번에 출력 가능하다
		}
		
		
		
		
		
	}

}
