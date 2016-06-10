package curry;

import java.io.*;
import java.util.*;
 
import javax.jdo.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class OrderCurryGaeServlet extends HttpServlet {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        String param1 = req.getParameter("id");
        PrintWriter out = resp.getWriter();
        List<OrderData> list = null;
        if (param1 == null || param1 ==""){
            String query = "select from " + OrderData.class.getName();
            try {
                list = (List<OrderData>)manager.newQuery(query).execute();
            } catch(JDOObjectNotFoundException e){}
        } else {
            try {
                OrderData data = (OrderData)manager.getObjectById(OrderData.class,Long.parseLong(param1));
                list = new ArrayList();
                list.add(data);
            } catch(JDOObjectNotFoundException e){}
        }
        String res = "[";
        if (list != null){
            for(OrderData data:list){
                res += "{id:" + data.getId() + ",product:'" + data.getProduct() + "',quantity:'" +
                    data.getQuantity() + "',deliverytime:'" + data.getDeliverytime() +
                    "',date:'" + data.getDate() + "'},";
            }
        }
        res += "]";
        out.println(res);
        manager.close();
    }
}
