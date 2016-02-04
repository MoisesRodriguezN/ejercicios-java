<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <style>
        body {
           font-family: Arial, sans-serif;
            background-color: #ff9900;
          }

        h1 {
          text-align: center;
          padding-top: 12px;
          font-size: 28px;
        }

        h2 {
          text-align: center;
          padding-top: 32px;
          font-size: 18px;
        }

        form {
          text-align: center;
        }   
  </style>
  
  </head>
  <body>
    <h1>Apuesta y gana</h1>
    <div id="principal">
      <%
        int dinero = Integer.parseInt(request.getParameter("dinero"));
      %>
      <h2>Ha conseguido <%= dinero %> euros</h2>
      <form method="post" action="index.jsp">
        <input type="submit" value="Volver a jugar">
      </form>
    </div>
  </body>
</html>
