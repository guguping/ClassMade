package day10;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv2 tv2 = new Tv2();
		tv2.power = true;
		tv2.channel = 10;
		tv2.volum = 20;
		tv2.power();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumDown();
		tv2.volumDown();;
		
		System.out.println(tv2.power+"/"+tv2.channel+"/"+tv2.volum);}
		
		//하지만 상속을 해준 Tv클래스는 Tv2를 가져와 사용할 수 없다

}

class Tv{
	boolean power;
	int channel;
	
	public void power() {
		this.power = !power;
	}
	
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
}

class Tv2 extends Tv{
	int volum;
	
	public void volumUp() {
		this.volum++;
	}
	
	public void volumDown() {
		this.volum--;
	}
}
