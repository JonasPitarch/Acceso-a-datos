package Ej1;
import java.io.*;
import java.util.ArrayList;

class Notas implements Serializable{
    private String nombre;
    private int nota;
    public Notas(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public int getNota() {
        return nota;
    }
}
public class Ej1 {
    public static void main(String[] args) {
        ArrayList<Notas> notas = new ArrayList();
        notas.add(new Notas("Programacion", 5));
        notas.add(new Notas("Base de datos", 5));
        notas.add(new Notas("Ingles", 6));
        notas.add(new Notas("Lenguaje de Marcas", 6));
        notas.add(new Notas("Sistemas operativos", 8));
        notas.add(new Notas("Entornos de Desarrollo", 7));
        String filename="Notas.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(notas);
            oos.close();
            fos.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream f = new FileInputStream(filename);
            ObjectInputStream l = new ObjectInputStream(f);
            ArrayList<Notas> object = (ArrayList<Notas>) l.readObject();
            l.close();
            f.close();
            int sum = 0;
            for (Notas nota : object) {
                sum += nota.getNota();
            }
            int media =  sum / object.size();
            System.out.println("La media del curso es: " + media);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}