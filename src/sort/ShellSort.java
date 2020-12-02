package sort;

public class ShellSort {

	public static void main(String[] args) {
		int number[] = {95,23,66,17,4,20,55,103};
		System.out.println("原始資料:");
		for(int i=0; i< number.length; i++) {
			System.out.print(number[i]+" ");
		}
		
		int jmp; //兼具位移量
		jmp = number.length/2;
		while(jmp != 0) {
			for(int j=0; j<(number.length/2); j++) {
				if(number[j]>number[j+jmp]) {
					int tmp = number[j];
					number[j] = number[j+jmp];
					number[j+jmp] = tmp;
				}else {
					continue;
				}
			}
			System.out.println();
			for(int i=0; i<number.length; i++) {
				System.out.print(number[i]+" ");
			}
			jmp=jmp/2;
		}
//		System.out.println();
//		for(int i=0; i<number.length; i++) {
//			System.out.print(number[i]+" ");
//		}
	}

}
