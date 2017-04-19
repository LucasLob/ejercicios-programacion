/**
 * Ejercicio 4
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for .
 * @author Lucas Lobato Botelho
 */
 
public class Ejercicio04 {
  public static void main(String[] args) {
    
    System.out.print("El programa muestra los números del 320");
    System.out.println(" al 160,contando de 20 en 20 hacia atrás: ");
    
    for (int restaHaciaAtras = 320; restaHaciaAtras >= 160 ; restaHaciaAtras -= 20) {
      if (restaHaciaAtras == 160){
       System.out.print(restaHaciaAtras + ".");
      } else {
          System.out.print(restaHaciaAtras + ", ");
        }
    }
  }
}
