/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    
    
  
    public static void main(String[] args) {
          Scanner key = new Scanner(System.in);
          String ciclo = "s";
    while (ciclo.equals("s"))
{
        try
          {
              maain();
          }
        catch(Exception e){System.out.println("Error de datos");
              }  
        System.out.println("Desea continuar(s/n)");
        ciclo = key.next();   
}
         
        System.out.println("Adios!");       
    }
   
    static void maain()
    {
    Scanner key = new Scanner (System.in);
       int opcion;       
        switch (menu())
        {
                case 1:
                escribe();
                menu2("1. ","L","gal"); 
                menu2("2. ","gal","L");
                opcion = key.nextInt();key.nextLine();
                condicion(opcion,0.264);
                break;
                           
                case 2:       
                escribe();
                menu2("1. ","cm","in");
                menu2("2. ","m","ft");
                menu2("3. ","km","mi");
                opcion = key.nextInt();key.nextLine();
                switch(opcion)
                {
                    case 1://cm y in
                    escribe();
                    menu2("1. ","cm","in");
                    menu2("2. ","in","cm");
                    opcion=key.nextInt();
                    condicion(opcion,0.3937);                       
                    break;
                        
                    case 2://m y ft
                    escribe();
                    menu2("1. ","m","ft");
                    menu2("2. ","ft","m");
                    opcion=key.nextInt();
                    condicion(opcion,3.2808);    
                    break;
                        
                    case 3://km y mi             
                    escribe();
                    menu2("1. ","km","mi");
                    menu2("2. ","mi","km");
                    opcion=key.nextInt();
                    condicion(opcion,0.6214);    
                    break;
                   

        }
                break;
             
                case 3:
                escribe();
                menu2("1. ","°C","°F");
                menu2("2. ","°F","°C");
                opcion=key.nextInt();           
                if(opcion==1){
                    resultado((cantidad()*9/5)+32);
                }
                 if(opcion==2){
                    resultado((cantidad()-32)*5/9);
                }
                break;
                    
                case 4:
                escribe();
                menu2("1. ","g","lb");
                menu2("2. ","lb","g");
                opcion=key.nextInt();
                condicion(opcion,0.00220462);    
                break;
                
                default:
                    System.out.println("Error de datos");
                    break;
             }
        
     }
    static int menu()
    {
       Scanner key = new Scanner (System.in);
       int a;
        
        System.out.println("Calculadora de conversiones");
        System.out.println("Sistema metrico decimal y sistema inglés");
        System.out.println("Teclea la opción deseada:");
        System.out.println("1. Conversión de líquidos");
        System.out.println("2. Conversión de distancias");
        System.out.println("3. Conversión de temperaturas");
        System.out.println("4. Conversión de pesos"); 
        a = key.nextInt(); key.nextLine();
        return a;
    }
             
    static double cantidad ()
    {
        Scanner key = new Scanner (System.in);
        double cant;
        System.out.println("Ingresa la cantidad a convertir: ");
        cant = key.nextDouble();
        return cant;
    }
    
    static void resultado(double r)
    {
        System.out.println("Resultado: "+r);
    }
    
    static void menu2(String num,String uni1, String uni2){
        System.out.println(num+uni1+ " a "+uni2);

    }
    
    static void condicion (int var, double conversion)
    {
        if (var==1)
        {
        resultado(cantidad()*conversion);                 
        }
        else if (var==2)
        {
        resultado(cantidad()/conversion);
        }
        else {
            System.out.println("Error de datos");
        }
        
    }
    
    static void escribe()
    {
        System.out.println("Escribe la opción deseada:");
    }
}
