/*
	[1001 문제] A-B를 계산하시오.
	입력 - 첫째 줄에 A와 B가 주어진다. (0< A,B < 10)
	출력 - 첫째 줄에 A-B를 출력한다.
	예제 입력 - 3 2
	예제 출력 - 1
*/

package step2;

import java.util.Scanner;

public class Num1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		System.out.println(a-b);		
	}
}