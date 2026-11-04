class Moto extends Veiculo {

    public Moto(double taxaDiaria) {
        this.taxaDiaria = taxaDiaria;
    }

    public double calcularValorTotal(int numDiarias) {
        return taxaDiaria * numDiarias;
    }
}