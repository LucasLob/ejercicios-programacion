/**
* - Realiza un programa que muestre al azar el nombre de una carta de la
* baraja francesa.
* 
* - Esta baraja está dividida en cuatro palos: picas, corazones,
* diamantes y tréboles.
* 
* - Cada palo está formado por 13 cartas, de las cuales 9
* cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
* sería el 1).
* 
* - Para convertir un número en una cadena de caracteres podemos
* usar String.valueOf(n) .
* 
* OBS:  Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50
*
* @author Lucas Lobato Botelho
* 
**/


public class Ejercicio02 {
  public static void main(String[] args) {
  
  int numeroPalo = ((int)(Math.random()*4 +1));
  String nombrePalo = "";

  int numeroCarta = ((int)(Math.random()*13 +1));
  String nombreCarta = "";

  switch (numeroPalo){
    case 1:
      nombrePalo = "Picas";
      break;

    case 2:
      nombrePalo = "Corazones";
      break;

    case 3:
      nombrePalo = "Diamantes";
      break;

    case 4:
      nombrePalo = "Tréboles";
      break;
  }

  switch (numeroCarta){
    case 1:
      nombreCarta = "A";
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
      nombreCarta = "8";
      break;

    case 9:
      nombreCarta = "9";
      break;

    case 10:
      nombreCarta = "10";
      break;

    case 11:
      nombreCarta = "J";
      break;

    case 12:
      nombreCarta = "Q";
      break;

    case 13:
      nombreCarta = "K";
      break;
      
  }

  System.out.println("Su carta aleatoria es " + nombreCarta + " de " + nombrePalo);
  }
}

    

    

    
    
    
