/*
 * 세 정수 A,B,C가 주어진다, 이때 두번째로 큰 정수를 출력하는 프로그램을 작성하시오
 */
package algorithm.week3.stage04;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] list = new int[3];
		int max = 0;
		int temp = 0;
		for(int i=0;i<list.length;i++){ // 배열에 세개의 정수값을 넣는다
			list[i] = sc.nextInt();
		}
		for(int i=0;i<list.length;i++){ // 하나씩 꺼내서 max값보다 크면 max에 넣어주고
			if(list[i]>max){			// temp보다 크거나 같으면 temp에 넣어준다
				temp = max;
				max = list[i];
			}
			else if(list[i]>=temp){
				temp=list[i];
			}
		}
		System.out.println(temp);
	}
}
