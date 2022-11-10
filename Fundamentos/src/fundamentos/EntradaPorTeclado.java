
package fundamentos;

import java.util.Scanner;

public class EntradaPorTeclado {

    public static void main(String[] args) {

        System.out.println("Introduce un texto:");
        String texto = Leer.porTeclado();
        System.out.println("Introduce un texto");
        System.out.println("El texto introducio es:\n" 
                + texto);

    }
}
