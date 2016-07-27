/**
 * 
 */
package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author uditgupta
 * Jul 7, 2016 2:57:31 PM
 */
public class Candies {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String s = br.readLine();
	        int n = Integer.parseInt(s);
	        int[] rating = new int[n];
	        for(int i = 0; i<n; i++){
	        	rating[i] = Integer.parseInt(br.readLine());
	        }
	        long[] candies = new long[n];
	        candies[0] = 1;
	        for(int i = 1; i<n; i++){
	        	if(rating[i] > rating[i-1])
	        		candies[i] = candies[i-1] + 1;
	        	else
	        		candies[i] = 1;
	        }
	        long result = candies[n-1];
	        for(int i = n-2; i>=0; i--){
	        	long current = 1;
	        	if(rating[i] > rating[i+1])
	        		current = candies[i+1] + 1;
	        	result += Math.max(current, candies[i]);
	        	candies[i] = current;
	        }
	        System.out.println(result);
	}

}
