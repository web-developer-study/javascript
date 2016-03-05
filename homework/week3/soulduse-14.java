import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String star = "";

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(j<i)
                    System.out.printf(" ");
                else
                    System.out.printf("*");
            }
            System.out.println();
        }

    }
}