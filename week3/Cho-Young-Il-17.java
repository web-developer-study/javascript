import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final String[] days = 
			{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		final int[] months = {1, 3, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1};
		String[] str = in.nextLine().split(" ");
		
		int month = Integer.parseInt(str[0]);
		int date = Integer.parseInt(str[1]);
		int totalDate = 0;
	
		if(month > 1) {			
			for(int i = 0; i < month - 1; i++) {
				if(months[i] == 1) {
					totalDate += 31;
				} else if(months[i] == 2) {
					totalDate += 30;
				} else if(months[i] == 3) {
					totalDate += 28;
				}
			}
		}
		totalDate += date;
		
		if(totalDate % 7 == 0) {
			System.out.println(days[6]);
		} else {
			System.out.println(days[(totalDate % 7) - 1]);
		}
	}
}