package Palindromo;
import java.util.Scanner;

public class gyb {

	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String palabra;
			String reversa="";
			String letra;
			int Tletras;
			
	Scanner lector = new Scanner (System.in);
			
			System.out.print("Ingresa una palabra para conocer si es un palindromo"+"\n");
	        palabra = lector.next();
	        
	        Tletras= palabra.length();
	        
	        
	        for (int x=Tletras-1;x<=0;x--) {
	        	letra=palabra.substring(x,1);
	        	reversa=reversa+letra;
	        	
	        }
	        
	        if (palabra==reversa) {
	        	System.out.print("La palabra "+palabra+" es un palindromo");
	        
		}

	


}
}
