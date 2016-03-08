/*
	[1008 문제] A/B를 계산하시오.
	입력 - 첫째 줄에 A와 B가 주어진다. (0< A,B < 10)
	출력 - 첫째 줄에 A/B를 소수점 9자리 이상 출력한다. 
	예제 입력 1 - 1 3
	예제 출력 1 - 0.33333333333333333333333333333333
	예제 입력 2 - 4 5 
	예제 입력 2 - 0.800000000
*/

//소수점 9자리이상 나오게 수정
package step2;

import java.util.Scanner;

public class Num1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		System.out.println(a/b);		
	}
}
