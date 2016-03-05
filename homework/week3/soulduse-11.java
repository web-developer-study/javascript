import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        String starStr = "";

        for(int i=0; i<numN; i++){
            starStr += "*";
            System.out.println(starStr);
        }

    }
}