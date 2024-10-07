package ExpresionRegular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabrasofensiva = {"datil","imbecil","abobat", "inutil"};
        System.out.println("Dime una frase que no sea ofensiva");
        String frase = scanner.nextLine();
        for (String palabra : palabrasofensiva) {
            Pattern pattern = Pattern.compile(palabra);
            Matcher matcher = pattern.matcher(frase);
            frase = matcher.replaceAll("***");
        }
        System.out.println(frase);
    }
}