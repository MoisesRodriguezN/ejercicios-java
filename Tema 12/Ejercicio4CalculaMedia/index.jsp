<%-- 
    Document   : index
    Created on : 24-ene-2016, 9:58:53
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcula la media de 3 notas</title>
    </head>
    <body>
        <h3>Introduce las 3 notas</h3>
         <form action="media.jsp" method="post">
            <table>
                <tr>
                    <td>
                        <label for="inputnota1">Nota:</label>
                    </td>
                    <td>
                        <input type="number" min="0" max="10" step="0.01" id="inputnota1" name="nota1">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="inputnota2">Nota:</label>
                    </td>
                    <td>
                        <input type="number" min="0" max="10" step="0.01" id="inputnota2" name="nota2">
                    </td>
                    <td>
                </tr>
                <tr>
                    <td>
                        <label for="inputnota3">Nota:</label>
                    </td>
                    <td>
                        <input type="number" min="0" max="10" step="0.01" id="inputnota3" name="nota3">
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
          
    </body>
</html>
