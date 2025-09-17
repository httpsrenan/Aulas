package school.sptech;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Carro> Lista = new ArrayList<>();

        Lista.add(new Carro(1, "Civic", "Honda", 145000.0, 2022, 155.0, 8.2));
        Lista.add(new Carro(2, "Corolla", "Toyota", 160000.0, 2023, 177.0, 9.2));
        Lista.add(new Carro(3, "Model 3", "Tesla", 280000.0, 2024, 283.0, 4.4));
        Lista.add(new Carro(4, "Mustang GT", "Ford", 350000.0, 2021, 466.0, 4.3));
        Lista.add(new Carro(5, "A4", "Audi", 260000.0, 2020, 190.0, 7.1));
        Lista.add(new Carro(6, "Serie 3", "BMW", 280000.0, 2023, 258.0, 6.1));
        Lista.add(new Carro(7, "Compass", "Jeep", 170000.0, 2022, 185.0, 10.0));
        Lista.add(new Carro(8, "Hilux", "Toyota", 230000.0, 2021, 204.0, 10.7));
        Lista.add(new Carro(9, "Kicks", "Nissan", 125000.0, 2019, 114.0, 12.0));
        Lista.add(new Carro(10, "Cayenne", "Porsche", 680000.0, 2024, 462.0, 4.8));

        System.out.println("Gravando csv");
        gravaArquivoCSV(Lista, "carros");
        System.out.println("Csv gravado");

        System.out.println("Lendo e exibindo o arquivo csv");
        System.out.println(" -------------------------------");
        leExibeArquivoCSV("carros");
    }

    public static void gravaArquivoCSV(List<Carro> Lista, String nomeArq) {

        OutputStreamWriter saida = null;
        Boolean deuRuim = false;
        nomeArq += ".csv";

        // Abrir o arquivo
        try {
            saida = new OutputStreamWriter(new FileOutputStream(nomeArq),
                    StandardCharsets.UTF_8);
        } catch (IOException erro) {
            System.out.println("Erro ao abrir arquivo csv!");
            System.exit(1);
        }

        // Gravar e fechar o arquivo
        try {
            saida.append("ID;MODELO;MARCA;PRECO;ANO;POTENCIA;0 A 100\n");

            for (Carro carros : Lista) {
                saida.write(String.format("%d;%s;%s;%.2f;%d;%.1f;%.1f\n",
                        carros.getId(), carros.getModelo(), carros.getMarca(),
                        carros.getPreco(), carros.getAno(), carros.getPotencia(), carros.getZeroacem()));
            }
        } catch (IOException erro) {
            System.out.println("Erro ao gravar arquivo csv!");
            erro.printStackTrace();
            deuRuim = true;
        }
        finally {
            try {
                saida.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar arquivo csv!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCSV(String nomeArq) {
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;
        nomeArq += ".csv";

        // Abrindo arquivo
        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo inexistente!");
            System.exit(1);
        }

        // ler e fechar o arquivo
        try {
            Boolean cabecalho = true;
            while (entrada.hasNext()) {
                if (cabecalho) {
                    String titulo1 = entrada.next();
                    String titulo2 = entrada.next();
                    String titulo3 = entrada.next();
                    String titulo4 = entrada.next();
                    String titulo5 = entrada.next();
                    String titulo6 = entrada.next();
                    String titulo7 = entrada.next();
                    System.out.printf("%4s %-15s %-10s %10s %5s %10s %10s\n",
                            titulo1, titulo2, titulo3, titulo4, titulo5, titulo6, titulo7);

                    cabecalho = false;
                } else {
                    Integer id = entrada.nextInt();
                    String modelo = entrada.next();
                    String marca = entrada.next();
                    Double preco = entrada.nextDouble();
                    Integer ano = entrada.nextInt();
                    Double potencia = entrada.nextDouble();
                    Double zeroacem = entrada.nextDouble();
                    System.out.printf("%4d %-15s %-10s %10.2f %5d %10.1f %10.1f\n",
                            id, modelo, marca, preco, ano, potencia, zeroacem);

                }
            }
        } catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problema");
            erro.printStackTrace();
            deuRuim = true;
        } catch (IllegalStateException erro) {
            System.out.println("Erro na leitura");
            erro.printStackTrace();
            deuRuim = true;
        } finally {
            try {
                entrada.close();
                arq.close();
            } catch (IOException erro) {
                System.out.println("Erro ao fechar arquivo csv!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }
}
