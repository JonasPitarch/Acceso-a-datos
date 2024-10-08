package HTML;

import java.io.*;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el titulo de la web");
        String titulo=scanner.nextLine();
        System.out.println("Dame un elemento");
        String texto=scanner.nextLine();
        System.out.println("Dame el segundo elemento");
        String texto2=scanner.nextLine();
        System.out.println("Dame el tercer elemento");
        String texto3=scanner.nextLine();
        System.out.println("Dime un pequeño párrafo");
        String texto4=scanner.nextLine();
        try (PrintWriter pw = new PrintWriter("archivo.html", "UTF-8")) {
            BufferedWriter bw = new BufferedWriter(pw);
            pw.write("<html>");
            pw.write("<head>");
            pw.write("<title>"+ titulo +"</title>");
            pw.write("</head>");
            pw.write("<body>");
            pw.write("<h1>Web de Jonás</h1>");
            pw.write("<p>"+texto4+"</p>");
            pw.write("<ul>");
            pw.write("<li>"+texto+"</li>");
            pw.write("<li>"+texto2+"</li>");
            pw.write("<li>"+texto3+"</li>");
            pw.write("</ul>");
            pw.write("</body>");
            pw.write("</html>");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
