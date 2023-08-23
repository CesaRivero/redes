public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo1 = new Dispositivo("Telefono","1236544");
        Dispositivo dispositivo2 = new Dispositivo("Monitor","12348854");
        Dispositivo dispositivo3 = new Dispositivo("PC","123486666");
        Red.agregarDispositivo(dispositivo1);
        Red.agregarDispositivo(dispositivo2);
        Red.agregarDispositivo(dispositivo3);
        Red.enviarMensaje(dispositivo1,dispositivo2,"Hola monitor");
        Red.enviarMensaje(dispositivo2,dispositivo3,"Hola pc");



    }
    
}