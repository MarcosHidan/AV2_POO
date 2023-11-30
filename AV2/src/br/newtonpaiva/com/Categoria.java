package br.newtonpaiva.com;

public class Categoria {

    private String nomeCategoria;
    private String descCategoria;
    private double precoIngresso;

    public Categoria(String nomeCategoria, String descCategoria, double precoIngresso) {
        this.nomeCategoria = nomeCategoria;
        this.descCategoria = descCategoria;
        this.precoIngresso = precoIngresso;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    @Override
    public String toString() {
        return "br.newtonpaiva.com.Categoria{" +
                "nomeCategoria='" + nomeCategoria + '\'' +
                ", descCategoria='" + descCategoria + '\'' +
                ", precoIngresso=" + precoIngresso +
                '}';
    }
}