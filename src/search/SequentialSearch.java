package search;

import java.util.Scanner;

public class SequentialSearch {
	//又稱Linear Search

	public static void main(String[] args){
		System.out.println("查詢數字 : ");
		Scanner scanner = new Scanner(System.in);
		int searchnum = scanner.nextInt();
		int number[] = {95,23,66,17,4,20,55,103};
		int index = -1;
		for (int i=0; i<number.length; i++) {
			if (searchnum == number[i]) {
				index = i;
				System.out.println(number[i]+" 在第 "+(i+1)+" 個位置");
				break;
			}
		}
		if(index == -1) {
			System.out.println("找不到這個數字!");
		}
	}

}
