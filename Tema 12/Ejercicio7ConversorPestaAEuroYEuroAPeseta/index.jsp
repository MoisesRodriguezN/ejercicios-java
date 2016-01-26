<%-- 
    Document   : index
    Created on : 25-ene-2016, 19:07:59
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor de monedas</title>
    </head>
    <body>
        <h2>Conversor Pesetas a Euros y Euros a Pesetas</h2>
        <form action="conversor.jsp" method="post">
   
            <table>
                
                <tr>
                    <td style="text-align: center">
                    <img src="billete1.jpg" height="80" width="130" >
                    </td>
                    
                    <td style="text-align: center">
                        <img src="billete1.jpg" height="80" width="130" >
                    </td>
                </tr>
                
                 <tr>
               
                    <td>
                        <label for="inputcantidad">Introduce la cantidad</label> 
                    </td>
                    <td>
                        <input type="number" min="0" step="0.01" id="inputcantidad" name="cantidad">
                    </td>
                    
                </tr>
                
                <tr>
               
                    <td>
                        <input type="radio" name="conversor" value="opcion1">Pesetas a euros
                    </td>
                    
                </tr>
                
                <tr>
                    
                    <td>
                        <input type="radio"  name="conversor" value="opcion2">Euros a pesetas
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
