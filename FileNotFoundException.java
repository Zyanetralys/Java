try {
    File archivo = new File("archivo_inexistente.txt");
    Scanner lector = new Scanner(archivo);
    // procesamiento...
} catch (FileNotFoundException e) {
    System.out.println("Error: El archivo no se encuentra.");
}
