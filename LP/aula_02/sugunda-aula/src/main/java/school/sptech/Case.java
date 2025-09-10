package school.sptech;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {

        boolean fim = false;

        while (!fim){


        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1- Cadastrar");
        System.out.println("2- Alterar dados");
        System.out.println("3- Sair");

        Integer resposta = leitor.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("Cadastrando");
                break;

            case 2:
                System.out.println("Alterando");
                break;

            case 3:
                System.out.println("Saindo...");
                fim = true;
                break;

            default:
                System.out.println("Burro do Caralho, é so 1,2 ou 3");
        }
        }
    }
}
