<%-- 
    Document   : index
    Created on : 28-ene-2016, 8:27:51
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pirámid con imágenes</title>
    </head>
    <body>
        <form action="piramide.jsp" method="post">
            <table>
                <tr>
                 
                    <td>
                        <label for="inputnumero">Introduce la altura de la pirámide</label> 
                    </td>

                    <td>
                        <input type="number" min="0" id="inputnumero" name="altura" 
                               autofocus="">
                    </td>

                </tr>
                
                <tr>
                    <td>
                        <input name="Enviar" type="submit" value="Enviar">
                    </td>
                </tr>
            </table>
        </form>

    </body>
</html>
