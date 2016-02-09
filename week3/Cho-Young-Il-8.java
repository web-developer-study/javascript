import java.util.Scanner;

public class Main{
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	public static int mok(int num1, int num2) {
		return num1 / num2;
	}
	public static int nmg(int num1, int num2) {
		return num1 % num2;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		System.out.println(plus(num1, num2));
		System.out.println(minus(num1, num2));
		System.out.println(mul(num1, num2));
		System.out.println(mok(num1, num2));
		System.out.println(nmg(num1, num2));
	}
}