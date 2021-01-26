
public class AlgorithmTest {

	public static void main(String[] args) {
		//while loop 找出被2整除的數字
		System.out.println("for loop 跑的結果: ");

		for(int i=0; i<99; i++) {
			if(i % 2 ==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("while loop 跑的結果: ");
		
		int k=0;
		while(true) {
			if(k < 99) {
				if(k % 2 ==0) {
					System.out.print(k+" ");
				}
				k++;
			}else {
				break;
			}
			
		}
		
	}

}
