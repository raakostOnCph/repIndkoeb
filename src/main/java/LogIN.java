import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@WebServlet(name = "LogIN", urlPatterns ={"/LogIN"} )
public class LogIN extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession session = request.getSession();
        ServletContext  servletContext = getServletContext();

        if(servletContext.getAttribute("brugere") == null) {

            Set<String> brugere = new HashSet<>();
            servletContext.setAttribute("brugere",brugere);

        }

        String navn = request.getParameter("navn");

        if ( ((Set<String>) servletContext.getAttribute("brugere") ).contains(navn) ){


            //todo brugeren findes allerede rede , og vi skal gå til en indkøbslistesiden.

        }
            else {

                //todo brugeren findes ikke og skal oprettes dvs. vi skal gå til opret brugere side.



        }










    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
