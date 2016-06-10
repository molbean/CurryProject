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
       <body bgcolor ="tomato">
        <font face="HG丸ｺﾞｼｯｸM-PRO" color ="cornsilk"> 
        <h1>注文確認</h1>
        <table>
	<% for(int i=0;i<menu.size();i++){%>
	
            <tr><td><%=menu.get(i)%></td><td>:<%=quantity.get(i)%>人前</td></tr>
	    <%}%>
       
        <a href="/order">注文</a>
        <a href="/checkorder">戻る</a>
        </font>
    </body>
</html>
