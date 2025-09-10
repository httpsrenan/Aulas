package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniDesafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Integer soma = 0;
        Integer menor = 0;
        Integer maior = 0;


        while (true) {
            System.out.println("Digite um numero (ou 0 para parar):");
            int numeroLido = leitor.nextInt();

            if (numeroLido == 0) {
                break;
            }
            numeros.add(numeroLido);
        }

        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) % 2 == 0){
                pares.add(numeros.get(i));
            }else{
                impares.add(numeros.get(i));
            }
            soma += numeros.get(i);

            if(menor > numeros.get(i)){
                menor = numeros.get(i);
            }

            if(maior < numeros.get(i)){
                maior = numeros.get(i);
            }
        }
        System.out.println("Numeros digitados: " + numeros);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Soma: " + soma);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}