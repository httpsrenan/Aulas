package school.sptech;

import java.util.Arrays;

public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private double preco;
    private int ano;
    private double potencia;

    public Carro(int id, String modelo, String marca, double preco, int ano, double potencia) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.ano = ano;
        this.potencia = potencia;
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
}
