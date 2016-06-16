package curry;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings({ "serial", "unused" })
public class LogoutServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;
	  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		  response.setCharacterEncoding("UTF-8");
		  response.setContentType("text/plain");
		   UserService userService = UserServiceFactory.getUserService();
		    String thisUrl = request.getRequestURI();
		    response.setContentType("text/html");
		    if (request.getUserPrincipal() != null) {
		    response.getWriter().println("<center>"+"<body bgcolor=\"#ffd700\">"+"<h2><p><font face=\"メイリオ\" color=\"#6a1917\">"+"注文完了しました。"
		    +"<br>"+"指定された配達時間にあつあつのカレーをお届けします。"+"<br>"+"またのご利用をお待ちしています。"+"</h2>"+"<br>"
		           + "<a href=\""
		           + userService.createLogoutURL(thisUrl)
		           + "\">ログアウト</a></p>"+"</body>"+"</center>");
		    }else{
		    	/*response.getWriter().println("<p>Please <a href=\""
		            + userService.createLoginURL(thisUrl)
		            + "\">sign in</a>.</p>");*/
		    	response.sendRedirect("/index.html");
		    }
		  }

}
