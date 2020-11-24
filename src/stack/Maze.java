package stack;

import java.io.*;

public class Maze {
	//設定迷宮出口位置
	public static int exitx = 9;
	public static int exity = 10;
	//宣告迷宮的陣列
	public static int [][] Maze= {
			{1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,1,1,1,1,1,1,1,1},
			{1,1,1,0,1,1,0,0,0,0,1,1},
			{1,1,1,0,1,1,0,1,1,0,1,1},
			{1,1,1,0,0,0,0,1,1,0,1,1},
			{1,1,1,0,1,1,0,1,1,0,1,1},
			{1,1,1,0,1,1,0,1,1,0,1,1},
			{1,1,1,1,1,1,0,1,1,0,1,1},
			{1,1,0,0,0,0,0,0,1,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,0,1}, //出口在這
			{1,1,1,1,1,1,1,1,1,1,1,1}
			};
	
	public static void main(String[] args) throws IOException{
		int x, y, i, j;
		TraceRecord path = new TraceRecord();
		System.out.println("0的位置");
		x = 1;
		y = 1;
		for (i=0; i<11; i++) {
			for (j=0; j<12; j++) {
				System.out.print(Maze[i][j]);
			}
			System.out.println();
		}
		while(x <= exitx && y <= exity) {
			//走過的位置存成2
			//1為牆壁、0是可以走的路
			Maze[x][y] = 2;
			
			//上下左右邊的格子能不能走
			if(Maze[x][y+1] == 0) {
				y = y+1;
				path.insert(x, y);
			}else if(Maze[x][y-1] == 0){
				y = y+1;
				path.insert(x, y);
			}else if(Maze[x-1][y] == 0) {
				x-=x;
				path.insert(x, y);
			}else if(Maze[x+1][y] == 0) {
				x+=x;
				path.insert(x, y);
			}
			}
		System.out.println("走過的路徑 : ");
//		for (i=0; i<11; i++) {
//			for(j=0; j<12; j++) {
//				System.out.print(Maze[i][j]);
//			}
//			System.out.println();
//		}
		
}
}

