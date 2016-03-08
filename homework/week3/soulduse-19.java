import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] ownLine = sc.nextLine().split(" ");
        String [] twoLine = sc.nextLine().split(" ");
        int ifNum = Integer.parseInt(ownLine[1]);

        for(int i=0; i<twoLine.length; i++){
            if(ifNum>Integer.parseInt(twoLine[i]))
                System.out.print(twoLine[i]+" ");
        }

    }
}