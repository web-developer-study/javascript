import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++){
			int number = num - i;
			String star = "";
			for(int j = number; j > 0; j--){
				star += " ";
			}
			for(int j = 1; j <= i; j++){
				star += "*";
			}
			System.out.println(star);
		}
	}
}