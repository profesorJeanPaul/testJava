<h2>Ingreso Libro</h2>

<form>
    <label for="txtTitle">Título:</label>
    <input type="text" name="title" id="txtTitle" required/>
    <br/>
    <label for="txtAuthor">Autor:</label>
    <input type="text" name="author" required id="txtAuthor"/>
    <br/>
    <label for="txtEditor">Editorial:</label>
    <select id="txtEditor" name="editor">
        <option>Test1</option>
        <option>Test2</option>
        <option>Test3</option>
    </select>
    <br/>
    <label for="txtPrice">Precio:</label>
    <input type="number" min="0" name="price" required id="txtPrice"/>
    <br/>
    <button>Grabar</button>
</form>