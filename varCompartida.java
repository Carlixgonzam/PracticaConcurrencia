public class varCompartida {
    private int x = 0;
    public synchronized void seteoValor(int nuevoVar){
        if(nuevoVar > 0){
            x=nuevoVar;
        }
    }
    public int getValor(){
        return x;
    }
    
}
