public enum TipoCombustivel {
    GASOLINA('G'),
    ALCOOL('A'),
    FLEX('F'),
    ELETRICO('E'),
    DIESEL('D');

    private final char codigo;

    TipoCombustivel(char codigo) {
        this.codigo = codigo;
    }

    public char getCodigo() {
        return codigo;
    }

    public static TipoCombustivel getByCodigo(char codigo) {
        for (TipoCombustivel tipo : values()) {
            if (tipo.codigo == codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código de combustível inválido: " + codigo);
    }
}
