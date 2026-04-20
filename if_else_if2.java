int umbralCarga = 85;
if (umbralCarga >= 90) {
    System.out.println(">> SOBRECARGA: Descarga de emergencia");
} else if (umbralCarga >= 70) {
    System.out.println(">> CARGA ALTA: Optimizar flujos");
} else {
    System.out.println(">> CARGA ESTABLE: Operación normal");
}
