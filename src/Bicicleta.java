public class Bicicleta extends Veiculo {
    private char freio;

    public Bicicleta(String codigo, String cor, String marca, String modelo, double valor, char freio) {
        super(codigo, cor, marca, modelo, valor);
        if (isFreioValido(freio)) {
            this.freio = freio;
        } else {
            throw new IllegalArgumentException("Tipo de freio inválido. Use: C, V, F, M, H.");
        }
    }

    public char getFreio() {
        return freio;
    }

    public void setFreio(char freio) {
        if (isFreioValido(freio)) {
            this.freio = freio;
        } else {
            throw new IllegalArgumentException("Tipo de freio inválido. Use: C, V, F, M, H.");
        }
    }

    private boolean isFreioValido(char freio) {
        return freio == 'C' || freio == 'V' || freio == 'F' || freio == 'M' || freio == 'H';
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Freio: " + freio);
    }
}
