package day10;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person = new Person("홍길동",17,false);
		Student s = new Student("홍길동", 99, false, "S100");
	}

}

class Person {
	String name;
	int age;
	boolean isFull;

	public Person() {
		System.out.println("Person기본생성자");
	}

	public Person(String name) {
		System.out.println("Person기본생성자1");
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person기본생성자3");
	}

	public Person(String name, int age, boolean isFull) {
		// 생성자에서 생성자를 불러와 사용하는것 이렇게 작성하는 경우 3번의 생성자를 생행하고 isFull을 실행
		this.isFull = isFull;
		System.out.println("Person기본생성자4");
//		Student s = new Student("홍길동", 99 , fasle , "S100"));
	}

}

class Student extends Person {
	String sno;

	public Student() {
		System.out.println("Student기본생성자");
		// super < 숨겨져 있음
	}

	public Student(String name, int age) {
		System.out.println("Student기본생성자1");

	}

	public Student(String name, int age, boolean isFull, String sno) {
		super(name, age, isFull);
		System.out.println("Student기본생성자2");
	}

}
