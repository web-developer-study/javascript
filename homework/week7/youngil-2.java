import java.util.Scanner;
public class Main{
    public static Scanner in = new Scanner(System.in);
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void logic() {
        int size = in.nextInt();
        int[] iArr = new int[size];
        int idx = 0;
        int sum = 0;
        for(int i = 0; i < size; i++) {
            iArr[i] = in.nextInt();
        }
        while(idx < size) {
            int tmp = iArr[idx];
            for(int i = idx + 1; i < size; i++) {
                sum += gcd(tmp, iArr[i]);
            }
            idx++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int testcase = in.nextInt();
        for(int i = 0; i < testcase; i++) {
            logic();
        }
    }
}