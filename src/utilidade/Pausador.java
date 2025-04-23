package utilidade;

public class Pausador {
    public static void esperar(long milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            System.out.println("A pausa foi interrompida.");
            Thread.currentThread().interrupt();
        }
    }


    public static void esperarSegundos(int segundos) {
        esperar(segundos * 1000);
    }

}