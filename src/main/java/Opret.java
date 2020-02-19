import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@WebServlet(name = "Opret", urlPatterns = {"/Opret"})
public class Opret extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String nytNavn = request.getParameter("navn");

        ServletContext servletContext = getServletContext();

        if( ((Set<String>)servletContext.getAttribute("brugere")).contains(nytNavn) ) {

            request.setAttribute("besked","brugeren findes allerede, find et ny navn");

            request.getRequestDispatcher("WEB-INF/OpretBruger.jsp").forward(request,response);
        }
        else {

            ((Set<String>)servletContext.getAttribute("brugere")).add(nytNavn);

            request.setAttribute("besked", "du er nu oprettet og er klar til at logge ind");

            request.getRequestDispatcher("index.jsp").forward(request,response);




        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
