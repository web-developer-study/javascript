import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mains {

    public static void main(String[] args) throws Exception {

        int factorialNum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = br.readLine()) != null) {
            factorialNum = Integer.parseInt(s);
            break;
        }
        System.out.println(zeroCnt(factorialNum));
    }

    public static int zeroCnt(int num) {
        System.out.println("num >> "+num);
        return num < 5 ? 0 : (num / 5) + zeroCnt(num / 5);
    }

    /*
        5! - 1
        10! - 2
        15! - 3
        20! - 4
        25! - 6
        30! - 7
        35! - 8
        40! - 9
        45! - 10
        50! - 12
        ...
        125! -

        >> N!의 뒤쪽 0의 갯수는 5의 승수
    }
     */
}