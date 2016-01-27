package algorithm.week3.stage03;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        for(int i=num;i>=1;i--){
	            for(int j=num-i;j>0;j--){
	                System.out.print(" ");
	            }
	            for(int j=i;j>=1;j--){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}
