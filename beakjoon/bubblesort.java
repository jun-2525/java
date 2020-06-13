package beakjoon;

import java.util.Scanner;

public class bubblesort {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 원소를 입력하세요.");
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
		System.out.print("오름차순 정렬 결과");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
