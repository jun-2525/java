package beakjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String num;
		int result = 0;

		num = sc.nextLine();
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '1') {
				result += (int) Math.pow(2, num.length()-1-i);
			}
		}
		System.out.println("2진수 " + num + "(는) 10진수로 " + result + "입니다.");
	}
}
