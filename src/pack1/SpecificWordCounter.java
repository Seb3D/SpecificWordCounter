/*Version V0.3.1a
 * @author Sebastian "Seb3D" Lein
*/

package pack1;

import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SpecificWordCounter {

	public static void main(String[] args) throws Exception {
		
		
		String finput = JOptionPane.showInputDialog("Dateipfad mit 2 '\\' angeben (e. g. C:\\Java\\Bsp.txt)");
		
		String x = JOptionPane.showInputDialog("Geben Sie das zu zaehlende Wort ein: ");
				
		x = x.toLowerCase();
		
		String file = finput;

		Scanner input = new Scanner(Paths.get(file));
		
		int countWort = 0;
		
		while (input.hasNext()) {
			
			String word = input.next();
			word = word.toLowerCase();
			
			if (word.equals(x)) {
				countWort++;
			}

			
		}
		
		JOptionPane.showMessageDialog(null, "Das Wort: " + x + " kommt " + countWort + " Mal vor.");
		
	}

}
