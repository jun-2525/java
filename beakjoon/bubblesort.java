package beakjoon;

import java.util.Scanner;

public class bubblesort {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° ���Ҹ� �Է��ϼ���.");
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] > arr[k]) {
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		System.out.print("�������� ���� ���");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
