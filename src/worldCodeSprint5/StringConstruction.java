/**
 * 
 */
package worldCodeSprint5;

import java.util.Scanner;

/**
 * @author uditgupta
 * Jul 24, 2016 11:35:24 AM
 */
public class StringConstruction {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            char characters[] = s.toCharArray();
            int countUnique = s.length();
            for(int i = 0; i < characters.length; i++){
                if (i != s.indexOf(characters[i])) {
                	countUnique--;
                }
            }
            System.out.println(countUnique);
         }
	}
}
