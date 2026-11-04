public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro(50);
        Moto moto = new Moto(25);

        System.out.println("Carro: R$ " + carro.calcularValorTotal(10));
        System.out.println("Moto: R$ " + moto.calcularValorTotal(10));
    }
}