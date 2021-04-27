package structure;

import java.io.*;

import structure.LinkedListOrigin.LinkedList;

// import structure.LinkedListOrigin.LinkedList;
public class LinkedListScoreMain {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int number;
        int score;
        int position;
        System.out.println("輸入資料:");
        LinkedList list = new LinkedList();
        for(int i=0; i<3; i++){
            System.out.println("學生姓名:");
            name = br.readLine();
            System.out.println("座號:");
            number = Integer.parseInt(br.readLine());
            System.out.println("成績:");
            score = Integer.parseInt(br.readLine());
            System.out.println("排名:");
            position = Integer.parseInt(br.readLine());
            list.insert(name, number, score, position);
            System.out.println();
        }
        System.out.println("成績:");
        list.print();
        
    }



}
