import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;


        for(int i=0; i<cnt; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        System.out.println(a);
    }
}
