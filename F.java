public class F extends Thread{
    public void run(){
        Lista.sumar();
    }
    public static void main(String[] args){
        for(int i=0; i<10;i++){
            new F().start();
        }
    }

}
