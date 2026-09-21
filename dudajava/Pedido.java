import java.util.ArrayList;
import java.util.List;

class Pedido {

    private List<Massa> massas = new ArrayList<>();

    public void adicionarMassa(Massa massa) {
        massas.add(massa);
    }

    public double calcularTotal() {

        double total = 0;

        for (Massa massa : massas) {
            total += massa.getPreco();
        }

        return total;
    }

    public void prepararPedido() {

        for (Massa massa : massas) {

            System.out.println(
                "Preparando: " + massa.getNome()
            );

            massa.preparar();
        }
    }
}