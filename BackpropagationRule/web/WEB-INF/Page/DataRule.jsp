<%-- 
    Document   : DataRule
    Created on : Feb 8, 2013, 7:51:28 PM
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
        <h1>Data Rule</h1><br/>
        <a href="controller?action=KenaliPolaRule.dnx">Kenali Pola & Simulasikan</a><br/>
        <a href="controller?action=HasilPelatihan.dnx" target="_blank">Hasil Pelatihan, Bobot dan Bias</a><br/>
        <h3>Rule</h3>
        <table border="1">
            <tbody>
                <tr>
                    <td>No</td>
                    <td>Rule Raport</td>
                    <td>Rule UN</td>
                    <td>Rule Wawancara</td>
                    <td>Target</td>
                    <td>Output</td>
                    <td>Hasil</td>
                </tr>
                <c:set var="x" value="${1}"/>
                <c:forEach items="${rule}" var="rule">
                    <tr>
                        <td>${x}</td>
                        <td>${rule.ruleRaport}</td>
                        <td>${rule.ruleUn}</td>
                        <td>${rule.ruleWawancara}</td>
                        <td>${rule.target}</td>
                        <td>${rule.output}</td>
                        <td>${rule.hasil}</td>
                    </tr>
                    <c:set var="x" value="${x+1}"/>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
