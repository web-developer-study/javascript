import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int idx = -1;
		int line = num1;
		while(line > 0) {
			for(int i = 0; i < num1; i++) {
				if(idx >= i) {
					System.out.print(" ");
				} else {
					System.out.print("*");					
				}
			}
			
			System.out.println();
			
			line--;
			idx++;
		}
	}
}