package day1;

import java.util.Scanner;

public class fff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 3, 2, 1, 5, 4 };
		int a = num[4];
		int b = num[3];

		for (int i = 4; i >= 0; i--) {
			if (i == 0) {
				num[i] = a;
				break;
			}
			num[i] = num[i - 1];
		}
		for (int i = 4; i >= 0; i--) {
			if (i == 0) {
				num[i] = b;
				break;
			}
			num[i] = num[i - 1];
		}
		

		for (int i = 4; i >= 0; i--) {
			System.out.print(num[i]);
		}

	}
}
