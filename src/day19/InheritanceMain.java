package day19;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//부모 객체
		ParentClass p1 = new ParentClass();
		p1.name = "name1";
		System.out.println(p1.name);
		p1.hello();
		
		//자식 객체
		ChildClass c1 = new ChildClass();
		c1.name = "자식 name1";
		System.out.println(c1.name);
		c1.hello();
		
	}
}
