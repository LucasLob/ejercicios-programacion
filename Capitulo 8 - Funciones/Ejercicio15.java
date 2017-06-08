/**
 * Muestra los números primos que hay entre 1 y 1000.
 * @author Lucas
 */
package ejerciciosfunciones;
import matematicas.Matematicas;

public class Ejercicio15 {
  public static void main (String [] args){
    System.out.println("Los números primos de 1 a 1000 son: ");
    for (int i = 2; i < 1001; i++){
      if (Matematicas.esPrimo(i)){
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
