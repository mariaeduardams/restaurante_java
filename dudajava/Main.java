public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.adicionarMassa(
            new Espaguete(
                "Espaguete à Bolonhesa",
                25.0
            )
        );

        pedido.adicionarMassa(
            new Lasanha(
                "Lasanha de Queijo",
                32.0
            )
        );

        pedido.adicionarMassa(
            new Ravioli(
                "Ravioli de Frango",
                30.0
            )
        );

        pedido.prepararPedido();

        System.out.printf(
            "Total: R$ %.2f%n",
            pedido.calcularTotal()
        );
    }
}