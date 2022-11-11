
package fundamentos;

import java.util.Iterator;

public class Estructuras {
    public static void main(String[] args) {
        
        //Alternativas
        int x=3;
        if(x==3){
            System.out.println("Tres");
        }else{
            System.out.println("X no es tres");
        }
        String clave="A123";
        switch(clave)
        {
            case "E345":System.out.println("Acceso denegado");
            break;
            case "A333":System.out.println("Acceso denegado");
            break;
            case "A123":System.out.println("Acceso denegado");
            break;
            default:System.out.println("No se reconoce el formato");
        }
        char letra='A';
        
        char letra2=(letra==65)?'A':'B' ;
        System.out.println(letra2);
        
       String cadena1="hola";
       String cadena2="hola";
       
       if(cadena1.equals(cadena2))//if(cadena1==cadena2)
       {
           System.out.println("Iguales");
       }else{
           System.out.println("Distintos");
       }
       
       //repetitivas
        for (int i=0; i<5; i++) {
            System.out.println("Vuelta:"+i);
            
        }
        
        int i=6;
        while(i>0)
        {
            System.out.println(i);
            i--;
        }
        i=6;
        do{
            System.out.println(i);
            i--;
        }while(i>0);
    }
}
