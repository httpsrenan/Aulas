package school.sptech;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class TesteLivraria {
    public static void main(String[] args) {
        Boolean continuar = true;
        Connection connection = new Connection();

        JdbcTemplate con = new JdbcTemplate(connection.getDataSource());

        con.execute("CREATE TABLE IF NOT EXISTS livros(" +
                "id int primary key auto_increment," +
                "nome varchar(100)," +
                "preco double);");

        Scanner leitor = new Scanner(System.in);

        while (continuar) {
            System.out.println("+------------------------------+");
            System.out.println("| Livraria SPTECH              |");
            System.out.println("+------------------------------+");
            System.out.println("| 1) Cadastrar Livro           |");
            System.out.println("| 2) Exibir Livros             |");
            System.out.println("| 3) Atualizar Livro           |");
            System.out.println("| 4) Remover Livro             |");
            System.out.println("| 5) Buscar por nome           |");
            System.out.println("| 6) Sair                      |");
            System.out.println("+------------------------------+");

            System.out.println("Selecione uma opção:");
            Integer opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do livro:");
                String nome = leitor.nextLine();
                System.out.println("Digite o preco do livro:");
                Double preco = leitor.nextDouble();
                con.update("INSERT INTO livros (nome, preco) VALUES " +
                        "(?,?)", nome, preco);
                System.out.println("Livro cadastrado com sucesso!");
            }

            else if (opcao == 2) {
                List<Livro> livros = con.query("SELECT * FROM livros;",
                        new BeanPropertyRowMapper<>(Livro.class));
                System.out.println("Exibindo livros:");
                for (int i = 0; i < livros.size(); i++) {
                    System.out.println(livros.get(i));
                }
            }

            else if (opcao == 3) {
                System.out.println("Digite o nome do livro que deseja atualizar:");
                String nomemudar = leitor.next();
                System.out.println("Digite o novo nome:");
                String nomenovo = leitor.next();
                System.out.println("Digite o novo preco:");
                Double preconovo = leitor.nextDouble();
                con.update("UPDATE livros SET nome = ?, preco = ? WHERE nome = ?", nomenovo, preconovo, nomemudar);
            }
            else if (opcao == 4) {
                System.out.println("Digite o nome do livro que deseja remover:");
                String nome = leitor.next();
                con.update("DELETE FROM livros WHERE nome = ?", nome);
            }
            else if (opcao == 5) {
                System.out.println("Digite o nome do livro que deseja verificar:");
                String nome = leitor.next();
                List<Livro> livro = con.query("SELECT * FROM livros WHERE nome LIKE ?",
                        new BeanPropertyRowMapper<>(Livro.class), nome);
                if (livro.isEmpty()) {
                    System.out.println("Livro não encontrado!");
                }
                else {
                    System.out.println(livro.get(0));
                }
            }
            else if (opcao == 6) {
                System.out.println("Saindo...");
                continuar = false;
            }
            else {
                System.out.println("Digite uma opção valida");
            }
        }
    }
}
