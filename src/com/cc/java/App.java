package com.cc.java;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
      // // Deklaration: int
		// int [] intArr = new int [4];
		// ausgabe("Länge Array: " + intArr.length);	
		
		// // Index
		// ausgabe("3. Element " + intArr[2]);
		
		// intArr[0] = 10;
		// ausgabe("1. Element " + intArr[0]);
		// intArr[intArr.length - 1] = 11;
		
		// for (int i = 0; i < intArr.length; i++) {
		// 	ausgabe("Element: " + i + " : "+ intArr[i]);
		// }
			
		
		// Deklaration: String
		//String [] strArr = new String [2];
				
		// String [] strArr = {"Hallo","Holger"};
		
		// for (int i = 0; i < strArr.length; i++) {
		// 	ausgabe(strArr[i]);
		// }
		
		
		// Mehrdimensionale Arrays
		//String [][] strMdArr = new String [2][2];
		
		// String [][] strMdArr = {{"Max","Mustermann"},{"Karin","Musterfrau"}};
		
		// {{0,2,1},{1,0,0}}  x|y|z
		
		// ausgabe(strMdArr[0][0]);
		// ausgabe(strMdArr[1][1]);
		
		// nested loops
		// for (int i = 0; i < strMdArr.length; i++) {
		// 	for (int j = 0; j < strMdArr.length; j++) {
		// 		ausgabe("Indizes i/j: " + "i:" +  i + " j:"+ j + " " + strMdArr[i][j]);
		// 	}
		// }
		
		
//		// Deklaration | Chars
		char [] letters = {'d','B','c','a','A','b'};
		
		ausgabe("---- vor Sortierung: ----");

		for (int i = 0; i < letters.length; i++) {
			ausgabe(String.valueOf(letters[i]));	
		}
//		
		// Sortierfkt. --> sortiertes Array
		
		Arrays.sort(letters);  // Statische Klasse | Methode
		
		ausgabe("---- nach Sortierung: ----");
		for (int i = 0; i < letters.length; i++) {
			ausgabe(String.valueOf(letters[i]));	
		}

//		
		ausgabe("");
		ausgabe("---- Suche: erfolgreich ----");
		
		// ... danach Suche (1)
		int searchIndex = Arrays.binarySearch(letters,'a');
		ausgabe("searchIndex: " + searchIndex);
		
		ausgabe("");
		ausgabe("---- Suche: erfolglos ----");
		
		// // ... danach Suche (2)
		searchIndex = Arrays.binarySearch(letters,'e');
		ausgabe("searchIndex: " + searchIndex);  // -(length+1)
		// .... isInArray()
		
		ausgabe("");
		ausgabe("---- fill() ----");
		
		//.. Array füllen
		Arrays.fill(letters, '0');
		for (int i = 0; i < letters.length; i++) {
			ausgabe(String.valueOf(letters[i]));
		}
    

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
