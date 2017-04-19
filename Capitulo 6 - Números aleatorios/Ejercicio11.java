/**
* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
* aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
* final aparecerá el número de suspensos, el número de suficientes, el número
* de bienes, etc.
* 
* OBS: Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50r 
* @author Lucas Lobato Botelho
**/

public class Ejercicio11 {
  public static void main(String[] args){
    int numeroGenerado;
    String nota = "";
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    System.out.println("Este programa muestra 20 notas al azar y el número total de cada una de ellas:");
    System.out.println();

    for (int contadorNotas = 1; contadorNotas <=20; contadorNotas++){
      numeroGenerado = (int)(Math.random()*5 +1);
      System.out.print(contadorNotas + "º. ");
      switch (numeroGenerado){
        case 1:
        nota = "suspenso";
        break;

        case 2:
        nota = "suficiente";
        break;

        case 3:
        nota = "bien";
        break;

        case 4:
        nota = "notable";
        break;

        case 5:
        nota = "sobresaliente";
        break;
      
      }
      System.out.println(nota);

      switch (nota){
        case "suspenso":
          suspenso++;
          break;
        case "suficiente":
          suficiente++;
          break;
        case "bien":
          bien++;
          break;
        case "notable":
          notable++;
          break;
        case "sobresaliente":
          sobresaliente++;
          break;
      }
      }
      System.out.println();
      System.out.println("Ha habido: ");
      System.out.println(suspenso + " suspensos");
      System.out.println(suficiente + " suficientes");
      System.out.println(bien + " bienes");
      System.out.println(notable + " notables");
      System.out.println(sobresaliente + " sobresalientes");
      
        
      }
    }
