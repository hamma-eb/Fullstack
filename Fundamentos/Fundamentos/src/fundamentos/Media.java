/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos;

/**
 *
 * @author tarde
 */
public class Media {

    /*
    calcula la media de las notas de 3 alumnos teniendo en cuenta
    que se han de meter números y no cadenas de caracteres.
    Nota: Cuando metes una cadena de texto en un tipo numérico
    se produce una NumberFormatException.
    convertir de String a int:
    Integer.parseInt(cadena);
     */
    public static void main(String[] args) {

        int notas[];
        float media = 0.0F;
        notas = new int[3];
        int contador = 0;

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            try {
                while (contador < notas.length) {
                    notas[contador] = Integer.parseInt(Leer.porTeclado());
                    contador++;

                }
                sum = sum + notas[i];
            } catch (Exception e) {
                System.out.println("Error");
            } finally {
                while (contador < notas.length) {
                    notas[contador] = Integer.parseInt(Leer.porTeclado());
                    contador++;
                }
                System.out.println("erroorrr");
            }

        }
        
        media = sum / notas.length;
        System.out.println(media);
    }
}
