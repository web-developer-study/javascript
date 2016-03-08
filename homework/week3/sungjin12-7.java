import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringTokenizer token = new StringTokenizer(str, " ");
		ArrayList<String> list = new ArrayList<String>();
		while(token.hasMoreTokens()){
			list.add(token.nextToken());
		}
		double i1 = Integer.parseInt(list.get(0));
		double i2 = Integer.parseInt(list.get(1));
		System.out.println(i1/i2);
	}
}
