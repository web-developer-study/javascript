package algorithm.week8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x = 5;
	int cnt = 0;
	while(x<=n){
		cnt += n/x;
		x *= 5;
	}
	System.out.println(cnt);
	}

}
