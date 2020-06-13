package beakjoon;

import java.util.Scanner;

public class maxmin {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[5];
	int min;
	int max;
	
	for ( int i =0 ;i<arr.length;i++)
	{
		System.out.print(i+1 + "번째 숫자를 입력하세요 : ");
		arr[i] = sc.nextInt();
	}
	
	min = arr[0];
	max = arr[0];
	for (int j = 0; j<arr.length ;j++) {	
		if (arr[j] < min) 
			min = arr[j];
	}
	for (int j = 0; j<arr.length ;j++) {	
		if (arr[j] > max) 
			max = arr[j];
	}
	System.out.println("최소값은 " +min+"입니다.");
	System.out.println("최대값은 " +max+"입니다.");
}
}
