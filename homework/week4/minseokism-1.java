/*
	[11726 문제] 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
			       아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
			       이미지 참조 : https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11726/1.png
			       문제 참조 : https://www.acmicpc.net/problem/11726
	입력 - 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
	출력 - 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
	예제 입력 1 - 2
	예제 출력 1 - 2
	예제 입력 2 - 9
	예제 출력 2 - 55	
*/

// N일때 짝수일때만 숫자가들어간다.
// a[0]=1,a[n]=1
// N.a[i]=(N-1).a[i]+(N-2).a[i-2] 


package dynamicprg;

import java.math.BigInteger;
import java.util.Scanner;

public class Num11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		BigInteger cnt=BigInteger.ZERO;
		BigInteger[][] arr = new BigInteger[input+1][input+1];
		for(int i=1; i<=input ; i++){
			cnt=BigInteger.ZERO;
			for(int j=0; j<=i; j+=2){
				if(j==0 || j==i){
					arr[i][j]=BigInteger.ONE;
					cnt=cnt.add(arr[i][j]);
				}else{
					arr[i][j]=arr[i-1][j].add(arr[i-2][j-2]);
					cnt=cnt.add(arr[i][j]);
				}
			}
		}
		System.out.println(cnt.remainder(BigInteger.valueOf(10007)));
	}
}