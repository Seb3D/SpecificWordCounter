/*Version V0.1.a
 * @author Sebastian "Seb3D" Lein
*/

package pack1;

import java.nio.file.Paths;
import java.util.Scanner;

public class SpecificWordCounter {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Welches Wort moechtest du zaehlen?");
		Scanner worteingabe = new Scanner(System.in);
		
		String x = worteingabe.next();
		x = x.toLowerCase();
		
		String file = "D:\\Java\\Programme\\Bootcamp\\Zaehlen.txt";

		Scanner input = new Scanner(Paths.get(file));
		
		int countWort = 0;
		
		while (input.hasNext()) {
			
			String word = input.next();
			word = word.toLowerCase();
			
			if (word.equals(x)) {
				countWort++;
			}

			
		}
		
		System.out.println( "Das Wort: " + x + " kommt " + countWort + " Mal vor.");
		
	}

}
