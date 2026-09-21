class Lasanha extends Massa {

    public Lasanha(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println(
            "Montando as camadas da lasanha..."
        );
    }
}