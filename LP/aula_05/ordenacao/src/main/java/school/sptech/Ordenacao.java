package school.sptech;

import java.util.Arrays;

public class Ordenacao {

    public static void selectionSort(int[] v){
        Integer comparacao = 0;
        Integer troca = 0;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                comparacao ++;
                if (v[i] > v[j]) {
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                    troca ++;
                }
            }
        }
        System.out.println("selectionSort: ");
        System.out.println(Arrays.toString(v));
        System.out.println("Número de comparações: " + comparacao);
        System.out.println("Número de trocas: " + troca);
    }

    public static void selectionSortOtimizado(int[] v){
        Integer comparacao = 0;
        Integer troca = 0;
        int indiceMenor;
        for (int i = 0; i < v.length - 1; i++) {
            indiceMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                comparacao ++;
                if (v[j] < v[indiceMenor] ) {
                    indiceMenor = j;
                }
            }
            if(i != indiceMenor){
                int aux = v[i];
                v[i] = v[indiceMenor];
                v[indiceMenor] = aux;
                troca ++;
            }
        }
        System.out.println("selectionSortOtimizado: ");
        System.out.println(Arrays.toString(v));
        System.out.println("Número de comparações: " + comparacao);
        System.out.println("Número de trocas: " + troca);
    }

    public static void bubbleSort(int[] v){
        Integer comparacao = 0;
        Integer troca = 0;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 1; j < v.length - i; j++) {
                comparacao ++;
                if(v[j-1] > v[j]){
                    int aux = v[j-1];
                    v[j-1] = v[j];
                    v[j] = aux;
                    troca ++;
                }
            }
        }
        System.out.println("bubbleSort: ");
        System.out.println(Arrays.toString(v));
        System.out.println("Número de comparações: " + comparacao);
        System.out.println("Número de trocas: " + troca);
    }

    public static int pesqBin(int x, int[] v){
        int inicio = 0;
        int fim = v.length - 1;
        int meio = 0;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if(x == v[meio]){
                return meio;
            } else if (x > v[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] vetor = {4,7,5,2,8,1,6,3};
        int[] vetor2 = {4,7,5,2,8,1,6,3};
        int[] vetor3 = {4,7,5,2,8,1,6,3};
        int[] vetor4 = {10,20,30,40,50,60,70,80,90};
        selectionSort(vetor);
        System.out.println("\n");
        selectionSortOtimizado(vetor2);
        System.out.println("\n");
        bubbleSort(vetor3);
        System.out.println("\n");
        int result = pesqBin(80, vetor4);
        System.out.println("Onde esta o valor x no vetor: " + result);
    }
}
