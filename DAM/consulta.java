// ResultSet es un objeto de Java JDBC que almacena los resultados de una consulta SQL (SELECT). Contiene una tabla de datos con filas y columnas.

// Consulta SQL
String sql = "SELECT id, nombre, email FROM usuarios";

// Ejecutar consulta
Statement sentencia = connection.createStatement();
ResultSet resultSet = sentencia.executeQuery(sql);

// resultSet CONTIENE:
// ┌─────┬──────────┬─────────────────┐
// │ id  │ nombre   │ email           │
// ├─────┼──────────┼─────────────────┤
// │ 1   │ Ana      │ ana@email.com   │
// │ 2   │ Carlos   │ carlos@email.com│
// └─────┴──────────┴─────────────────┘

// Recorrer los datos
while (resultSet.next()) {
    int id = resultSet.getInt("id");
    String nombre = resultSet.getString("nombre");
    String email = resultSet.getString("email");
    
    System.out.println(id + " - " + nombre + " - " + email);
}
