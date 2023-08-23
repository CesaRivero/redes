import java.util.ArrayList;

public class Red {
    private ArrayList<Dispositivo>listaDispositivos ;

    public static void enviarMensaje(Dispositivo a, Dispositivo b, String mensaje){
        mensaje = "De: " +a.getNombre() + "\nPara: " + b.getNombre() + "\n"+mensaje;
        System.out.println( mensaje);

    }

    public static ArrayList<Dispositivo> agregarDispositivo(Dispositivo a){
       ArrayList<Dispositivo> listaDispositivos= new ArrayList<Dispositivo>();
        listaDispositivos.add(a);
        return listaDispositivos;
    }
    public ArrayList<Dispositivo> getListaDispositivos() {
        return listaDispositivos;
    }

    public void setListaDispositivos(ArrayList<Dispositivo> listaDispositivos) {
        this.listaDispositivos = listaDispositivos;
    }
}
