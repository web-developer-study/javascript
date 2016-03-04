import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int temp = 0;
        int num1 = a;
        int num2 = b;
        while(a != 0) {
            if( a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            a = a - b;
        }
        System.out.println(b);
        System.out.println(num1*num2/b);
    }
}