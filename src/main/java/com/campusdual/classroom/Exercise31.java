package com.campusdual.classroom;

import java.io.*;

public class Exercise31 {

    public static void main(String[] args) {

        fileReader(new File("src/main/resources/lorem.txt"));

    }

    //metodo estatico para leer ficheros
    public static void fileReader(File fileSource) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileSource))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("Fichero no encontrado. ");
            fnf.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("Fallo al leer lineas del fichero");
            ioe.printStackTrace();
        }

    }

}

