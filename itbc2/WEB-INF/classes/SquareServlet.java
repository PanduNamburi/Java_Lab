import javax.servlet.http.*;
import java.io.*;

public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int a = Integer.parseInt(req.getParameter("a"));
        int a1 = a * a;
        PrintWriter out = res.getWriter();
        out.println("Square:" + a1);
    }
}


