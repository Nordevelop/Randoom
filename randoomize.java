package misclases;

import java.util.*;


import java.math.*;

public class Main {

	public static void main(String[] args) {
		/*obtener Nros aleatorios de 1 a 10 con decimales
		 * @Author Ncontreras
		 */
 
        System.out.println("Números generados entre 1 y 10, con decimales (sin incluir el 1 y el 10)");
        for (int i=0;i<1000;i++){
            double numAleatorio=Math.random()*(10-1)+1;
            System.out.println(numAleatorio);
        }
 
    }

}
