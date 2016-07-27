import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author uditgupta
 * Jul 3, 2016 7:44:49 AM
 */
public class SherlockAndSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String tc = br.readLine();
	        int t = Integer.parseInt(tc);
	        int c = 0;
	        while(t > 0){
	            String input = br.readLine();
	            String a = input.split(" ")[0];
	            String b = input.split(" ")[1];
	            int A = Integer.parseInt(a);
	            int B = Integer.parseInt(b);
	            c = 0;
	            for(int i = A; i<=B; i++){
	                for(int j = 1; j<=i/2; j++){
	                    if(j * j == i)
	                        c++;
	                }
	            }
	            System.out.println(c);
	            t--;
	        }
	       
	}
}
