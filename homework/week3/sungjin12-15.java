import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = num; i > 0; i--){
			String star = "";
			for(int j = 0; j < i; j++){
				star += "*";
			}
			System.out.println(star);
		}
	}
}