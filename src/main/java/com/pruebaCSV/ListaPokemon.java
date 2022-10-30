package com.pruebaCSV;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;

public class ListaPokemon extends ArrayList<Pokemon> {

    public ListaPokemon(String nombreArchivo){
        try {
            CSVReader csvReader = new CSVReader( new FileReader(nombreArchivo));
            String[] fila;
            fila = csvReader.readNext(); //leo una vez para quitar la fila de los títulos del csv
            while((fila = csvReader.readNext()) != null){
                Pokemon miPokemon = new Pokemon(fila);
                this.add(miPokemon); //añado el pokemon que he creado y rellenado a la lista
            }
            csvReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void listaTodos(){
        //for (Pokemon p: this) {
        //    System.out.println(p.getName());
        //}
        this.forEach((p) -> System.out.println(p.getName()));
    }

}
