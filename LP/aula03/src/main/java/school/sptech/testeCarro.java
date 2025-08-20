package school.sptech;

public class testeCarro {
    public static void main(String[] args) {
        // Criando a instancia da classe carro
        Carro fusca = new Carro();

        fusca.anoFabricacao = 1976;
        fusca.modelo = "Fusca";
        fusca.cor = "Azul";
        fusca.velocidade = 0.0;

        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        System.out.println("Velocidade atual: " + fusca.velocidade);

        fusca.frear();
        System.out.println("Velocidade atual: " + fusca.velocidade);

        fusca.colidir();

        System.out.println(fusca);

        // Instanciando um novo carro
        Carro meuSonho = new Carro();
        meuSonho.modelo = "Ferrari";
        meuSonho.cor = "Vermelha";
        meuSonho.velocidade = 0.0;
        meuSonho.anoFabricacao = 2025;

        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        System.out.println("Velocidade atual: " + meuSonho.velocidade);

        System.out.println(meuSonho);

        // Instanciando um novo carro
        Carro fusca2 = new Carro();
        fusca2.anoFabricacao = 1976;
        fusca2.modelo = "Fusca";
        fusca2.cor = "Azul";
        fusca2.velocidade = 0.0;

        if (fusca == fusca2) {
            System.out.println("Fuscas são iguais");
        }else {
            System.out.println("Fuscas são diferentes");
        }
    }
}
