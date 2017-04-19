/**
 * Ejercicio 5
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle while .
 * @author Lucas Lobato Botelho
 */
 
public class Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.print("El programa muestra los números del 320");
    System.out.print(" al 160,contando de 20 en 20 hacia atrás usando");
    System.out.println(" el bucle while: ");
    System.out.println();
    int cuentaHaciaAtras = 320;
      while (cuentaHaciaAtras >= 160) {
      
        System.out.println("- " + cuentaHaciaAtras);
      
        cuentaHaciaAtras -= 20;
      }
  }
}
