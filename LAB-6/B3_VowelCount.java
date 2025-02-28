
/*
Create a class which ask the user to enter a sentence, and it should display count of 
each vowel type in the sentence. The program should continue till user enters a word 
“quit”. Display the total count of each vowel for all sentences. 
*/
import java.util.*;

public class B3_VowelCount {
	public static void main(String args[]) {

		Vowel v = new Vowel();
		v.isVowel();

	}

}

class Vowel {

	String word = "QUIT";
	int total_A = 0, total_E = 0, total_I = 0, total_O = 0, total_U = 0;

	public void isVowel() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.print("Enter Your Sentence:");
			String sen = sc.nextLine().toUpperCase();

			if (sen.equals(word)) {
				break;
			}

			int A = 0, E = 0, I = 0, O = 0, U = 0;

			for (int i = 0; i < sen.length(); i++) {

				if ((sen.charAt(i) == 'A' || sen.charAt(i) == 'E' || sen.charAt(i) == 'I' || sen.charAt(i) == 'O'
						|| sen.charAt(i) == 'U')) {
					if (sen.charAt(i) == 'A') {
						A++;
						total_A++;
					} else if (sen.charAt(i) == 'E') {
						E++;
						total_E++;
					} else if (sen.charAt(i) == 'I') {
						I++;
						total_I++;
					} else if (sen.charAt(i) == 'O') {
						O++;
						total_O++;
					} else if (sen.charAt(i) == 'U') {
						U++;
						total_U++;
					}

				}

			}

			System.out.println("Vowel in this sentence : ");
			System.out.println(
					"A = " + A + "," + "E = " + E + "," + "I = " + I + "," + "O = " + O + "," + " U = " + U + ",");

		}

		System.out.println("Total Vowel Count for All Sentence :");
		System.out.println(
				"A = " + total_A + "," + "E = " + total_E + "," + "I = " + total_I + "," + "O = " + total_O + ","
						+ " U = " + total_U + ",");

	}

}