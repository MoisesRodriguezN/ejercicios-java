<%-- 
    Document   : index
    Created on : 25-ene-2016, 12:21:37
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor Euros a Pesetas </title>
    </head>
    <body>
        <form action="conversor.jsp" method="post">
            <table>
                <tr>
                    <td>
                        <label for="inputeuros">Euros</label>
                    </td>
                    <td>
                        <input type="number" min="0" step="0.01" id="inputeuros" name="euros">
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
