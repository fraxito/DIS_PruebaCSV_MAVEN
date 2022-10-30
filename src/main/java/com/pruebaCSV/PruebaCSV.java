package com.pruebaCSV;
/*
   Ejemplo muy sencillo de acceso a un archivo .csv desde java
   Utiliza Maven.
   Y ahora trabaja con los pokemon en una clase nueva
 */

import java.util.Scanner;

public class PruebaCSV {
    /**
     * @author Jorge Cisneros
     */

    public static void main(String[] args) {
       //LectorCSV miLector = new LectorCSV();
       //miLector.leeCSV("./src/main/resources/datos/pokemon.csv");
       ListaPokemon miLista = new ListaPokemon("./src/main/resources/datos/pokemon.csv");

        Scanner sc = new Scanner(System.in);
        System.out.println("¿que quieres hacer con los pokémon?");
        while (sc.hasNext()) {
            int select = 0;
            if (sc.hasNextInt()) {
                select = sc.nextInt();
            }
            switch (select) {
                case 1:;break;
                case 2:;break;
                case 3:;break;
                case 4:;break;
                case 5:miLista.listaTodos();break;
                default:
            }
        }

    }


}
