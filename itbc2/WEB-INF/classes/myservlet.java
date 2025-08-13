import javax.servlet.http.*;
import java.io.*;

public class myservlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;

        PrintWriter out = res.getWriter();
        out.println("Result:" + k);
    }
}
