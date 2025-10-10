public class VentaConcierto extends Thread{
    private static Concierto c = new Concierto();
    private String res = "";
    public VentaConcierto(String n){
        res=n;
    }
    public void run(){
        c.comprarEntrada(res);
    }
    public static void main(String[]args){
        String[] nombres = {"carla", "felipe","fdwefwe","fwefewfew"};
        for(String nombre:nombres){
            Thread t = new Thread(()->c.comprarEntrada(nombre));
            t.start();
        }
    }

}
