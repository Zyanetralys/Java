switch (i) { // Evalúa el valor de 'i' (el sector actual)
    case 1:
        System.out.println("Sector 1: Amenaza Baja. Registrando datos.");
        break; // ¡CRUCIAL! Rompe el switch. Sin esto, caes al caso 2.
    case 2:
        System.out.println("Sector 2: Amenaza Media. Activando escudos.");
        break;
    case 3:
        System.out.println("Sector 3: Amenaza Alta. Desplegando contramedidas.");
        break;
    case 4:
        System.out.println("Sector 4: Zona Crítica. Llamando a artillería.");
        break;
    case 5:
        System.out.println("Sector 5: Zona Segura. Reiniciando sistemas.");
        break;
    default:
        System.out.println("Error: Sector desconocido.");
}
