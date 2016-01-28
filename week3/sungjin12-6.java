import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringTokenizer token = new StringTokenizer(str, " ");
		String[] list = new String[2];
		int i = 0;
		while(token.hasMoreTokens()){
			list[i] = token.nextToken();
			i++;
		}
		int i1 = Integer.parseInt(list[0]);
		int i2 = Integer.parseInt(list[1]);
		System.out.println(i1*i2);
	}
}
