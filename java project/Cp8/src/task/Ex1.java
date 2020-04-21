package task;

import java.util.Scanner;

public class Ex1 {

	public static int maxNum(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int mimNum(int[] arr) {

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++) {
		
			System.out.println("비교하고 싶은 숫자를 입력하세요");
			arr[i]=sc.nextInt();
		
		
		
		}
		System.out.println("입력한 수 중 제일 큰 수"+mimNum(arr));
		System.out.println("입력한 수 중 제일 작은 수"+maxNum(arr));
	}
	
}