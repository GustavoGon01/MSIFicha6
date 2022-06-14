package Model.exceptions;

public class IdRepetido extends RuntimeException {
    public IdRepetido(int id) {
        super("Id repetido, id: " + id);
    }
}
