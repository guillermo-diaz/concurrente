package TP2;

public class Ejercicio6 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1});
        Cajero cajero1 = new Cajero("Cajero 1");
        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        cajero1.procesarCompra(cliente1, initialTime);
        cajero1.procesarCompra(cliente2, initialTime);
    }
}
class incisoB{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5,2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1});
        CajeroThread cajero1 = new CajeroThread("Cajero 1", cliente1, System.currentTimeMillis());
        CajeroThread cajero2 = new CajeroThread("Cajero 2", cliente2, System.currentTimeMillis());
        cajero1.start();
        cajero2.start();
            
    }
}