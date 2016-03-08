import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        String str = "";

        for(int i=0; i<numN; i++){
            for(int j=1; j<numN-i; j++){
                str += " ";
            }

            for(int j=0; j<=i; j++){
                str += "*";
            }
            System.out.println(str);
            str = "";
        }
    }
}