public class Concierto {
    private int entradasDispo = 1;
    public synchronized void comprarEntrada(String nombre){
        if(entradasDispo>0){
            System.out.println(nombre+" procede a comprar");
            entradasDispo--;
            System.out.println(nombre+ " compró la entrada, quedan" + entradasDispo);
        } else{
            System.out.println(nombre+ " no alcanzó entrada");
        }
    }
}
