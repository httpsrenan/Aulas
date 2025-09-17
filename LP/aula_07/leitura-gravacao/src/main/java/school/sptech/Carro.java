package school.sptech;

import java.util.Arrays;

public class Carro {
    private Integer id;
    private String modelo;
    private String marca;
    private Double preco;
    private Integer ano;
    private Double potencia;
    private Double zeroacem;

    public Carro(Integer id, String modelo, String marca, Double preco, Integer ano, Double potencia, Double zeroacem) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.ano = ano;
        this.potencia = potencia;
        this.zeroacem = zeroacem;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                ", ano=" + ano +
                ", potencia=" + potencia +
                ", zeroacem=" + zeroacem +
                "\n" +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getZeroacem() {
        return zeroacem;
    }

    public void setZeroacem(double zeroacem) {
        this.zeroacem = zeroacem;
    }
}
