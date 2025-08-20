package school.sptech;

public class ArquivoLegal {
    public static void main(String[] args) {
        // Comentario
        /*
        Comentario tbm
        */

//      sout = abreviação para printar
//      println = printa e da enter
        System.out.println("hello World");
        System.out.println("Vai Corinthians");

        // Variáveis
        String nome = "Renan"; // Texto

        // Wrapper
        Character letra = 'A'; // Apenas 1 letra
        Integer idade = 20; // Números inteiros
        Double altura = 1.8; // Números decimal
        Boolean casado = false; // Boleano

        // Tipos Primitivos
        char letra1 = 'R'; // Apenas 1 letra
        int num = 16; // Números inteiros
        double doub = 16.10; // Números decimal
        boolean boleano = true; // Boleano

        String nome1 = "Renan";
        String nome2 = "renan";

        // Verifica se é igual
        if (nome1 == nome2){
            System.out.println("É igual");
        } else{
            System.out.println("É diferente");
        }

        // Verifica se é igual
        if (nome1.equals(nome2)){
            System.out.println("É igual");
        } else{
            System.out.println("É diferente");
        }

        // Verifica se é igual ignorando maisculo e minusculo
        if (nome1.equalsIgnoreCase(nome2)){
            System.out.println("É igual");
        } else{
            System.out.println("É diferente");
        }

        int contador = 0;
        while (contador <5){
            System.out.println("Vez " + contador);
            contador++;
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Vez for " + i);
        }

    }
}
