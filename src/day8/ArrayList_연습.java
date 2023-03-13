package day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] mList = new Member[10];
		
		Member m = new Member();
		mList[0] = m;
		mList[1] = m;
		mList[2] = m;
		for(int i = 0 ; i < mList.length; i++) { // length는 칸의 길이
			System.out.println(mList[i]);
		}
		
		List<Member> list = new ArrayList<>(); 
		list.add(m);
		list.add(m);
		list.add(m);
		
		for(int i = 0 ; i < list.size();i++) { // szie는 들어간 것의 갯수
			System.out.println(list.get(i));
		}
		for(Member mm : list) { //향상된 for문
			System.out.println(mm);
		}
	}

}
