package school.sptech;

import java.util.Arrays;

public class Ordenacao {

    public static void selectionSortPorAno(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (carros[j].getAno() < carros[indiceMenor].getAno()) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor) {
                Carro aux = carros[i];
                carros[i] = carros[indiceMenor];
                carros[indiceMenor] = aux;
            }
        }
        System.out.println("selectionSort Por Ano: ");
        System.out.println(Arrays.toString(carros));
    }

    public static void bubbleSortPorPreco(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if (carros[j - 1].getPreco() > carros[j].getPreco()) {
                    Carro aux = carros[j - 1];
                    carros[j - 1] = carros[j];
                    carros[j] = aux;
                }
            }
        }
        System.out.println("bubbleSort Por Preço: ");
        System.out.println(Arrays.toString(carros));
    }

    public static void selectionSortPorModelo(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (carros[j].getModelo().compareTo(carros[indiceMenor].getModelo()) < 0) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor) {
                Carro aux = carros[i];
                carros[i] = carros[indiceMenor];
                carros[indiceMenor] = aux;
            }
        }
        System.out.println("\nSelectionSort por Modelo:");
        System.out.println(Arrays.toString(carros));
    }

    public static void selectionSortPorMarcaDescre(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMaior = i;
            for (int j = i + 1; j < n; j++) {
                if (carros[j].getMarca().compareTo(carros[indiceMaior].getMarca()) > 0) {
                    indiceMaior = j;
                }
            }
            if (i != indiceMaior) {
                Carro aux = carros[i];
                carros[i] = carros[indiceMaior];
                carros[indiceMaior] = aux;
            }
        }
        System.out.println("\nSelectionSort por Marca (decrescente):");
        System.out.println(Arrays.toString(carros));
    }

    public static void bubbleSortPorPotencia(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (carros[j].getPotencia() < carros[j + 1].getPotencia()) {
                    Carro aux = carros[j];
                    carros[j] = carros[j + 1];
                    carros[j + 1] = aux;
                }
            }
        }
        System.out.println("\nBubbleSort por Potência (decrescente):");
        System.out.println(Arrays.toString(carros));
    }

    public static int pesquisaBinariaPorAno(Carro[] carros, int anoBuscado) {
        int inicio = 0;
        int fim = carros.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (carros[meio].getAno() == anoBuscado) {
                System.out.println("Carro encontrado: " + carros[meio]);
                break;
            } else if (carros[meio].getAno() < anoBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
