<%@ page language="java" contentType="text/html; charset=utf-8"
        pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GoGo壱番屋</title>
    </head>
    <body bgcolor="#ffd700">
    <center>
        <br>
        <h3><font face="メイリオ" color="#6a1917">STEP1.商品を選択する</font></h3>
        <form action="/checkorder" method="post">

            <table border="5" bordercolor="#cd853f" width="400" height ="200" rules="none">    

                <tr><th align="left"><input type="checkbox" value="チキンカレー" name="product">チキンカレー(￥648)</th><th><input type="text" style="width:20px" name="q0">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="ビーフカレー" name="product">ビーフカレー(￥648)</th><th><input type="text" style="width:20px" name="q1">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="ポークカレー" name="product">ポークカレー(￥648)</th><th><input type="text" style="width:20px" name="q2">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="カツカレー" name="product">カツカレー(￥756)</th><th><input type="text" style="width:20px" name="q3">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="シーフードカレー" name="product">シーフードカレー(￥756)</th><th><input type="text" style="width:20px" name="q4">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="キーマカレー" name="product">キーマカレー(￥648)</th><th><input type="text" style="width:20px" name="q5">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="ホウレンソウカレー" name="product">ホウレンソウカレー(￥756)</th><th><input type="text" style="width:20px" name="q6">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="ベーコンスープカレー" name="product">ベーコンスープカレー(￥864)</th><th><input type="text" style="width:20px" name="q7">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="ハンバーグカレー" name="product">ハンバーグカレー(￥864)</th><th><input type="text" style="width:20px" name="q8">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="チキンナゲット" name="product">チキンナゲット(￥432)</th><th><input type="text" style="width:20px" name="q9">人前</th></tr>
                <tr><th align="left"><input type="checkbox" value="シーザーサラダ" name="product">シーザーサラダ(￥324)</th><th><input type="text" style="width:20px" name="q10">人前</th></tr>
            </table>
            <br>
            <h3><font face="メイリオ" color="#6a1917">STEP2.配達時間を指定する</font</h3><br>
            <input type="text"  style="width: 20px" name="hour">：<input type="text" style="width: 20px" name="minute">
            <br><br>   
            <input type="submit" value="送信">  <input type="reset" value="リセット">
            
        </form>
    </center>
</body>
</html>