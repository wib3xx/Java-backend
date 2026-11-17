//Counting vowels and consonants (JavaWorld)

package com.strings.practice;


import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().toLowerCase();
		
		int vowels = 0, consonants = 0;
		
		for(char ch : text.toCharArray()) {
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		} 
		
		System.out.println("Vowels:  "+ vowels);
		System.out.println("Consonents:  "+ consonants);
	}
}
