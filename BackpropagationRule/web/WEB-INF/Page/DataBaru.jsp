<%-- 
    Document   : DataBaru
    Created on : Feb 6, 2013, 11:52:19 PM
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
        <h1>Uji coba data baru</h1><br/>
        <a href="controller?action=TambahData.dnx">Tambah Data</a>
        
        <h3>Data</h3>
        <table border="1">
            <tbody>
                <tr>
                    <td>No</td>
                    <td>Nilai Raport</td>
                    <td>Nilai UN</td>
                    <td>Nilai Wawancara</td>
                    <td>Sigmoid Raport</td>
                    <td>Sigmoid UN</td>
                    <td>Sigmoid Wawancara</td>
                    <td>Output</td>
                    <td>Hasil</td>
                </tr>
                <c:set var="x" value="${1}"/>
                <c:forEach items="${rule}" var="rule">
                    <tr>
                        <td>${x}</td>
                        <td>${rule.nilaiRaport}</td>
                        <td>${rule.nilaiUN}</td>
                        <td>${rule.nilaiWawancara}</td>
                        <td>${rule.sigmoidRaport}</td>
                        <td>${rule.sigmoidUN}</td>
                        <td>${rule.sigmoidWawancara}</td>
                        <td>${rule.output}</td>
                        <td>${rule.hasil}</td>
                        <c:set var="x" value="${x+1}"/>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
