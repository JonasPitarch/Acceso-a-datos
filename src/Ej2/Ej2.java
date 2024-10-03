package Ej2;
import java.io.*;
import java.util.HashMap;

public class Ej2 {
    public static void main(String[] args) {
        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Programacion", 5.0);
        notas.put("Ingles", 6.0);
        notas.put("Lenguaje de marcas", 6.0);
        notas.put("Entornos de Dessarrollo", 7.0);
        notas.put("Sistemas Operativos", 8.0);
        notas.put("Base de datos", 5.0);

        System.out.printf("***Notes en el HashMap\n");

        String file = "Notas2.txt";
        try (FileOutputStream f = new FileOutputStream(file);
             ObjectOutputStream of = new ObjectOutputStream(f)) {
            of.writeObject(notas);
            System.out.println("*** Serializamos el HashMap ***");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (FileInputStream fil = new FileInputStream(file);
             ObjectInputStream fl1 = new ObjectInputStream(fil)) {
            HashMap<String, Double> nota = (HashMap<String, Double>) fl1.readObject();
            System.out.println("*** Deserialitzamos el HashMap ***");

            System.out.println("*** Calculamos la Media del curso ****");

            double suma = 0;

            for (double not : nota.values()) {
                suma += not;
            }

            double media = suma / nota.size();
            System.out.println("La media es: " + media);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("*** Fin ***");
        }
    }
}
