/*
Write a program to accept a line and check how many consonants and vowels are there 
in line.[A] 
*/

import java.util.Scanner;

public class ConsonatOrVowel{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String str = sc.nextLine();

		int consonat = 0;
		int vowel = 0;



		for(int i = 0;i<str.length();i++){
			
			char ch = str.charAt(i);

			if(ch == 'a' || ch == 'e' || ch == 'i'|| ch=='o' || ch=='u'){
				vowel++;
			}
			else{
				consonat++;
			}

		}

		System.out.println("Consoant = " + consonat);
		System.out.println("Vowel = " + vowel);
	}

}


