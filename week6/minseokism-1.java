/*
	[ASYMTILING] 비대칭 타일링
	문제 출처 : https://algospot.com/judge/problem/read/ASYMTILING
*/

package algospot;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ASYMTILING {
	private static BigInteger[] numbers = new BigInteger[101];
	private final static long mod = 1000000007l;
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		Arrays.fill(numbers, BigInteger.ZERO);
		numbers[0]=BigInteger.ONE;
		numbers[1]=BigInteger.ONE;
		numbers[2]=BigInteger.valueOf(2l);
		
		for(int i=0;i<input;i++){
			int num = Integer.parseInt(sc.nextLine());
			System.out.println(process(num));
		}
		sc.close();
	}
	
    public static BigInteger fibo(int n){
        if(numbers[n] != BigInteger.ZERO){
            return numbers[n];
        }

        numbers[n] = fibo(n-1).add(fibo(n-2));
        return numbers[n];
    }
    
    public static long process(int n){
    	fibo(n);
    	if(n%2==1){
    		return (numbers[n].subtract(numbers[n/2])).mod(BigInteger.valueOf(mod)).longValue();
    	}else if(n==2){
    		return 0;
    	}else{
    		BigInteger temp=(numbers[n/2-1].multiply(BigInteger.valueOf(2l)).add(numbers[n/2-2]));   		
    		return (numbers[n].subtract(temp)).mod(BigInteger.valueOf(mod)).longValue();
    	}

    }

}
