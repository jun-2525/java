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
			System.out.print(i + 1 + "번째 숫자를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("찾는 숫자를 입력하세요 : ");
		search = sc.nextInt();
		low = 0;
		high = 4;
		while (true) {
			if (low <= high) {
				mid = (low + high) / 2;

				if (search == arr[mid]) {
					System.out.println("찾는 숫자는" + (mid + 1) + "번째에 있습니다.");

				}
				if (search <= arr[mid]) {
					high = mid;
				} else {
					low = mid;
				}
			} else {
				System.out.println("값이 존재하지 않습니다");
			}
		}
	}
}
