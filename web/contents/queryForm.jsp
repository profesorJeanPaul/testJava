<%@page import="java.util.ArrayList"%>
<%@page import="PaperLibrary.Dao.Book"%>
<h2>Consulta Libro</h2>
<label for="txtEditor">Seleccione Editorial:</label>
<form method="POST" action="../ResolucionPrueba2/BookServlet">
    <select id="txtEditor" name="editor">
        <option value="1">Duoc</option>
        <option value="2">Terror</option>
    </select>
    <button>
        Buscar
    </button>
</form>
 

<table>
    <tr>
        <th>Título</th>
        <th>Autor</th>
        <th>Editorial</th>
        <th>Precio</th>
        <th>Acción</th>
    </tr>
    <% 
        ArrayList<Book> books = request.getAttribute("books") != null ?
                (ArrayList<Book>)request.getAttribute("books") : 
                new ArrayList<Book>();
        for(Book book : books) {               
    %>
    <tr>
        <td><%= book.getTitle() %></td>
        <td><%= book.getAuthor()%></td>
        <td><%= book.getEditorialName() %></td>
        <td><%= book.getPrice() %></td>
        <td>Eliminar</td>
    </tr>
    <% } %>
</table>
 