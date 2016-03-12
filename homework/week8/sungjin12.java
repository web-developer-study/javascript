import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sNum = sc.nextLine();
		int iNum = Integer.parseInt(sNum);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(iNum == 0){
			System.out.println(0);
		} else {
			a = iNum / 5;
			b = iNum / 25;
			c = iNum / 125;
		}
		
		System.out.println(a + b + c);
	}
}
