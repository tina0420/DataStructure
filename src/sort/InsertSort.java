package sort;

public class InsertSort {
                    // 23,66, 95,
	public static void main(String[] args) {
		            //  0  1  2  3  4  5  6
		int number[] = {95,23,66,17,4,20,55};
		System.out.println("原始資料 : ");
		for(int i=0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		//把第一個放到排序並從第二個開始比對 length=7
		for (int j=1; j<number.length; j++) {
			int k=j-1;
			int tmp = number[j]; //tmp = 17
			while(k >= 0 && tmp < number[k]) { //當tmp比最後一個數字小時
				//往後推一個
				number[k+1] = number[k];
				k--;
			}
			
			number[k+1] = tmp;
			
//			for (int k=j-1; k<number.length; k--) {
//					if(number[j] < number[k]) {
//						int tmp = number[j];
//						number[j] = number[k];
//						number[k] = tmp;
//					}else {
//						//比已排序的最後一個還大的話就不變動，直接排最後
//						continue;
//					}
//				
//				}
			System.out.println("已排好前"+(j+1)+"個");
			for(int l=0; l<number.length; l++) {
				System.out.print(number[l]+" ");
			}
			System.out.println();
		}
		
		
//		Insert Sorting 後結果(由小到大)
		
		System.out.println("排序後 : ");
		System.out.println();
		for (int i=0; i<number.length; i++) {
			System.out.print(number[i]+" ");
		}
	}

}
