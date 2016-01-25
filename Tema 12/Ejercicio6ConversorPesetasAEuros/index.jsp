<%-- 
    Document   : index
    Created on : 25-ene-2016, 18:01:58
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor Pesetas a Euros</title>
    </head>
    <body>
        <h2>Conversor de pesetas a euros</h2>
        <form action="conversor.jsp" method="post">
            <table>
                <tr>
                    <td>
                        <label for="inputpesetas">Pesetas</label>
                    </td>
                    <td>
                        <input type="number" min="0" step="0.01" id="inputpesetas" name="pesetas">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <input name="Restablecer" type="reset" value="Restablecer">
                    </td>
                    <td>
                         <input name="Enviar" type="submit" value="Enviar">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
