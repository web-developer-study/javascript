package algorithm.week3.stage04;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] list = new int[3];
		int max = 0;
		int temp = 0;
		for(int i=0;i<list.length;i++){
			list[i] = sc.nextInt();
		}
		for(int i=0;i<list.length;i++){
			if(list[i]>max){
				temp = max;
				max = list[i];
			}
			else if(list[i]>=temp){
				temp=list[i];
			}
		}
		System.out.println(temp);
	}
}
