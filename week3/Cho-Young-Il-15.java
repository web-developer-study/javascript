import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		
		while(num1 > 0) {
			for(int i = 0; i < num1; i++) {
				System.out.print("*");
			}
			System.out.println();
			num1--;
		}
	}
}