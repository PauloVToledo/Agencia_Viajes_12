package org.example;

import com.opencsv.CSVWriter;

import java.io.*;
public class GestorDatos {
    public static void readData(AgenciaViajes agencia, String path) {
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] data = line.split(",");
                agencia.getVendedor().add(new venta(eliminarComillas(data[0]),
                        Integer.parseInt(eliminarComillas(data[1]))));
            }
        } catch (IOException e) {
            System.out.println("El archivo no se ha encontrado.");
        }
    }
    public static void writeData(Vendedor empresa, String path) {
        File file = new File(path);
        try {
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            for(venta venta : empresa.getVenta()) {
                String[] data = {venta.getNombre(),String.valueOf(venta.getEdad()) };
                writer.writeNext(data);
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String eliminarComillas(String string) {
        return string.replaceAll("\"", "");
    }
}