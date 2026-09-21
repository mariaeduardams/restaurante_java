class Ravioli extends Massa {

    public Ravioli(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println(
            "Cozinhando o ravioli recheado..."
        );
    }
}