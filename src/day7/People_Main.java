package day7;

public class People_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		People op1 = new People();
		op1.setName("홍길동");
		op1.setAge(17);
		
		
		People op2 = new People("이몽룡");
		op2.setAge(18);
		
		
		People op3 = new People("심청이",19);
		
//		op1.ageUp();
//		op2.ageUp();
//		op3.ageUp();
//		op3.ageUp3();
		op2.ageUp4("-",50);
		op1.ageUp4("*", 3);
		
		op3.print2();
		op2.print1();
		op1.print();
	}

}
