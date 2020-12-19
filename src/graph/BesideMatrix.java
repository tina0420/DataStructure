package graph;

import java.io.IOException;

public class BesideMatrix {

	public static void main(String[] args) throws IOException{
		int data[][] = {{1,2},{2,1},{1,5},{5,1},{2,3},{3,2},{2,4},{4,2},
						{3,4},{4,3},{3,5},{5,3},{4,5},{5,4}};
		//宣告陣列
		int array[][] = new int [6][6];
		//先全部填為0
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				array[i][j] = 0;
			}
		}
		
		//tmpj是起點，tmpk是終點 ([i][j])
		for (int i=0; i<=13; i++) {
			for (int j=0; j<6; j++) {
				for (int k=0; k<6; k++) {
					int tmpj = data[i][0];
					int tmpk = data[i][1];
					array[tmpj][tmpk] = 1;
				}
			}
		}
		//Show出來
		System.out.println("相鄰陣列法 : ");
		System.out.println("(1為兩點間有邊，0則兩點無相連)");
		for (int i=1; i<6; i++) {
			for (int j=1; j<6; j++) {
				System.out.print("["+ array[i][j] +"]"+" ");
			}
			System.out.println();
		}
		
		
//		int numbers[][] = {{1,2},{5,3},{2,3},{3,4},{4,5}};
//		for (int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i][0]);
//		}
		
	}

}
