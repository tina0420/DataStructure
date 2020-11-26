package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int number[] = {95,23,66,17,4,20,55};
		System.out.println("原始數字 : ");
		for (int i=0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		
		//Selection Sort
		for(int j=0; j<number.length; j++) {
			for(int k=j+1; k<=number.length-1; k++) {
				if(number[j]>number[k]) {
					int tmp = number[j];
					number[j] = number[k];
					number[k] = tmp;
				}else {
					continue;
				}
			}
			System.out.println("第"+(j+1)+"次排序:");
			for(int i=0; i< number.length; i++) {
				System.out.print(number[i]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		//show結果
		System.out.println("排序結果 : ");
		for (int i=0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
		
	}

}
