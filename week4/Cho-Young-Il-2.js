import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
         
        for(int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
         
        System.out.println(fibo[n]);
    }
}