import java.util.Scanner;

class Halloween{ 
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
    //candies de cada nino
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
    
    //bolsas llenas?
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;

     // Probablidades
     final double PROBABILIDAD_CASA_ABIERTA = 0.7;
     final double PRO_GANAR_CHUCHES = 0.8;
     
    
     
    //control del edificio
           
        int v= 0;   //casas visitadas
    
      //max candies x bolsa
        final int MAX = 20;

    do{ 
             //bucle principal del edificio
             v++;
             System.out.println("\n=== Piso " + v + " ===");
             for (int i =1; i<=4; i++){

             System.out.println("\nVisitando casa " + i + " del piso " + v);
                    
        //ver si hay suerte
          double suerte = Math.random() * 100 + 1;
         if(suerte <= PROBABILIDAD_CASA_ABIERTA){
          System.out.println("¡La casa está abierta!");
                        
          //nino 1
          if(b1 == false && c1<=PRO_GANAR_CHUCHES){
            double s2 = Math.random() * 100 + 1;
            int n = (int)(Math.random() * 3 + 1);
            c1 = c1 + n;
            System.out.println("Niño 1 recibió " + n + " caramelos");
            if (c1 == MAX){
            System.out.println("¡La bolsa del niño 1 está llena!"); 
           }
             
          
                        
        //nino 2
          if(b2 == false && c2 <= PRO_GANAR_CHUCHES){
              double s2 = Math.random() * 100 + 1;
              int n = (int)(Math.random() * 3 + 1);
              c2 = c2 + n;
              System.out.println("Niño 2 recibió " + n + " caramelos");
              if(c2 == MAX){
              System.out.println("¡La bolsa del niño 2 está llena!");}
             }
            
          
                        
          //nino 3
        if(b3 == false && c3 <= PRO_GANAR_CHUCHES){
            double s2 = Math.random() * 100 + 1;
            int n = (int)(Math.random() * 3 + 1);
            c3 = c3 + n;
         System.out.println("Niño 3 recibió " + n + " caramelos");
                                
        if (c3 == MAX){
         System.out.println("¡La bolsa del niño 3 está llena!");}
            }
          }
        
        else{ System.out.println("Casa cerrada, seguimos adelante..."); }
                    
        //si todas las bolsas estan llenas salimos
        if(b1 && b2 && b3){ System.out.println("\n¡Todas las bolsas están llenas! Terminamos la búsqueda."); break; }
                    
          i = i + 1;
        
        //salir si todas las bolsas estan llenas
        if(b1 && b2 && b3){ break; }
                
        //salir si llegamos al ultimo piso
        if(v == 4*5){ break; }
                
        v = v + 1;
        
            
      //print final
        System.out.println("\n=== Resultados Finales ===");
        System.out.println("Casas visitadas: " + v);
        System.out.println("Niño 1: " + c1 + " caramelos" + (b1 ? " (Bolsa llena)" : ""));
        System.out.println("Niño 2: " + c2 + " caramelos" + (b2 ? " (Bolsa llena)" : ""));
        System.out.println("Niño 3: " + c3 + " caramelos" + (b3 ? " (Bolsa llena)" : ""));
      }
    }while(v<=4*5 || (b1 && b2 && b2 && b3 ) );
    } 
}  

    
