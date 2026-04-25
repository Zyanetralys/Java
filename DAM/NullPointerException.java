String texto = null;
try {
    int longitud = texto.length();
    System.out.println("Longitud: " + longitud);
} catch (NullPointerException e) {
    System.out.println("Error: El objeto es nulo.");
}
