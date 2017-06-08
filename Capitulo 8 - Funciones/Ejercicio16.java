/**
 *
 * @author Lucas
 */
package ejerciciosfunciones;
import matematicas.Matematicas;

public class Ejercicio16 {
  public static void main (String[] args){
    
    System.out.println("Los números capícua de 1 a 99999 son: ");
    
    for(int i = 1; i <= 99999; i++){
      if (Matematicas.esCapicua(i)){
        System.out.print(i + " ");
      }
    }
  }
}
