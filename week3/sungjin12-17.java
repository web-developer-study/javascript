import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer token = new StringTokenizer(str, " ");
		
		int month = Integer.parseInt(token.nextToken());
		int day = Integer.parseInt(token.nextToken());
		
		int result = 0;
		
		for(int i = 1; i < month; i++){
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
				result += 31;
			}
			if(i == 4 || i == 6 || i == 9 || i == 11){
				result += 30;
			}
			if(i == 2){
				result += 28;
			}
		}
		
		result += day;
		int weekly = result % 7;
		
		if(weekly == 0){
			System.out.println("SUN");
		} else if ( weekly == 1){
			System.out.println("MON");
		} else if ( weekly == 2){
			System.out.println("TUE");
		} else if ( weekly == 3){
			System.out.println("WED");
		} else if ( weekly == 4){
			System.out.println("THU");
		} else if ( weekly == 5){
			System.out.println("FRI");
		} else if ( weekly == 6){
			System.out.println("SAT");
		}
	}
}