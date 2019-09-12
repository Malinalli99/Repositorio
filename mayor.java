package nums;
import java.util.Scanner;
public class mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1;
		double n2;
		double n3;
		double n4;
		double mayor;
		
		Scanner lector = new Scanner (System.in);
		
		System.out.print("Ingresa el primer número"+"\n");
        n1 = lector.nextDouble();
        
        System.out.print("Ingresa el segundo número"+"\n");
        n2 = lector.nextDouble();
        
        System.out.print("Ingresa el tercer número"+"\n");
        n3 = lector.nextDouble();
        
        System.out.print("Ingresa el cuarto número"+"\n");
        n4 = lector.nextDouble();
        
        if (n1>=n2) {
        	mayor=n1;
        }
        else 
        	mayor=n2;
        
        if (mayor<=n3) {
        	mayor=n3;
        }
        
        if (mayor<=n4) {
        	mayor=n4;
        }
        
        System.out.print("El numero mayor es "+mayor+"\n");
	}
}
