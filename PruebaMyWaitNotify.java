public class PruebaMyWaitNotify {

    static class ObjetoMonitor { }

    static class MyWaitNotify {
        private final ObjetoMonitor objMon = new ObjetoMonitor();

        public void esperar() {
            synchronized (objMon) {
                try {
                    System.out.println("[Esperando] -> entro a wait()");
                    objMon.wait(); // espera pasiva
                    System.out.println("[Esperando] -> me despertaron (notify)");
                } catch (InterruptedException e) {
                    System.out.println("[Esperando] -> interrumpido");
                    Thread.currentThread().interrupt();
                }
            }
        }

        public void avisar() {
            synchronized (objMon) {
                System.out.println("[Avisando] -> voy a hacer notify()");
                objMon.notify(); // despierta a UN hilo en espera
                System.out.println("[Avisando] -> notify() hecho");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        MyWaitNotify sync = new MyWaitNotify();

        Thread hiloEsperando = new Thread(() -> {
            System.out.println("🕐 Hilo E: me voy a bloquear...");
            sync.esperar();
            System.out.println("✅ Hilo E: continué después del notify");
        });

        Thread hiloAvisando = new Thread(() -> {
            try {
                // Asegura que el que espera llegue primero a wait()
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("📣 Hilo A: listo para avisar");
            sync.avisar();
        });

        hiloEsperando.start();
        hiloAvisando.start();

        // Importante: esperar a que terminen (para que no cierre el programa)
        hiloEsperando.join();
        hiloAvisando.join();

        System.out.println("🏁 main(): fin");
    }
}