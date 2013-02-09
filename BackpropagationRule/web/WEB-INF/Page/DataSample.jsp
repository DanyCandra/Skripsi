<%-- 
    Document   : DataSample
    Created on : Feb 8, 2013, 9:27:15 PM
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
        <h1>Data</h1>
        <a href="controller?action=SimulasiDataSample.dnx">Simulasikan</a><br/><br/>
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
                    <td>Kualifikasi</td>
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
                        <c:if test="${rule.hasil=='Tinggi'}">
                            <td><strong>${rule.hasil}</strong></td>
                        </c:if>
                        <c:if test="${rule.hasil!='Tinggi'}">
                            <td>${rule.hasil}</td>
                        </c:if>
                        <c:set var="x" value="${x+1}"/>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
