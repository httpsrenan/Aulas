package school.sptech;

import java.util.Scanner;

public class ScannerExemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade");
        Integer idade = leitor.nextInt();

        System.out.println("Digite sua altura");
        Double altura = leitor.nextDouble();

        System.out.printf("Olá %s, você tem %d anos e mede %.2f m. \n",
                nome, idade, altura);

        System.out.println("Digite 3 números aleatorios (separados por espaço)");
        Integer num1 = leitor.nextInt();
        Integer num2 = leitor.nextInt();
        Integer num3 = leitor.nextInt();

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Número 3: " + num3);
    }
}
