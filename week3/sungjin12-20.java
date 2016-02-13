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
		
		if(i1 > i2){
			if(i1 > i3){
				if(i2 > i3){
					System.out.println(i2);
				} else {
					System.out.println(i3);
				}
			} else {
				System.out.println(i1);
			}
		} else {
			if(i2 > i3){
				if(i1 > i3){
					System.out.println(i1);
				} else {
					System.out.println(i3);
				}
			} else {
				System.out.println(i2);
			}
		}
	}
}