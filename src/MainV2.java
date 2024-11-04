public class MainV2 {
    public static void main(String args[]) {
    //candies de cada nino
        int c1 = 0;
      int c2 = 0;
            int c3 = 0;
    
    //bolsas llenas?
        boolean b1 = false;
      boolean b2 = false;
        boolean b3 = false;
    
    //control del edificio
      int p = 5;   //piso actual
        int v = 0;   //casas visitadas
      boolean subiendo = false; //siempre falso xq bajamos
        String direccion = "BAJANDO";  //nunca se usa pero ahi esta
      int quedanPisos = 1;  //el piso al que queremos llegar
    
      //max candies x bolsa
        int max = 20;
            
        while(true){
      //mostrar piso
    System.out.println("=== Piso " + p + " ===");
                
        //visitar casas del piso actual donde estamos ahora en este momento
          int i = 1;
        while(i <= 4){
          v = v + 1;
      System.out.println("Visitando casa " + i + " del piso " + p);
                    
        //ver si podemos pedir
          if(b1 && b2 && b3) {
              System.out.println("Ya no pedimos pero seguimos bajando...");
          } else {
              //ver si hay suerte
                double suerte = Math.random() * 100 + 1;
              if((int)suerte <= 70){
            System.out.println("Casa abierta!");
                        
                  //ver si nos dan
                    double s2 = Math.random() * 100 + 1;
                  if((int)s2 <= 80){
                int n = (int)(Math.random() * 3 + 1);
    
                      //nino 1
                        if(b1 == false){
                    c1 = c1 + n;
                System.out.println("Niño 1 recibe " + n + " caramelos");
                                
                    if(c1 >= max){
                        b1 = true;
                      c1 = max;
                    System.out.println("Bolsa del niño 1 llena!");
                                    }
                                }
                        
                      //nino 2
                        if(b2 == false){
                    c2 = c2 + n;
                System.out.println("Niño 2 recibe " + n + " caramelos");
                                
                    if(c2 >= max){
                        b2 = true;
                      c2 = max;
                    System.out.println("Bolsa del niño 2 llena!");
                                    }
                                }
                        
                      //nino 3
                        if(b3 == false){
                    c3 = c3 + n;
                System.out.println("Niño 3 recibe " + n + " caramelos");
                                
                    if(c3 >= max){
                        b3 = true;
                      c3 = max;
                    System.out.println("Bolsa del niño 3 llena!");
                                    }
                                }
                            }
              } else {
                  System.out.println("Casa cerrada... siguiente!");
                        }
                    }
                    
            i = i + 1;  //siguiente casa del piso
                }
                
        //bajar al siguiente piso
          p = p - 1;
                
        //ver si hemos llegado abajo del todo
          if(p < quedanPisos){
              break;  //ya hemos bajado todo el edificio
                }
      }
            
        //print final
      System.out.println("=== Resultados Finales ===");
        System.out.println("Casas visitadas: " + v);
          System.out.println("Niño 1: " + c1 + " caramelos" + (b1 ? " (Bolsa llena)" : ""));
            System.out.println("Niño 2: " + c2 + " caramelos" + (b2 ? " (Bolsa llena)" : ""));
        System.out.println("Niño 3: " + c3 + " caramelos" + (b3 ? " (Bolsa llena)" : ""));
        }
    }
