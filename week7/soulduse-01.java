import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = gcd(num1, num2);
        System.out.println(gcd+"\n"+(num1*num2)/gcd);
        /*
        int small = 0;
        int big = 0;
        int rem = -1;

        if(num1>num2){
            big = num1;
            small = num2;
        }else{
            big = num2;
            small = num1;
        }

        rem = big % small;
        while(rem != 0){
            big = small;
            small = rem;
            rem = big % small;
        }

        int gcd = small;
        int lcm = (num1 * num2)/gcd;

        System.out.println(gcd +"\n"+lcm);
        */
    }

    public static int gcd(int num1, int num2){
        return (num1 % num2 == 0 ? num2 : gcd(num2, num1%num2));
    }
}
