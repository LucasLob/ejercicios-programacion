/**
* Escribe un programa que simule la tirada de dos dados. El programa deberá
* continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
* dados tengan el mismo valor.
* 
* OBS: Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50r 
* @author Lucas Lobato Botelho
**/

public class Ejercicio13 {
  public static void main(String[] args){
    int tiradaDado1;
    int tiradaDado2;

    System.out.print("Este programa muestra las tiradas de dos dados hasta que");
    System.out.println(" estos tengan el mismo");
    System.out.println("valor: ");
    System.out.println("-----------------------------------------------");
      do {
        tiradaDado1 = ((int)(Math.random()*6 + 1));
        tiradaDado2 = ((int)(Math.random()*6 + 1));
        System.out.print ("Tirada primer dado : " + tiradaDado1);
        System.out.println("   Tirada segundo dado: " + tiradaDado2);
      } while (tiradaDado2 != tiradaDado1);
    }
  }
