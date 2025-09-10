package school.sptech;

public class Carro {
    //Atributos - variaveis que são criadas dentro da classe mas fora do escopo dos metodos
    //São usados pararepresentar as caracteristicas do objeto que são relevantes para o projeto

    String modelo;
    String cor;
    Double velocidade;
    Integer anoFabricacao;

    //Metodos - representam o comportamento do objeto

    //metodo acelerar
    public void acelerar(){
        System.out.println("Vruuummm");
        velocidade += 20;
    }

    //metodo frear
    public void frear(){
        System.out.println("Freando");
        velocidade -= 20;
    }

    //metodo colidir
    public void colidir (){
        System.out.println("Pooowwwww...");
        velocidade = 0.0;
    }

    // Sobrescrever o metodo toString()
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
