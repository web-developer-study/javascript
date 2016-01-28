import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		String star = "";
		while(num1 > 0) {
			star += "*";
			System.out.println(star);
			num1--;
		}
	}
}