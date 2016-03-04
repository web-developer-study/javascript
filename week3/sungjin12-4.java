import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringTokenizer token = new StringTokenizer(str, " ");
		int num = 0;
		while(token.hasMoreTokens()){
			num += Integer.parseInt(token.nextToken());
		}
		System.out.println(num);
	}
}