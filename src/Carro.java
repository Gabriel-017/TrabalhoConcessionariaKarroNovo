public class Carro extends Automotor {
    private int quantidadePortas;

    public Carro(String codigo, String cor, String marca, String modelo, double valor, char combustivel, int quantidadePortas) {
        super(codigo, cor, marca, modelo, valor, combustivel);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}