public class main {
    public static void main(String[] args) {
        Recurso r = new Recurso();
        new Thread(() -> r.incrementar("Hilo A")).start();
        new Thread(() -> r.incrementar("Hilo B")).start();
        new Thread(() -> r.incrementar("Hilo C")).start();
    }
    
}

//el sistema operativo es el que asigna que proceso correr
//la zona critica est´basad en un bloque que comparte varios procesos