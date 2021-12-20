import java.util.Random;

import java.math.*;

public class Inicio {

	public static void main(String[] args) {
		/* @Author Nordevelop
		*Numeros Aleatorios
		 * encontrar 6 Numeros enteros aleatorios
		 * entre 1 y 10 (Ambos incluidos)
		 *   Y mostrar el máximo, el mínimo y la media de esos números aleatorios.
		 */
		  int maximo = 1;
		    int minimo = 10;
		    int suma = 0;
		    int n;
		    
		    for (int i = 0; i < 6; i++) {
		      n = (int)(Math.random()*10) + 1;
		      System.out.println(n );
		      suma += n;
		      
		      if (n < minimo) {
		        minimo = n;
		      }
		      
		      if (n > maximo) {
		        maximo = n;
		      }
		    }
		    
		    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 5);
		  }
		}
