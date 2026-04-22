public class Typing {
 
    public static void slow(String text, int speed) throws InterruptedException {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(speed);
        }
        System.out.println(); // realiza un salto de linea al terminar de escribir
    }
}
