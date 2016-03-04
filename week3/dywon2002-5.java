package algorithm.week3.stage02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		String pattern = "0.000000000";
		DecimalFormat df = new DecimalFormat(pattern);
		double result = a/b;
		
		System.out.println(df.format(result));
	}

}
