/**
* Escribe un programa que piense un número al azar entre 0 y 100. El usuario
* debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
* fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
* ducido es menor o mayor que el número secreto.
* OBS: Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50
**/

public class Ejercicio06 {
  public static void main(String[] args) {

    int numeroAleatorio = ((int)(Math.random()*101));
    int numeroIntroducido = 0;
    int intentos = 5;
    boolean acertado = false;
    System.out.println(numeroAleatorio);
    

    System.out.println("Tienes 5 intentos para adivinar un número aleatorio");

    for (int contador = 1; contador <=5 && !acertado; contador++){
      int numeroIntroducidoBucle = Integer.parseInt(System.console().readLine());;
      intentos--;
        if ((numeroIntroducidoBucle != numeroAleatorio) && (numeroIntroducidoBucle < numeroAleatorio)){
          System.out.println("Has fallado, te quedan " + intentos + " intentos.");
          System.out.println("El número introducido es menor que el número secreto");
          
        } if ((numeroIntroducidoBucle != numeroAleatorio) && (numeroIntroducidoBucle > numeroAleatorio)){
          System.out.println("Has fallado, te quedan " + intentos + " intentos.");
          System.out.println("El número introducido es mayor que el número secreto");
       
        } if ((numeroIntroducidoBucle == numeroAleatorio) && (acertado = true)){
          System.out.println("Enhorabuena has acertado");
        }
    }
  }
}
