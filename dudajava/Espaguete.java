class Espaguete extends Massa {

    public Espaguete(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println(
            "Cozinhando o espaguete..."
        );
    }
}