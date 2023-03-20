package day19;

public class ChildClass extends ParentClass {
	//생성 없음
	public ChildClass() {
		System.out.println("자식 클래스 생성자");
	}

	//hello 재정의
	@Override
	public void hello() {
		System.out.println("자식Class hello");
	}
	
	

//	@Override
//	public void hi() {
//		System.out.println("자식Class hi");
//	}
}
