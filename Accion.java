public class Accion {
    private int valor=0;
    public synchronized void incrementar(){
        valor++;
        System.out.println("valor"+valor);
    }
    
}
