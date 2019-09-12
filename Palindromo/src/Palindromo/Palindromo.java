package Palindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra;
		String reversa="";
		char letra;
		int Tletras=0;
		
Scanner lector = new Scanner (System.in);
		
		System.out.print("Ingresa una palabra para conocer si es un palindromo"+"\n");
        palabra = lector.next();
        
        Tletras= palabra.length();
        
        for (int x=Tletras-1;x>=0;x--) {
        	letra = palabra.charAt(x);
        	reversa=reversa+letra;
        	}
        
        if (palabra.contentEquals(reversa)) {
        	System.out.print("¡La palabra "+palabra+" es un palindromo!");
        } 
        else {
        	System.out.print("La palabra "+palabra+" NO es un palindromo");	
        }
	}

}
