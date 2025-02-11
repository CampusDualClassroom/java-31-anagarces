package com.campusdual.classroom;

import java.io.*;

public class Exercise31 {

    public static void main(String[] args) {

        fileReader(new File("src/main/resources/lorem.txt"));

    }


    //metodo estatico para leer ficheros
    public static void fileReader(File fileSource) {

        try (FileReader fr = new FileReader(fileSource);
             BufferedReader br = new BufferedReader(fr)) {

            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado. ");
            ex.printStackTrace();
        } catch (IOException ex2) {
            System.out.println("Fallo al leer lineas del fichero");
            ex2.printStackTrace();
        }

    }

}

