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
		int a1 = Integer.parseInt(list.get(0));
		for(int i = 1; i < list.size(); i++){
			int a = Integer.parseInt(list.get(i));
			
			a1 = a1 - a;
		}
		System.out.println(a1);
	}
}
