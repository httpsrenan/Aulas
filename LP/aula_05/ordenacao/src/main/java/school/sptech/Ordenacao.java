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

    public static void main(String[] args) {
        int[] vetor = {4,7,5,2,8,1,6,3};
        int[] vetor2 = {4,7,5,2,8,1,6,3};
        int[] vetor3 = {4,7,5,2,8,1,6,3};
        selectionSort(vetor);
        selectionSortOtimizado(vetor2);
        bubbleSort(vetor3);
    }
}
