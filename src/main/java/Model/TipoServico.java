package Model;

public enum TipoServico {
    MANUTENCAO("Manutenção"), PREPARACAO("Preparação");

    private final String nome;

    TipoServico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
