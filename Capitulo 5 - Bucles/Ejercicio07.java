/**
* Realiza el control de acceso a una caja fuerte. La combinación será un
* número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
* acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
* y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
* Tendremos cuatro oportunidades para abrir la caja fuerte.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args) {
  
    System.out.println("Descubre la combinación de la caja fuerte: ");
    
    int combinacionCorrecta = 6258;
    int intentos = 4;
    int contrasenaIntroducida;
    Scanner n = new Scanner(System.in);
    
    
   do {
      System.out.print("Dispones de  " + intentos + " intentos : " );
      contrasenaIntroducida = Integer.parseInt(n.nextLine());
        if (contrasenaIntroducida == combinacionCorrecta){
          System.out.println("¡Enhorabuena! La caja se ha abierto satisfactoriamente.");
        } else {
          System.out.println();
          System.out.println("Lo siento, esa no es la combinación.");
        }
        
      intentos--;
    } while ((contrasenaIntroducida != combinacionCorrecta) && (intentos > 0 ));
  }
}
