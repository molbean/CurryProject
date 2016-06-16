package curry;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
 
import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings({ "serial", "unused" })
public class CheckOrderServlet extends HttpServlet {
	public String hour, minute;
    public ArrayList<OrderData> orderList = new ArrayList<OrderData>();
    public ArrayList<String> pid = new ArrayList<String>();//注文したメニューを入れる配列
    public ArrayList<String> q = new ArrayList<String>();//注文した数

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	response.sendRedirect("/select.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        Curry curry = new Curry();
        
    	int sum=0;
        String[] product = request.getParameterValues("product");//チェックボックスー注文されたメニュー名が入ってる
        String[] quantity = new String[11];//何人前
        hour = request.getParameter("hour");
        minute = request.getParameter("minute");
        
        
        for (int i = 0; i < 11; i++) {
            if (!"".equals(request.getParameter("q"+i)) || !"0".equals(request.getParameter("q"+i))) {
                quantity[i] = request.getParameter("q"+i);
            }
        }
        int count = 0;
        q.clear();
        orderList.clear();
        //String配列qに何人前か入れている
        for (int i = 0; i < 11; i++) {
            if (quantity[i] != "") {
                count++;
                q.add(quantity[i]);
            }
        }
        ArrayList<Integer> q2 = new ArrayList<Integer>();
        for(int i = 0;i<count;i++){
        	q2.add(Integer.parseInt(q.get(i)));
        }
        ArrayList<String> p = new ArrayList<String>();
        for(int i = 0; i<product.length; i++){
        	p.add(product[i]);
        }
        for(int i = 0; i<q2.size(); i++){

        	if(product[i].equals("チキンカレー")){
        		sum=sum+648*q2.get(i);
        	}else if(product[i].equals("ビーフカレー")){
        		sum=sum+648*q2.get(i);
        	}else if(product[i].equals("ポークカレー")){
            		sum=sum+648*q2.get(i);
        	}else if(product[i].equals("カツカレー")){
        		sum=sum+756*q2.get(i);
        	}else if(product[i].equals("シーフードカレー")){
        		sum=sum+756*q2.get(i);
        	}else if(product[i].equals("キーマカレー")){
        		sum=sum+648*q2.get(i);
        	}else if(product[i].equals("ホウレンソウカレー")){
        		sum=sum+756*q2.get(i);
        	}else if(product[i].equals("ベーコンスープカレー")){
        		sum=sum+864*q2.get(i);
        	}else if(product[i].equals("ハンバーグカレー")){
        		sum=sum+864*q2.get(i);
        	}else if(product[i].equals("チキンナゲット")){
        		sum=sum+432*q2.get(i);
        	}else if(product[i].equals("シーザーサラダ")){
        		sum=sum+324*q2.get(i);
        		
        	}

            		
        }
        //Curryクラスにセット
        curry.setProduct(p);
        curry.setQ(q2);
        curry.setHour(Integer.parseInt(hour));
        curry.setMinute(Integer.parseInt(minute));
        curry.setSum(sum);
        
        HttpSession session = request.getSession();
        session.setAttribute("curry", curry);
        	
		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i] + q.get(i) + hour+":"+minute);
			pid.add(product[i]);
			Date date = Calendar.getInstance().getTime();
			OrderData data = new OrderData(product[i], q.get(i), hour + ":" + minute, date);
			PersistenceManagerFactory factory = PMF.get();
			PersistenceManager manager = factory.getPersistenceManager();

			try {
				manager.makePersistent(data);
			} finally {
				manager.close();
			}
		}

		/*
		 * for (int i = 0; i < 11; i++) { String[] productId =
		 * request.getParameterValues("product"); String quantity =
		 * request.getParameter("q" + i); String deliverytime =
		 * request.getParameter("hour"); Date date =
		 * Calendar.getInstance().getTime(); OrderData data = new
		 * OrderData(productId[i], quantity, deliverytime, date);
		 * 
		 * PersistenceManagerFactory factory = PMF.get(); PersistenceManager
		 * manager = factory.getPersistenceManager();
		 * 
		 * try { manager.makePersistent(data); } finally { manager.close(); } }
		 */
		response.sendRedirect("/check.jsp");
    }
}
