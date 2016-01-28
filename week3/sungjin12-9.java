import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(str, " ");
		
		int i1 = Integer.parseInt(token.nextToken());
		int i2 = Integer.parseInt(token.nextToken());
		int i3 = Integer.parseInt(token.nextToken());
		System.out.println((i1 + i2) % i3);
		System.out.println((i1 % i3 + i2 % i3) % i3);
		System.out.println((i1 * i2)%i3);
		System.out.println((i1 % i3 * i2 % i3));
	}
}