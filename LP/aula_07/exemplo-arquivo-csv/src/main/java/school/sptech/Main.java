package school.sptech;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> Lista = new ArrayList<>();

        Lista.add(new Cachorro(1, "Zeus", "Grande", 55.0));
        Lista.add(new Cachorro(2, "Cacau", "Grande", 58.0));
        Lista.add(new Cachorro(3, "Kiki", "Pequeno", 3.0));
        Lista.add(new Cachorro(4, "Ralph", "Medio", 20.5));
        Lista.add(new Cachorro(5, "Akira", "Pequeno", 5.5));

        System.out.println("Gravando csv");
        gravaArquivoCSV(Lista, "dogs");
        System.out.println("Csv gravado");

        System.out.println("Lendo e exibindo o arquivo csv");
        System.out.println(" -------------------------------");
        leExibeArquivoCSV("dogs");
    }

    public static void gravaArquivoCSV(List<Cachorro> Lista, String nomeArq) {

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
            saida.append("ID;NOME;PORTE;PESO\n");

            for (Cachorro dog : Lista) {
                saida.write(String.format("%d;%s;%s;%.1f\n",
                        dog.getId(), dog.getNome(), dog.getPorte(), dog.getPeso()));
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
        }
        catch (FileNotFoundException erro){
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
                    System.out.printf("%4s %-15s %-10s %4s\n",
                            titulo1, titulo2, titulo3, titulo4);

                    cabecalho = false;
                }else {
                    Integer id = entrada.nextInt();
                    String nome = entrada.next();
                    String porte = entrada.next();
                    Double peso = entrada.nextDouble();
                    System.out.printf("%4d %-15s %-10S %4.1f\n",
                            id, nome, porte, peso);

                }
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problema");
            erro.printStackTrace();
            deuRuim = true;
        }
        catch (IllegalStateException erro){
            System.out.println("Erro na leitura");
            erro.printStackTrace();
            deuRuim = true;
        }
        finally {
            try {
                entrada.close();
                arq.close();
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
}