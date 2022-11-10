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
public class Variables {
    
    int numero;//de instancia
    static String nombre;// de clase
    
    public static void main(String[] args) {
        //de instancia
        Variables v = new Variables();
         v.numero=5;
        
        Variables.nombre="Java es fácil";
        
        float PI=3.14F;//F ó f
        System.out.println(PI);
        System.out.println(v.numero);
        System.out.println("Nombre:"+ Variables.nombre);
        
        
        /*en función del almacenamiento.
        Tipos primitivos de variables
        
        NUMERICAS:
            ENTERAS     byte,short,int,long
            REALES:     float,double
        CARACTER        char
        BOOLEANAS       boolean
        
        En java los String son objetos
         (clase String)
        
         En función de la posición dentro de la clase.
        
        1. Variables de Instancia: Son aquellas que van dentro de la clase fuera de los metodos, no hace falta inicializarlas y para poder acceder a ellas es necesario crear un objeto. se inicializan solas. 
        2. Variables "De clase": Son aquellas que van dentro de la clase fuera de los metodos, no hace falta inicializarlas, pero para acceder a ellas no es necesario crear un objeto
        3. Variables Locales: son aquellas que van dentro de los metodos, y hay que inicializarlas antes de usarlas
        
        Regla número 1:Para poder accceder a cualquier propiedad o metodo de una clase hace falta un objeto siempre.
       
        */
    }//main
}//
