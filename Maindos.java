public class Maindos extends Thread{
    private Accion accion;
    public Maindos(Accion a){
        this.accion=a;
    }
    public void run(){
        accion.incrementar();
    }
    public static void main(String[]args){
        Accion a = new Accion();
        for(int i=0; i < 5;i++){
            new Maindos(a).start();
        }
    }
    
}
