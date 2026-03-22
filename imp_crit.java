int dañoBase = 50;
int resistenciaEnemigo = 20;
int dañoReal = dañoBase - resistenciaEnemigo;
boolean esCritico = true;

if (esCritico && dañoReal > 0) {
    System.out.println("Impacto crítico");
}
