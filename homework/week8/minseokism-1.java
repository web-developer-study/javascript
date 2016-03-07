/*
	[1676 문제] 팩토리얼 0의 개수
	문제 - N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
	출력 - 첫째 줄에 구한 0의 개수를 출력한다.
	예제 입력  - 10
	예제 출력  - 2
*/

// 풀이 5배수 일때마다 0 하나씩늘어나고 
// 5^n 은 두번씩곱해지니 0이 하나씩 더 늘어난다

package baekjoonJudge;

import java.util.Scanner;

public class Num1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		System.out.println(input/5+input/25+input/125);
		
	}
}
