import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] iarray = new int[10000000];
	static int n, mok, square10, zeroCnt;
	static void init() {
		n = sc.nextInt();
		mok = zeroCnt = 0; 
		square10 = 1;
		for(int i = 0; i < iarray.length; i++)
			iarray[i] = 1;
	}
	static void procedure() {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < square10; j++) {
				iarray[j] = iarray[j] * i + mok;
				mok = iarray[j] / 10;
				iarray[j] %= 10;
			}
			while(mok != 0) {
				iarray[square10] = mok % 10;
				mok /= 10;
				square10++;
			}
		}
		
		for(int i = 0; i < square10; i++) {
			if(iarray[i] == 0) zeroCnt++;
			else break;
		}
	}
	static void resPrint() {
		System.out.println(zeroCnt);
	}
	public static void main(String[] args) {
		init();
		procedure();
		resPrint();
	}
}