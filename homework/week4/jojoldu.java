import java.util.Scanner;
 
public class Main{
    private static int[] numbers = new int[999999999];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Arrays.fill(fibo, 0);
        fibo[0] = 1;
        fibo[1] = 2;
        
        for(int i=0;i<5;i++){
          int n = Integer.parseInt(in.nextLine());
          System.out.println(fibo(n));          
        }
    }

    public static int fibo(int n){
        if(numbers[n] != 0){
            return numbers[n];
        }

        numbers[n] = numbers[n-1] + numbers[n-2];
        return numbers[n];
    }
}