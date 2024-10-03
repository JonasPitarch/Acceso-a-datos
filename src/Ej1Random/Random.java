package Ej1Random;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) throws IOException {
        RandomAccessFile fitxer = new RandomAccessFile("dades.txt", "rw");

        // Escribir valores iniciales en el archivo
        fitxer.writeDouble(5);
        fitxer.writeDouble(10);
        fitxer.writeDouble(20);
        fitxer.writeDouble(15);
        fitxer.writeDouble(30);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número a reemplazar: ");
        double numberToReplace = scanner.nextDouble();

        System.out.print("Inserta el nuevo valor: ");
        double newValue = scanner.nextDouble();

        long fileSize = fitxer.length();


        for (long i = 0; i < fileSize; i += 8) {
            fitxer.seek(i);
            double currentValue = fitxer.readDouble();


            if (currentValue == numberToReplace) {
                fitxer.seek(i);
                fitxer.writeDouble(newValue);
            }
        }


        fitxer.seek(0);
        System.out.println("Valores actualizados:");
        for (long i = 0; i < fileSize; i += 8) {
            fitxer.seek(i);
            double value = fitxer.readDouble();
            System.out.println("Posición " + i + ": " + value);
        }

        fitxer.close();
    }
}
