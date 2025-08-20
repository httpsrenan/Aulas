package school.sptech;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

    public static void exibeVetor(Integer[] v){
        //Exibindo vetor
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public static void exibeVetorNomes(String[] v){
        //Exibindo vetor
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public static void lerVetor(Integer[] vetor){
        Scanner leitor = new Scanner(System.in);
        // Usuaro preenche o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor de vetor[" + i +"]");
            vetor[i] = leitor.nextInt();
        }
    }

    public static void lerVetorNomes(String[] vetor){
        Scanner leitor = new Scanner(System.in);
        // Usuaro preenche o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor de vetor[" + i +"]");
            vetor[i] = leitor.nextLine();
        }
    }
    public static void main(String[] args) {

        Integer[] vetor = new Integer[10];
        Integer[] vetor2 = {100, 200, 300, 400, 500, 600, 700, 800, 900};
        String[] nomes = new String[5];
        String[] nomes2 = {"Renan", "Anna", "Ricardo", "Renata", "João", "Emerson", "Jusy"};

        // Preenchendo o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i*10;
        }
        System.out.println("Vetor 1:");
        exibeVetor(vetor);
        System.out.println("\nVetor 2:");
        exibeVetor(vetor2);

        lerVetor(vetor);
        System.out.println("Vetor Digitado:");
        exibeVetor(vetor);
        System.out.println("Vetor bonitinho:");
        System.out.println(Arrays.toString(vetor));

        lerVetorNomes(nomes);
        System.out.println("Vetor Nomes Digitado:");
        exibeVetorNomes(nomes);
        System.out.println("Vetor Nomes Bonitinho:");
        System.out.println(Arrays.toString(nomes));

        // for aprimorado (Apenas para ler)
        for(String n :nomes2){
            System.out.println(n);
        }
    }
}
