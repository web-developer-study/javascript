package algorithm.week3.stage03;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n; i>0; i--){
		for(int j=i-1; j>0; j--){
		                       System.out.print(" ");
		            }
		            for(int k=i;k<=n; k++){
		                       System.out.print("*");
		            }
		            System.out.println();
		}

	}
}
