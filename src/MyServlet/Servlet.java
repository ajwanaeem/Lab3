import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static javax.swing.DropMode.INSERT;

@WebServlet(name = "Servlet")
public class MyServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MyDBConnection db = new MyDBConnection();

        String data = request.getParameter("data");
        System.out.println(data);

        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        String title="ABCD";
        out.println("<HTML>");
        out.println("<body><h1>Students</h1>");
        out.println("<table><tr><th>Student");
        out.println("</th><th>link</th></tr>");
        out.println("<tr><td>Ajwa</td>Data:"+data+"</td></tr>");
        out.println("</table></body></html>");

        db.insertRecord("Ajwa", "Naeem", "abc");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
