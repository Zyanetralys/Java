public class Ordenes4_Supervivencia {
public static void main(String[] args) {

double bateria = 34.5 / 2.1;
double contacto = 400.0 / 15.0;

if (bateria < 10) {
System.out.println("Apagar sistemas no esenciales");
}
else {
System.out.println("Mantener sistemas activos");
}

if (contacto <= 50) {
System.out.println("Lanzar granada");
}
else {
System.out.println("Mantener cobertura");
}

}
}
