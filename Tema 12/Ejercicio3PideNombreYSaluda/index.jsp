<%-- 
    Document   : index
    Created on : 24-ene-2016, 9:39:32
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <form action="saludo.jsp" method="post">
            <table>
                <tr>
                    <td>
                        <label for="nom">Nombre:</label>
                    </td>
                    <td>
                        <input id="nom" name="nombre" type="text" size="25">
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
