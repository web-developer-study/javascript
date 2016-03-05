import java.util.Scanner;

// 백준저지 통과 - x 결과만 나오도록 막 짠 소스
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String resultMsg = "";
        for(int i=0; i<cnt; i++){
            Scanner twoSc = new Scanner(System.in);
            int twoCnt = twoSc.nextInt();
            int val[] = new int[twoCnt];
            for(int j=0; j<twoCnt; j++){
                val[j] = twoSc.nextInt();
            }

            resultMsg += printStr(val)+"\n";
        }
        System.out.print(resultMsg.substring(0, resultMsg.length()-1));
    }

    public static int gcd(int num1, int num2){
        return (num1 % num2 == 0 ? num2 : gcd(num2, num1%num2));
    }


    public static int printStr(int[] arr){
        int resultGcd = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                resultGcd += gcd(arr[i], arr[j]);
            }
        }
        return resultGcd;
    }
}
