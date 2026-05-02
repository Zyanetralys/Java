int frecuencia = 1024;
int umbralHostil = 1000;
boolean esPar = (frecuencia % 2 == 0);
boolean amenazaConfirmada = (frecuencia > umbralHostil) && esPar;

System.out.println("Frecuencia hostil validada: " + amenazaConfirmada);
