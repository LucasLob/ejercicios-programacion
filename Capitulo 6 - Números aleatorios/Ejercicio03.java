/*
* Igual que el ejercicio anterior pero con la baraja española.
* Se utilizará la baraja de 40 cartas:2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
* 
* OBS:  Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50
*
* @author Lucas Lobato Botelho
* 
**/


public class Ejercicio03 {
  public static void main(String[] args) {

    int numeroPalo = ((int)(Math.random()*4 +1));
    String nombrePalo = "";

    int numeroCarta = ((int)(Math.random()*10 + 1));
    String nombreCarta = "";
    
    switch (numeroPalo){
      case 1:
      nombrePalo = "Oros";
      break;

      case 2:
      nombrePalo = "Copas";
      break;

      case 3:
      nombrePalo = "Espadas";
      break;

      case 4:
      nombrePalo = "Palos";
    }

    switch (numeroCarta){
      case 1:
      nombreCarta = "As";
      break;

      case 2:
      nombreCarta = "2";
      break;

      case 3:
      nombreCarta = "3";
      break;

      case 4:
      nombreCarta = "4";
      break;

      case 5:
      nombreCarta = "5";
      break;

      case 6:
      nombreCarta = "6";
      break;

      case 7:
      nombreCarta = "7";
      break;

      case 8:
      nombreCarta = "Sota";
      break;

      case 9:
      nombreCarta = "Caballo";
      break;

      case 10:
      nombreCarta = "Rey";
      break;
    }
    
    System.out.println();
    System.out.print("Su carta aleatoria de la baraja española es ");
    System.out.println(nombreCarta + " de " + nombrePalo);
  }
}
