package login.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginComplete")
public class LoginComplete extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public LoginComplete() {
        super();
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
  HttpSession session = request.getSession();
  String loginID = (String)session.getAttribute("lid");
  
  response.setCharacterEncoding("UTF-8");
  response.setContentType("text/html charset=UTF-8");
	PrintWriter out = response.getWriter();

  if (loginID = null || loginID.equals("")){// the one can't login 
  out.print("<h1>login</h1>");
  out.print("<a href = 'login/27login.html'>get straight to login</a>");
  } else { // who successed to login 
    response.addHeader("refresh" + "5;url=http://localhost:8080/0624_servlet/svl/13index.html");
    out.print("<h1> + loginID + "welcome here </h1>");
  }
  }//doGet
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}//doPost

}//class
