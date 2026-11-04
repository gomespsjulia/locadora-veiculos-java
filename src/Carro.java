class Carro extends Veiculo {

    public Carro(double taxaDiaria) {
        this.taxaDiaria = taxaDiaria;
    }

    public double calcularValorTotal(int numDiarias) {
        return taxaDiaria * numDiarias;
    }
}