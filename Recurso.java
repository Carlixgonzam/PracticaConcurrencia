public class Recurso {
    private int contador = 0;
    public synchronized void incrementar(String nombreHilo) {
        System.out.println(nombreHilo + " entra a la sección crítica 🔒");
        contador++;
        System.out.println(nombreHilo + " incrementa contador → " + contador);
        System.out.println(nombreHilo + " sale de la sección crítica 🔓");
    }
    
}
