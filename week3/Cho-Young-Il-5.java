import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = in.nextInt();
        result -= in.nextInt();
        System.out.println(result);
        in.close();
    }
}