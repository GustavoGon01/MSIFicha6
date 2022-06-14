package Model;

public enum TipoEspaco {
    RELVADO("Relvado"), CANTEIROS("Canteiros"), MISTO("Misto");

    private final String nome;

    TipoEspaco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
