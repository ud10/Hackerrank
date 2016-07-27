/**
 * 
 */
package dataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author uditgupta
 * Jul 22, 2016 12:29:24 PM
 */
public class SparseArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0; i<n; i++){
        	String str = br.readLine();
        	if(hm.containsKey(str)){
        		int c = hm.get(str);
        		hm.put(str, c+1);
        	}else{
        		hm.put(str, 1);
        	}
        }
        String Q = br.readLine();
        int q = Integer.parseInt(Q);
        String[] t = new String[q];
        for(int i = 0; i<q; i++){
        	t[i] = br.readLine();
        }
        for(int i = 0; i<q; i++){
        	if(!hm.containsKey(t[i]))
        		System.out.println(0);
        	else{
        		System.out.println(hm.get(t[i]));
        	}
        }
	}
}
