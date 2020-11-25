package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int number[] = {95,23,66,17,4,20,55};
		System.out.println("原始資料 : ");
		for (int i=0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		for(int j=0; j < number.length; j++) {
			for(int k=j+1; k < number.length; k++) {
				if(number[j]>number[k]) {
					int tmp = number[j];
					number[j] = number[k];
					number[k] = tmp;
				}else {
					continue;
				}
			}
		}
		
//		Bubble Sorting 後結果(由小到大)
		
		System.out.println("排序後 : ");
		for(int i=0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}

}
