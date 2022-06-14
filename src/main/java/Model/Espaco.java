package Model;

import java.util.LinkedList;

public class Espaco {
    private String endereco;
    private double area;
    private TipoEspaco tipoEspaco;
    private LinkedList<Servico> servicos;

    public Espaco(String endereco, double area, TipoEspaco tipoEspaco, LinkedList<Servico> servicos) {
        this.endereco = endereco;
        this.area = area;
        this.tipoEspaco = tipoEspaco;
        this.servicos = servicos;
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
}
