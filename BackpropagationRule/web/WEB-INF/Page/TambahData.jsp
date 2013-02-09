<%-- 
    Document   : TambahData
    Created on : Feb 6, 2013, 11:54:14 PM
    Author     : DanyCandra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Masukan Data</h1>
        <form method="POST" action="controller?action=SimpanDataBaru.dnx">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Nilai Raport</td>
                        <td><input type="text" name="raport" value="" /></td>
                    </tr>
                    <tr>
                        <td>Nilai UN</td>
                        <td><input type="text" name="un" value="" /></td>
                    </tr>
                    <tr>
                        <td>Nilai Wawancara</td>
                        <td><input type="text" name="wawancara" value="" /></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Simpan" />
        </form>

    </body>
</html>
