package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int low, high, mid;
		int search;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° ���ڸ� �Է��ϼ��� : ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("ã�� ���ڸ� �Է��ϼ��� : ");
		search = sc.nextInt();
		low = 0;
		high = 4;
		while (true) {
			if (low <= high) {
				mid = (low + high) / 2;

				if (search == arr[mid]) {
					System.out.println("ã�� ���ڴ�" + (mid + 1) + "��°�� �ֽ��ϴ�.");

				}
				if (search <= arr[mid]) {
					high = mid;
				} else {
					low = mid;
				}
			} else {
				System.out.println("���� �������� �ʽ��ϴ�");
			}
		}
	}
}
