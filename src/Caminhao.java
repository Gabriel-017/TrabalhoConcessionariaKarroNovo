public class Caminhao extends Automotor {
    private int cargaMaxima;
    private int numeroEixos;

    public Caminhao(String codigo, String cor, String marca, String modelo, double valor, char combustivel, int cargaMaxima, int numeroEixos) {
        super(codigo, cor, marca, modelo, valor, combustivel);
        this.cargaMaxima = cargaMaxima;
        this.numeroEixos = numeroEixos;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Carga Máxima: " + cargaMaxima);
        System.out.println("Número de Eixos: " + numeroEixos);
    }
}
