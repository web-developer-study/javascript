import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();

        String result = "";
        if(numN<=100 && numN>=90){
            result = "A";
        }
        else if(numN <90 && numN>=80){
            result = "B";
        }
        else if(numN < 80 && numN >= 70){
            result = "C";
        }
        else if(numN < 70 && numN >= 60){
            result = "D";
        }else{
            result = "F";
        }

        System.out.println(result);
    }
}