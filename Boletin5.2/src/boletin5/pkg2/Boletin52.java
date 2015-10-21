

package boletin5.pkg2;

import java.util.Scanner;

/**
 *
 * @author agomezcastro
 */
public class Boletin52 {

    
    public static void main(String[] args) {
        double meridiano, paralelo, distanciaTerra;
        Scanner obx = new Scanner (System.in);
        System.out.println("meridiano: ");
        meridiano= obx.nextDouble();
        System.out.println("paralelo:" );
        paralelo= obx.nextDouble();
        System.out.println("distancia da Terra: ");
        distanciaTerra= obx.nextDouble();
        Satelite satelite1 = new Satelite();
        System.out.println("o satelite atopase no paralelo: "+ paralelo + " meridiano: " + meridiano + " a unha distancia da Terra: " + distanciaTerra);
    }
    
}
