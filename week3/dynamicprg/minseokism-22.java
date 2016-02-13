/*
	[2718 문제] 4*N 크기의 타일을 2*1, 1*2 크기의 도미노로 완전히 채우려고 한다. 예를 들어 4*2 타일을 채우는 방법은 다음과 같이 5가지가 있다.
	          N이 주어졌을 때, 타일을 채우는 방법의 개수를 출력하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 테스트 케이스의 개수 T가 주어진다. T는 1,000보다 작거나 같은 자연수이다. 각 테스트 케이스는 정수 하나로 이루어져 있다. 
	            이 정수는 문제에서 설명한 타일의 너비 N이다. N은 자연수이다.
	출력 - 각 테스트 케이스에 대해 4*N크기의 타일을 채우는 방법의 경우의 수를 출력한다.
	예제 입력 - 2
			3
			7
	예제 출력 - 5 
			11 
			781
	
*/

package dynamicprg;

import java.util.Scanner;

public class Num2718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output = 0;
		sc.close();
		
		
		
		System.out.println(output);
	}

}


/*
 * N  	    1  2  3  4  5  6   7
 * 타일의 갯수    2  4  6  8 10 12  14
 * 방법 수          1  5 11  X  X  X 781 
 */
