/*
 * 첫째 줄에 N과 X가 주어진다
 * 둘재 줄에 수열 A를 이루는 정수 N개가 주어진다
 * X 보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다
 */
package algorithm.week3.stage04;

import java.util.Scanner;

public class Test03 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String s = "";
		int [] list = new int[num1]; // num1 크기만큼 배열 생성
		for(int i=0;i<list.length;i++){ // list 크기만큼 하나씩 배열에 넣어줌
			list[i]=sc.nextInt();
		}
		for(int i=0;i<list.length;i++){ // 배열 하나씩 꺼내서 num2보다 작으면 s에 문자열로 넣음
			if(list[i]<num2){
				s +=list[i]+" ";
			}
		}
		System.out.println(s);
	}
}
