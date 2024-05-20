public class Automotor extends Veiculo {
    private char combustivel;

    public Automotor(String codigo, String cor, String marca, String modelo, double valor, char combustivel) {
        super(codigo, cor, marca, modelo, valor);
        this.combustivel = combustivel;
    }

    public char getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(char combustivel) {
        this.combustivel = combustivel;
    }
}