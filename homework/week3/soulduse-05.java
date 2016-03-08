import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = String.format("%.9f",sc.nextDouble()/sc.nextDouble());
        System.out.println(str);
    }
}