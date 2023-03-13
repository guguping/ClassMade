package day7;

public class Animal {
	String test;
	private String name;
	private String sound;
	private int leg;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSound() {
		return sound;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public int getLeg() {
		return leg;
	}
	
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void ageUp() {
		age = age+1;
	}
	
	public void println() {
		System.out.println("다리가 "+getLeg()+"개인 "+getName()+"는 "+getSound()+"입니다");
//		System.out.println("다리가 %d개인 %s는 %s웁니다\n".leg,name,sound);
	}
	
}
