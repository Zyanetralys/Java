for (int i = 0; i < 10; i++) {
    if (falloMotor == true) {
        break; // SALE DEL BUCLE.
    }
    System.out.println("Alarma"); // <--- Esto NO se ejecuta si hay fallo.
}
