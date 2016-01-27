package algorithm.week3.stage04;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String s = "";
		int [] list = new int[num1];
		for(int i=0;i<list.length;i++){
			list[i]=sc.nextInt();
		}
		for(int i=0;i<list.length;i++){
			if(list[i]<num2){
				s +=list[i]+" ";
			}
		}
		System.out.println(s);
	}
}
