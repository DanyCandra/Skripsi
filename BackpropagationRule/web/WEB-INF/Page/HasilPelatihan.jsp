<%-- 
    Document   : HasilPelatihan
    Created on : Feb 8, 2013, 9:16:05 PM
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
        <h1>Bobot dan Bias</h1>
        <table border="1">
            <tr>
                <td>
                    <h2>Bobot dan Bias Awal</h2>
                    <h3>Bobot Awal lapisan input ke lapisan tersembunyi</h3>
                    <table border="1">
                        <tr>
                            <td rowspan="2" width="50" >i/j</td>
                            <td colspan="4" class="style2"><div align="center">v<span class="style3">ij</span></td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>2</td>
                            <td>3</td>
                            <td>4</td>
                        </tr>
                        <c:forEach items="${bobotAwalInputHidden}" var="bAwIH">
                            <tr>
                                <td>${bAwIH.id}</td>
                                <td>${bAwIH.v1}</td>
                                <td>${bAwIH.v2}</td>
                                <td>${bAwIH.v3}</td>
                                <td>${bAwIH.v4}</td>
                            </tr>
                        </c:forEach>

                    </table>

                    <h3>Bias Awal Lapisan input ke hidden</h3>
                    <table width="200" border="1">
                        <tr>
                            <td colspan="4"><div align="center">v0j</div></td>
                        </tr>
                        <tr>
                            <td><div align="center">1</div></td>
                            <td><div align="center">2</div></td>
                            <td><div align="center">3</div></td>
                            <td><div align="center">4</div></td>
                        </tr>
                        <tr>
                            <c:forEach items="${biasAwalKeHidden}" var="bAwH">
                                <td>${bAwH.v01}</td>
                            </c:forEach>
                        </tr>
                    </table>


                    <h3>Bobot Awal lapisan tersembunyi ke lapisan output</h3>
                    <table border="1">
                        <tr>
                            <td rowspan="2" width="50" >i/j</td>
                            <td colspan="4" class="style2"><div align="center">w<span class="style3">ij</span></td>
                        </tr>
                        <tr>
                            <td>1</td>

                        </tr>
                        <c:forEach items="${bobotAwalHiddenOutput}" var="bAwHO">
                            <tr>
                                <td>${bAwHO.id}</td>
                                <td>${bAwHO.w1}</td>
                            </tr>
                        </c:forEach>

                    </table>

                    <h3>Bias Awal Lapisan tersembunyi ke lapisan output</h3>
                    <table  border="1">
                        <tr>
                            <td ><div align="center">w0j</div></td>
                        </tr>
                        <tr>
                            <td><div align="center">1</div></td>
                        </tr>
                        <tr>
                            <c:forEach items="${biasOutputAwal}" var="bAwO">
                                <td>${bAwO.w0}</td>
                            </c:forEach>
                        </tr>
                    </table>
                </td>
                <td>
                    <h2>Bobot dan Bias Akhir hasil pembelajaran </h2>
                    <h3>Bobot Akhir lapisan input ke lapisan tersembunyi</h3>
                    <table border="1">
                        <tr>
                            <td rowspan="2" width="50" >i/j</td>
                            <td colspan="4" class="style2"><div align="center">v<span class="style3">ij</span></td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>2</td>
                            <td>3</td>
                            <td>4</td>
                        </tr>
                        <c:forEach items="${bobotAkhirSigmoidInputHidden}" var="bAsIH">
                            <tr>
                                <td>${bAsIH.id}</td>
                                <td>${bAsIH.v1}</td>
                                <td>${bAsIH.v2}</td>
                                <td>${bAsIH.v3}</td>
                                <td>${bAsIH.v4}</td>
                            </tr>
                        </c:forEach>

                    </table>

                    <h3>Bias Akhir Lapisan input ke hidden</h3>
                    <table width="200" border="1">
                        <tr>
                            <td colspan="4"><div align="center">v0j</div></td>
                        </tr>
                        <tr>
                            <td><div align="center">1</div></td>
                            <td><div align="center">2</div></td>
                            <td><div align="center">3</div></td>
                            <td><div align="center">4</div></td>
                        </tr>
                        <tr>
                            <c:forEach items="${biasAkhirSigmoidKeHidden}" var="bAsH">
                                <td>${bAsH.v01}</td>
                            </c:forEach>
                        </tr>
                    </table>

                    <h3>Bobot Akhir lapisan tersembunyi ke lapisan output</h3>
                    <table border="1">
                        <tr>
                            <td rowspan="2" width="50" >i/j</td>
                            <td colspan="4" class="style2"><div align="center">w<span class="style3">ij</span></td>
                        </tr>
                        <tr>
                            <td>1</td>

                        </tr>
                        <c:forEach items="${bobotAkhirSigmoidHiddenOutput}" var="bAsHO">
                            <tr>
                                <td>${bAsHO.id}</td>
                                <td>${bAsHO.w1}</td>
                            </tr>
                        </c:forEach>

                    </table>

                    <h3>Bias Akhir Lapisan tersembunyi ke lapisan output</h3>
                    <table  border="1">
                        <tr>
                            <td ><div align="center">w0j</div></td>
                        </tr>
                        <tr>
                            <td><div align="center">1</div></td>
                        </tr>
                        <tr>
                            <c:forEach items="${biasOutputAkhirSigmoid}" var="bAsO">
                                <td>${bAsO.w0}</td>
                            </c:forEach>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>

                </td>
                <td>
                    <h1>Hasil MSE dan Iterasi</h1>
                    <table border="1">
                        <tbody>
                            <tr>
                                <td>Maksimum Epoh</td>
                                <td>Learning Rate</td>
                                <td>TargetError</td>
                                <td>Iterasi</td>
                                <td>mse</td>
                                <td>Tingkat Akurasi</td>
                            </tr>
                            <tr>
                                <td>${parameter.makEpoh}</td>
                                <td>${parameter.learningRate}</td>
                                <td>${parameter.targetError}</td>
                                <td>${parameter.iterasi}</td>
                                <td>${parameter.mse}</td>
                                <td>${parameter.akurasi} %</td>
                            </tr>

                        </tbody>
                    </table>
                </td>
           
            </tr>
        </table>
    </body>
</html>
