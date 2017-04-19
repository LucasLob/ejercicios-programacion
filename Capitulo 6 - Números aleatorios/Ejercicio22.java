/* Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
* aleatorio. La cabeza se representará con el carácter @ y se debe colocar
* exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
* el cuerpo irá serpenteando de la siguiente manera: se generará de forma
* aleatoria un valor entre tres posibles que hará que el siguiente carácter se
* coloque una posición a la izquierda del anterior, alineado con el anterior o una
* posición a la derecha del anterior. La longitud de la serpiente se pedirá por
* teclado y se supone que el usuario introducirá un dato correcto.
 * @author Lucas Lobato
 */

public class Ejercicio22 {
  public static void main(String[] args){
    System.out.printf("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
    int serpiente = Integer.parseInt(System.console().readLine());
    int espacios = 12;
    System.out.printf("            @\n");
    for (int i = 1; i < serpiente; i++) {
      switch ((int)(Math.random() * 3)) {
        case 0:
          espacios--;
          break;
        case 1:
          espacios++;
          break;
      }
      for (int j = 0; j < espacios; j++) {
        System.out.printf(" ");
      }
      if (espacios < 0) {
        espacios = 0;
      }
      System.out.printf("*\n");
    }
  }
}
