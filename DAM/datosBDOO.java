// En una BDOO, podrías almacenar directamente:

class Persona {
    // Tipos primitivos/envolventes
    private String nombre;        // Character/String
    private int edad;             // Number
    private boolean activo;       // Boolean
    private Date fechaNacimiento; // Datetime
    
    // Objetos complejos
    private Direccion direccion;  // Objeto personalizado
    private List<Telefono> tels;  // Colección de objetos
}

// Todo se almacena como OBJETO en la BDOO
