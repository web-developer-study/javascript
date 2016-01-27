package algorithm.week3.stage03;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt()-1;
		int day = sc.nextInt();
		int [] arr =  {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<month;i++){
			day += arr[i];
		}
		day = day%7;
		switch(day){
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		}
	}
}
