package Model.exceptions;

public class EnderecoRepetido extends RuntimeException {
    public EnderecoRepetido(String endereco) {
        super("Espaço com endereço repetido, endereço: " + endereco);
    }
}
