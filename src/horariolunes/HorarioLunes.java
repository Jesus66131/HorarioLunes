package horariolunes;

import java.util.Scanner;

public class HorarioLunes {

    
    public static void main(String[] args) {
        
        Scanner ent= new Scanner(System.in);
        int hora = 0;
        
        System.out.println("Ingresa la hora");
        hora = ent.nextInt();
      
       if (hora>0 && hora<25){
           if(hora==24 || hora<6){
               hora = 1;
            }
           switch(hora){
               case 1: 
                   System.out.println("Dormir");
                   break;
                case 6: 
                   System.out.println("Desayunar");
                   break;
                case 7: 
                   System.out.println("Clase de Administración");
                   break;
                case 8: 
                   System.out.println("Clase de Organización Computacional");
                   break;
                case 9: 
                   System.out.println("Clase de Organización Computacional");
                   break;
                case 10: 
                   System.out.println("Clase de Física");
                   break;
                case 11: 
                   System.out.println("Clase de Física");
                   break;
                case 12: 
                   System.out.println("Clase de Organización Computacional");
                   break;
                case 13: 
                   System.out.println("Descansar");
                   break;
                case 14: 
                   System.out.println("Comer");
                   break;
                case 15: 
                   System.out.println("Descansar");
                   break;
                case 16: 
                   System.out.println("Tarea");
                   break;
                case 17: 
                   System.out.println("Tarea");
                   break;
                case 18: 
                   System.out.println("Tarea");
                   break;
                case 19: 
                   System.out.println("Ejercicio");
                   break;
                case 20: 
                   System.out.println("Ejercicio");
                   break;
                case 21: 
                   System.out.println("Bañarse");
                   break;
                case 22: 
                   System.out.println("Cenar");
                   break;
                case 23: 
                   System.out.println("Descansar");
                   break;
            }
       }else{
           System.out.println("La hora no es correcta");
       }   
    }
    
}
