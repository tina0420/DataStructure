package search;

import java.util.Scanner;

public class BinarySearch {

	//使用已經排序好的資料做搜尋
	public static void main(String[] args) {
		int number[] = {11,22,33,44,55,66,77,88,99,101,202};
		System.out.println("輸入要搜尋的數字 : ");
		Scanner scanner = new Scanner(System.in);
		int search = scanner.nextInt();
		int mid = number.length/2;
		System.out.print("中間數為 : " + number[mid]);
		int index=0;
		while(index != 0) {
			if(search > number[mid]) {
				mid=mid/2;
			}
		}
	}

}
