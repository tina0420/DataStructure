package sort;

public class ShellSort {

	//base on Insertion Sorting, it breaks an origin set into smaller subsets
	
	public static void main(String[] args) {
		int number[] = {95,23,66,17,4,20,55,103};
		System.out.println("原始資料:");
		for(int i=0; i< number.length; i++) {
			System.out.print(number[i]+" ");
		}
		for (int jmp= number.length/2; jmp>0; jmp=jmp/2) {
			for (int j=jmp; j<number.length; j++) {
				for (int k=j-jmp; k >= 0; k=k-jmp) {
					if(number[k+jmp] > number[k]) {
						break;
					}else {
						int tmp = number[k];
						number[k] = number[k+jmp];
						number[k+jmp] = tmp;
					}
				}
			}
		}
		System.out.println();
		System.out.println("排序後 : ");
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+" ");
		}
	}

}

	
//		int jmp; //兼具位移量
//		jmp = number.length/2;
//		while(jmp != 0) {
//			//掃描次數j
//			for (int j=jmp; j < number.length; j=j/2) {
//				int tmp = number[j];
//				j=j-jmp;
//			}
			
			
			
			
//			for(int j=0; j<(number.length/2); j++) {
//				if(number[j]>number[j+jmp]) {
//					int tmp = number[j];
//					number[j] = number[j+jmp];
//					number[j+jmp] = tmp;
//				}else {
//					continue;
//				}
//			}
//			System.out.println();
//			for(int i=0; i<number.length; i++) {
//				System.out.print(number[i]+" ");
//			}
//			jmp=jmp/2;
//		}

