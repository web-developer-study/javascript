/*
	[2609 문제] 최대공약수와 최소공배수
	문제 - 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
	입력 - 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
	출력 - 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
	예제 입력  - 24 18
	예제 출력  - 6
			 72
*/

package baekjoonJudge;

import java.util.Scanner;

public class Num2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int gcd = gcd(num1,num2);
		
		System.out.println(gcd+"\n"+(num1*num2)/gcd);
	}
	
	public static int gcd(int num1, int num2){
		if(num1%num2==0){
			return num2;
		}else{
			return gcd(num2,num1%num2);
		}
	}
}