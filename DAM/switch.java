// ═══════════════════════════════════════════
│  SINTAXIS SWITCH                            │
// ═══════════════════════════════════════════

int diaSemana = 3;
String nombreDia;

switch (diaSemana) {
    case 1:
        nombreDia = "Lunes";
        break;
    case 2:
        nombreDia = "Martes";
        break;
    case 3:
        nombreDia = "Miércoles";  // Se ejecuta esto
        break;
    case 4:
        nombreDia = "Jueves";
        break;
    case 5:
        nombreDia = "Viernes";
        break;
    default:
        nombreDia = "Fin de semana";
}

System.out.println(nombreDia);  // Imprime: Miércoles
