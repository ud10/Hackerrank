/**
 * 
 */
package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author uditgupta
 * Jul 7, 2016 1:43:20 PM
 */
public class FibonacciModified {
	/*
		TC1: Input - 0 1 10 :::: Output - 84266613096281243382112
	*/
	public static void main(String[] args) throws Exception{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String input = br.readLine();
	        String[] ip = input.split(" ");	        
	        long a = Integer.parseInt(ip[0]);
	        long b = Integer.parseInt(ip[1]);
	        int n = Integer.parseInt(ip[2]);
//	        double[] dp = new double[n];
//	        dp[0] = a;
//	        dp[1] = b;
//	        for(int i = 2; i<n; i++){
//	        	dp[i] = (dp[i-1] * dp[i-1]) + dp[i-2]; 
//	        }
	        BigInteger[] d = new BigInteger[n];
	    	d[0] = BigInteger.valueOf(a);
	    	d[1] = BigInteger.valueOf(b);

	    	for(int i = 2; i<n; i++){
	    		BigInteger bix = d[i-1].multiply(d[i-1]);
	    		d[i] = bix.add(d[i-2]);
	        }
	        
	        //System.out.printf("%32.4f\n", d[n-1]);
	        System.out.println(d[n-1]);
	}
}
