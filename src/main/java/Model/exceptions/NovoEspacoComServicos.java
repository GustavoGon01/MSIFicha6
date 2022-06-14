package Model.exceptions;

public class NovoEspacoComServicos extends RuntimeException {
    public NovoEspacoComServicos() {
        super("Tentativa de inserção de novo espaço com serviços associados.");
    }
}
