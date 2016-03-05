import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        long num1 = 0;
        long num2 = 1;
        long num3 = 0;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i=1;i<b;i++){
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }
        System.out.println(num2);
    }
 
}