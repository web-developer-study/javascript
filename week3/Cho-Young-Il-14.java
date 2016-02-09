import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		char[] stars = new char[num1];
		for(int i = 0; i < num1; i++) {
			starts[i] = ' ';
		}
		int idx = num1 - 1;
		while(num1 > 0) {
			starts[idx] = '*';
			System.out.println(starts);
			idx--;
			num1--;
		}
	}
}