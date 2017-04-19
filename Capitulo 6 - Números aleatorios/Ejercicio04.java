/*
* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) sepa-
* rados por espacios.
* 
* OBS:  Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50
*
* @author Lucas Lobato Botelho
* 
**/


public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.print("El programa generará 20 números aleatorios dentro del");
    System.out.println(" rango 0-10: ");

    for (int contador = 1; contador <= 20; contador++) {
      int numeroAleatorio = ((int)(Math.random()*11));
      System.out.println("Su " + contador + "º número aleatorio es " + numeroAleatorio);
    }
  }
}
    
