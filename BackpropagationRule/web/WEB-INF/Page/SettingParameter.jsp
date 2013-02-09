<%-- 
    Document   : Setting
    Created on : Feb 6, 2013, 8:38:27 AM
    Author     : DanyCandra
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pengaturan Parameter Pembelajaran</h1>
        <form method="POST" action="controller?action=UpdateParameter.dnx">
            <table border="0">
                <tbody>
                    <tr>
                        <td>mak epoh :</td>
                        <td><input type="text" name="epoh" value="${parameter.makEpoh}" /></td>
                    </tr>
                    <tr>
                        <td>Target Error :</td>
                        <td><input type="text" name="targetError" value="${parameter.targetError}" /></td>
                    </tr>
                    <tr>
                        <td>learning rate :</td>
                        <td><input type="text" name="learningRate" value="${parameter.learningRate}" /></td>
                    </tr>
                </tbody>
            </table>
            <br/>
            <input type="submit" value="Simpan" />
        </form>
    </body>
</html>
