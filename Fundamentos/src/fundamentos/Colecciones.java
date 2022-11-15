package fundamentos;

import java.util.ArrayList;
import java.util.Vector;

public class Colecciones {

    public static void main(String[] args) {

        Vector v;
        //creación
        v = new Vector();
        //añadir elementos
        Animal tiburon = new Animal("Anfibio", "Salvaje", 0);
        v.add(tiburon);
        Animal perro = new Animal("Mamífero", "Doméstico", 4);
        v.add(perro);

        //extraer el objeto del vector
        for (int i = 0; i < v.size(); i++) {
            Animal a = (Animal) v.elementAt(i);
            System.out.println(a.toString());
        }
        //lo mismo con arraylist**************

        //creación
        ArrayList<Animal> animales;
        animales = new ArrayList();
        //añadir elementos
        Animal tiburon2 = new Animal("Anfibio", "Salvaje", 0);
        animales.add(tiburon2);
        Animal perro2 = new Animal("Mamífero", "Doméstico", 4);
        animales.add(perro);

        //extraer el objeto del vector
        for (int i = 0; i < animales.size(); i++) {
            Animal a = (Animal) animales.get(i);
            System.out.println(a.toString());
        }
        
    }//main
}
