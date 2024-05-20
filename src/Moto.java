public class Moto extends Automotor {
    private boolean partidaEletrica;
    private int cilindradas;

    public Moto(String codigo, String cor, String marca, String modelo, double valor, char combustivel, boolean partidaEletrica, int cilindradas) {
        super(codigo, cor, marca, modelo, valor, combustivel);
        this.partidaEletrica = partidaEletrica;
        this.cilindradas = cilindradas;

    }

    public boolean hasPartidaEletrica() {

        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

}