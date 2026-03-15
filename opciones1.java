public class ListaPurga {
public static void main(String[] args) {
String[] objetivo = {"01", "02", "03", "04", "05"};

boolean negociacionActiva = true;

for (int i = 0; i < objetivo.length; i++) {
if (negociacionActiva) {
System.out.println("Objetivo " + objetivo[i] + ": CAPTURA PRIORITARIA. Negociacion activa.");
} else {
System.out.println("Objetivo " + objetivo[i] + ": ORDEN: ANULAR PODER DEL CONSEJO.");
}
}
}
}
