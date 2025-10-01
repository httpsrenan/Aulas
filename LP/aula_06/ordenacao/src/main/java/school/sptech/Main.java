package school.sptech;

public class Main {
    public static void main(String[] args) {
        Carro[] carros = new Carro[10];

        carros[0] = new Carro(1, "Civic", "Honda", 145000.0, 2022, 155.0);
        carros[1] = new Carro(2, "Corolla", "Toyota", 160000.0, 2023, 177.0);
        carros[2] = new Carro(3, "Model 3", "Tesla", 280000.0, 2024, 283.0);
        carros[3] = new Carro(4, "Mustang GT", "Ford", 350000.0, 2021, 466.0);
        carros[4] = new Carro(5, "A4", "Audi", 260000.0, 2020, 190.0);
        carros[5] = new Carro(6, "Serie 3", "BMW", 280000.0, 2023, 258.0);
        carros[6] = new Carro(7, "Compass", "Jeep", 170000.0, 2022, 185.0);
        carros[7] = new Carro(8, "Hilux", "Toyota", 230000.0, 2021, 204.0);
        carros[8] = new Carro(9, "Kicks", "Nissan", 125000.0, 2019, 114.0);
        carros[9] = new Carro(10, "Cayenne", "Porsche", 680000.0, 2024, 462.0);


        Ordenacao.bubbleSortPorPreco(carros);
        System.out.println("\n");
        Ordenacao.bubbleSortPorPotencia(carros);
        System.out.println("\n");
        Ordenacao.selectionSortPorModelo(carros);
        System.out.println("\n");
        Ordenacao.selectionSortPorMarcaDescre(carros);
        System.out.println("\n");
        Ordenacao.selectionSortPorAno(carros);
        System.out.println("\n");
        Ordenacao.pesquisaBinariaPorAno(carros, 2020);
        }
    }
