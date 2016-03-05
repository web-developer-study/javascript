package algorithm.week3.stage03;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
		for(int i=n;i>0;i--){
			System.out.print("*");
		}
		System.out.println();
		n--;
		}
	}
}
