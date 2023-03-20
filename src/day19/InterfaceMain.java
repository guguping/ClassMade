package day19;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스 객체 생성 (X)
//		InterfaceEx if1= new InterfaceEx();
		
		// 가능은 하지만 의미가 없은 인터페이스 (X)
//		ImplClass1 ipc1 = new ImplClass1();
		
		// 가장 기본적인 인터페이스 선언
//		InterfaceEx if1 = new ImplClass1();
		//좌변:인터페이스		  우변:클래스
//		if1.hello();
//		1
//		InterfaceEx if2 = new ImplClass2();
//		if2.hello();
		
		InterfaceEx if3 = new ImplClass1();
		if3.hello();
		if3 = new ImplClass2();
		if3.hello();
		//하나의 타입에 대해서 여러개의 생성자를 넣어 사용할 수 있다
		//이게 다형성이라고 할 수 있다
		
		//ps
//		ChildClass c2 =(ChildClass) new ParentClass();
//		ParentClass p2  = new ChildClass();
		//상속받는 클래스는 부모객체를 자식 객체에 넣을 수 없다
		//그렇기에 강제형변환을 사용한다
	}
}
