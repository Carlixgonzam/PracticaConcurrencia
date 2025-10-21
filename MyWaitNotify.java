public class MyWaitNotify {
    private ObjetoMonitor objMon=new ObjetoMonitor();
    public void esperar(){
        synchronized(objMon){
            try{
                objMon.wait();
            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
    public void avisar(){
        synchronized(objMon){
            objMon.notify();
        }
    }
    
}
