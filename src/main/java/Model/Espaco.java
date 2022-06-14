package Model;

import java.util.LinkedList;

public class Espaco {
    private final int id;
    private String endereco;
    private double area;
    private TipoEspaco tipoEspaco;
    private final LinkedList<Servico> servicos;

    public Espaco(int id, String endereco, double area, TipoEspaco tipoEspaco, LinkedList<Servico> servicos) {
        this.id = id;
        this.endereco = endereco;
        this.area = area;
        this.tipoEspaco = tipoEspaco;
        this.servicos = servicos == null ? servicos : new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public TipoEspaco getTipoEspaco() {
        return tipoEspaco;
    }

    public void setTipoEspaco(TipoEspaco tipoEspaco) {
        this.tipoEspaco = tipoEspaco;
    }

    public LinkedList<Servico> getServicos() {
        return new LinkedList<>(servicos);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void removerServico(Servico servico) {
        servicos.remove(servico);
    }
}
