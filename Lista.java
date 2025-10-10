public class Lista {
    private static int suma = 0;

    public synchronized static void sumar(){
        suma++;
        System.out.println("suma"+ suma);
    }
    
}
