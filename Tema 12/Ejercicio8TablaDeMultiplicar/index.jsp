<%-- 
    Document   : index
    Created on : 26-ene-2016, 9:15:05
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla de multiplicar</title>
    </head>
    <body>
        <form action="tablamultiplicar.jsp" method="post">
            <table>
                <tr>
                    <td>
                        <label for="inputnumero">Introduce el número del que quieres sacar la tabla</label> 
                    </td>

                    <td>
                        <input type="number" min="0" id="inputnumero" name="numero" 
                               autofocus="">
                    </td>
                </tr>

                <tr>
                    <td>

                    </td>
                    <td>
                        <input name="Enviar" type="submit" value="Enviar">
                    </td>
                    </tr>
            </table>
        </form>
    </body>
</html>
