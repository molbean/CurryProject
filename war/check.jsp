<%@page import="curry.Curry"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//リクエストスコープに保存されたインスタンス取得
    Curry curry = (Curry) session.getAttribute("curry"); 
%>
<%! ArrayList<String> menu = new ArrayList<String>(); %>
<% menu = curry.getProduct();%>
<%! ArrayList<Integer> quantity = new ArrayList<Integer>();%>
<% quantity = curry.getQ();%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GoGo壱番カレー</title>
    </head>
       <body bgcolor ="#ffd700">
       <center>
        <font face="メイリオ" color ="#6a1917"> 
        <h1>注文確認</h1>
	<h2>
        <table>
	<% for(int i=0;i<menu.size();i++){%>
            <tr><td><%=menu.get(i)%></td><td>:<%=quantity.get(i)%>人前</td></tr>
	    <%}%>
	    </table>
	    </h2>
	  
       <h1>配達時間</h1>
       <p><h2><%=curry.getHour()%>:<%=curry.getMinute()%></h2></p><br>
      
        <a href="/logout">注文</a>&nbsp;<a href="/checkorder">戻る</a>
        </font>
	</center>
    </body>
</html>
