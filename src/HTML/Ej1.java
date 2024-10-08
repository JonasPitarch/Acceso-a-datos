package HTML;

import java.io.PrintWriter;

public class Ej1 {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("archivo.html", "UTF-8")) {

            pw.println("<html>");
            pw.println("<head>");
            pw.write("<title> Mi WEB </title>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<h1>Web de Jonás</h1>");
            pw.println("<p>Esta es una línea de párrafo de html</p>");
            pw.println("<ul>");
            pw.println("<li>Elemento1</li>");
            pw.println("<li>Elemento2</li>");
            pw.println("<li>Elemento3</li>");
            pw.println("</ul>");
            pw.println("</body>");
            pw.println("</html>");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
