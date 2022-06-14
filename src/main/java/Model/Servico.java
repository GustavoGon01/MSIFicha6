package Model;

import java.util.Date;

public class Servico {
    private Date data;
    private double preco;
private TipoServico tipoServico;
private Espaco espaco;

    public Servico(Date data, double preco, TipoServico tipoServico, Espaco espaco) {
        this.data = data;
        this.preco = preco;
        this.tipoServico = tipoServico;
        this.espaco = espaco;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }
}
