/*
	[9498 문제] 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
			     나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	입력 - 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 자연수이다.
	출력 - 시험 성적을 출력한다.
	예제 입력 - 100	
	예제 출력 - A
*/

package step4;

import java.util.Scanner;

public class Num9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		if(100>=input && 90<=input){
			System.out.println("A");
		}else if(89>=input && 80<=input){
			System.out.println("B");
		}else if(79>=input && 70<=input){
			System.out.println("C");
		}else if(69>=input && 60<=input){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
	}

}
