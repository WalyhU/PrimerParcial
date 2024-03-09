package EstructuraDeDatos;

public class Main {
    public static void main(String[] args) {
        LinkedList initPedidos = new LinkedList();
        initPedidos.insertAtHead(new Pedido("Lavadora", 123));
        initPedidos.insertAtHead(new Pedido("Licuadora", 456));
        initPedidos.insertAtHead(new Pedido("Refrigerador", 789));

        Producer producer = new Producer(initPedidos.toArray());

        Consumer consumer = new Consumer(producer.getPedidos());

        System.out.println("Pedidos del consumidor: ");
        for (Object pedido : consumer.getPedidos()) {
            System.out.println(pedido);
        }
    }
}
