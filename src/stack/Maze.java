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
				x-=1;
				path.insert(x, y);
			}else if(Maze[x+1][y] == 0) {
				x+=1;
				path.insert(x, y);
			}else if((checkExit(x,y,exitx, exity)) == 1 ) {
				break;
			}else {
				Maze[x][y] =2;
				path.delete(x,y);
				x=path.last.x;
				y=path.last.y;
			}
		}
		
		System.out.println("走過的路徑 : ");
		for (i=0; i<11; i++) {
			for(j=0; j<12; j++) {
				System.out.print(Maze[i][j]);
			}
			System.out.println();
		}		
}
	public static  int checkExit(int x, int y, int ex, int ey) {
		if(x == ex && y == ey) {
			if(Maze[x-1][y] == 1 || Maze[x+1][y] == 1 || Maze[x][y+1] == 1 || Maze[x][y-1] == 2) {
				return 1;
			}
			if(Maze[x-1][y] == 1 || Maze[x+1][y] == 1 || Maze[x][y+1] == 2 || Maze[x][y-1] == 1) {
				return 1;
			}
			if(Maze[x-1][y] == 1 || Maze[x+1][y] == 2 || Maze[x][y+1] == 1 || Maze[x][y-1] == 1) {
				return 1;
			}
			if(Maze[x-1][y] == 2 || Maze[x+1][y] == 1 || Maze[x][y+1] == 1 || Maze[x][y-1] == 1) {
				return 1;
			}
		}
		return 0;
	
	}
}

