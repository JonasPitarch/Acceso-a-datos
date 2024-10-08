package HTML;

import java.io.PrintWriter;
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
            pw.println("<html>");
            pw.println("<head>");
            pw.write("<title>"+ titulo +"</title>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<h1>Web de Jonás</h1>");
            pw.println("<p>"+texto4+"</p>");
            pw.println("<ul>");
            pw.println("<li>"+texto+"</li>");
            pw.println("<li>"+texto2+"</li>");
            pw.println("<li>"+texto3+"</li>");
            pw.println("</ul>");
            pw.println("</body>");
            pw.println("</html>");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
