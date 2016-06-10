package curry;

import com.google.appengine.api.users.*;
import com.google.appengine.api.users.UserServiceFactory;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsersServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws IOException {
	  resp.setCharacterEncoding("UTF-8");
	  resp.setContentType("text/plain");
    UserService userService = UserServiceFactory.getUserService();

    String thisUrl = req.getRequestURI();

    resp.setContentType("text/html");
    if (req.getUserPrincipal() != null) {
      resp.getWriter().println("<center>"+"<body bgcolor=\"#ffd700\">"+"<h1><p><font face=\"メイリオ\" color=\"#6a1917\">"+"ようこそ、 "
          + req.getUserPrincipal().getName()
          + "さん!  </font></p></h1>"+"<br>"
          +"<a href=\"/checkorder\">注文画面へ</a>"+"<br>"+
          "<a href=\"/showOrder.html\">お店の人はこちらへ</a>"+
     
          "</body>"+"</center>");
    	
    	
    } else {
      resp.getWriter().println("<p>Please <a href=\""
            + userService.createLoginURL(thisUrl)
            + "\">sign in</a>.</p>");
    }
  }
}