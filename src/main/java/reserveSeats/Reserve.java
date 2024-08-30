package reserveSeats;

import java.util.Scanner;

public class Reserve {
    
   public static void main (String [] args){
       Cinema cinema= new Cinema();
       int menu, f,c;
       System.out.println("Bienvenido");
       do{
           Scanner sc= new Scanner(System.in);
           System.out.println("Menu");
           System.out.println("Selecciona una opcion");
           System.out.println("Opcion 1: Visualizar asientos.");
           System.out.println("Opcion 2: Reservar Asiento");
           System.out.println("Opcion 3: Salir");
           menu= sc.nextInt();
           if(menu==1){
               cinema.getSits();
           }else if (menu==2){
               System.out.println("Ingresa la fila que deseas");
               f=sc.nextInt();
               System.out.println("Ingresa la columna que deseas");
               c=sc.nextInt();
               System.out.println(cinema.reserveSits(f, c));
            }else if(menu<0||menu>3){
               System.out.println("Opción Incorrecta, selecciona otra!");
           }
       }while(menu!=3);
       System.out.println("Gracias por usar el sistema");
   }
}
