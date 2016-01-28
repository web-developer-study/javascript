import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 2;
        while(count > 0) {
            sum += in.nextInt();
            count--;
        }
        System.out.println(sum);
    }
}