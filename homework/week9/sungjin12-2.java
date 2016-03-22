import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	static char[] arrstr = new char[1000000];
	static char[] arrboom = new char[37];
	static char[] stack = new char[1000000];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String boom = br.readLine();
		
		int strsize = str.length();
		int boomsize = boom.length();
		int point = 0;
	
		for(int i = 0; i < strsize; i++){
			arrstr[i] = str.charAt(i);
		}
		for(int i = 0; i < boomsize; i++){
			arrboom[i] = boom.charAt(i);
		}
		
		char lastBoom = arrboom[boomsize - 1];
		
		for(int i = 0; i < strsize; i++){
			stack[point++] = arrstr[i];
			if(point >= boomsize && arrstr[i] == lastBoom){
				int k = 0;
				for(int j = point - boomsize; j < point; j++){
					if(stack[j] != arrboom[k]){
						break;
					}
					k++;
				}
				if(k == boomsize){
					point -= boomsize;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < point; i++){
			sb.append(stack[i]);
		}
		if(point == 0){
			System.out.println("FRULA");
		} else {
			System.out.println(sb.toString());
		}
	}
}