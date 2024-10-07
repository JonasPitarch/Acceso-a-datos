package ExpresionRegular;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Ej1 {

        public static void main(String[] args) {
            String regex = "\\d{3}-\\d{3}-\\d{3}";
            Pattern pattern = Pattern.compile(regex);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número en formato XXX-XXX-XXX: ");
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println("Numero introducido correctamente");
            } else {
                System.out.println("Error al introducir el numero de teléfono resiva si colocaste los -" +
                        " o a introducido un caracter Alfabético");
            }
        }
}