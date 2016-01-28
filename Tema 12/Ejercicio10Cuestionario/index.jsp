<%-- 
    Document   : index
    Created on : 28-ene-2016, 9:06:32
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuestionario</title>
    </head>
    <body>
        <form action="cuestionario.jsp" method="post">
            <table>
                <tr>
                    <td>
                        ¿Que tipo de dato acepta decimales?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta1" value="a"> int
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta1" value="b"> double
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta1" value="c"> for
                    </td>
                </tr>
                
                <tr>
                    <td>
                         ¿Que es el Microsoft Visio?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta2" value="a"> Un editor HTML
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta2" value="b">  Un programa de diseño de bases de datos
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta2" value="c"> un lenguage de programación 
                    </td>
                </tr>
                
                  <tr>
                    <td>
                         ¿Que va en el body de una pagina web?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta3" value="a"> metadatos
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta3" value="b">  Un programa de diseño de bases de datos
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta3" value="c"> un lenguage de programación 
                    </td>
                </tr>
                
                <tr>
                    <td>
                         ¿De que está construida la memoria cache?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta4" value="a"> Transistores
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta4" value="b">  Condensadores
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta4" value="c"> Puertas NAND
                    </td>
                </tr>
    
                <tr>
                    <td>
                         ¿Que es mas rápido?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta5" value="a"> Disco mecánico sata 3
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta5" value="b">  Disco SSD 
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta5" value="c"> Memoria RAM
                    </td>
                </tr>
                
                  <tr>
                    <td>
                         ¿Que es un IDE?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta6" value="a"> Interfaz de disco duro
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta6" value="b">  intorno de desarollo integrado
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta6" value="c"> Una etiqueta HTML5
                    </td>
                </tr>
                
                <tr>
                    <td>
                         ¿Que es CSS?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta7" value="a"> Un tipo de fichero ejecutable
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta7" value="b"> Hoja de estilos en cascada
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta7" value="c"> Un lenguaje de programación
                    </td>
                </tr>
                
                <tr>
                    <td>
                         ¿Para que sirve JSP?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta8" value="a"> Dar interfaz gráfica a una apliación
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta8" value="b">  Interpretar lenguajes de marcas
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta8" value="c"> Una etiqueta HTML5
                    </td>
                </tr>
                
                 <tr>
                    <td>
                         ¿De que versión de html es la etiqueta video?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta9" value="a"> html3
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta9" value="b">  html6
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta9" value="c"> HTML5
                    </td>
                </tr>
                
                 <tr>
                    <td>
                         ¿Cuantos niveles de memoria cache hay?
                    </td>
                </tr>
                 <tr>
                    <td>
                         <input type="radio" name="pregunta10" value="a"> 2
                    </td>
                </tr>
                 <tr>
                    <td>
                        <input type="radio" name="pregunta10" value="b">  3
                    </td>
                </tr>
                <tr>
                    <td>
                         <input type="radio" name="pregunta10" value="c"> 4
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
