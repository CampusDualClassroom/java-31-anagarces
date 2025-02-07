package com.campusdual.classroom;

import java.io.*;

public class Exercise31 {

    public static void main(String[] args) {

        fileReader(new File("src/main/resources/lorem.txt"));

    }


    //metodo estatico para leer ficheros
    public static void fileReader(File fileSource) {
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(fileSource);
             br = new BufferedReader(fr);
            String linea = "";

            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException ex){
            System.out.println("Fichero no encontrado. ");
            ex.printStackTrace();
        } catch (IOException ex2){
            System.out.println("Fallo al leer lineas del fichero");
            ex2.printStackTrace();
        } finally {
            try{
                if(fr != null || br != null){
                    fr.close();
                    br.close();
                }
            } catch (IOException ex3){
                System.out.println("No se ha podido cerrar algun flujo");
                ex3.printStackTrace();
            }
        }



    }

}
