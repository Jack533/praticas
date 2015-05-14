<%-- 
    Document   : ListarClientes
    Created on : 25/11/2014, 17:07:57
    Author     : Onismar
--%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Clientes</title>
</head>
<body>
<center>   
	<jsp:useBean id="dao" class= "clientes.dao.ClienteDAO" />
	<table border = "1">
		
            <tr>
			<th>ID</th>
			<th>NOME</th>
			<th>ENDEREÇO</th>
			<th>TELEFONE</th>
                        <th>EMAIL</th>
                        <th>DATA DE NASCIMENTO</th>
            </tr>
            
           
                <c:forEach var= "cliente" items="${dao.listar()}">
                    
                        <tr>
				<td>${cliente.id}</td>
                                <td>${cliente.nome}</td>
                                <td>${cliente.endereco}</td>
                                <td>${cliente.telefone}</td>
				<td>${cliente.email}</td>
				<td>${cliente.nascimento}</td>
				
			</tr>
                       
		</c:forEach>
	</table>
        <a href="index.html"><input type="button" value="Voltar"/></a></td>
</center>
</body>
</html>