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
		System.out.print(i+1 + "��° ���ڸ� �Է��ϼ��� : ");
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
	System.out.println("�ּҰ��� " +min+"�Դϴ�.");
	System.out.println("�ִ밪�� " +max+"�Դϴ�.");
}
}
