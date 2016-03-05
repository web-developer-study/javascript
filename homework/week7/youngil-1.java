import java.util.Scanner;
public class Main{
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
     
    public static int lcm(int a, int b) {
        int gcdN = gcd(a, b);
        return (a / gcdN * b);
    }
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("%d\n%d", gcd(a, b), lcm(a, b));
    }
}