import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer token = new StringTokenizer(str, " ");
		
		int num1 = Integer.parseInt(token.nextToken());
		int num2 = Integer.parseInt(token.nextToken());
		
		str = sc.nextLine();
		token = new StringTokenizer(str, " ");
		List<Integer> list = new ArrayList<Integer>();
		
		while(token.hasMoreTokens()){
			list.add(Integer.parseInt(token.nextToken()));
		}
		
		str = "";
		for(int i = 0; i < list.size(); i++){
			if(num2 > list.get(i)){
				str += list.get(i) + " ";
			}
		}
		int i = str.length() - 1;
		System.out.println(str.substring(0, i));
	}
}