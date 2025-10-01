package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TesteBanco {
    public static void main(String[] args) {

        Connection connection = new Connection();

        JdbcTemplate con = new JdbcTemplate(connection.getDataSource());

        con.execute("CREATE TABLE IF NOT EXISTS time(" +
                "id int primary key auto_increment," +
                "nome varchar(50)," +
                "qtdJogadores int" +
                ");");

        con.update("INSERT INTO time (nome, qtdJogadores) VALUES " +
                "('Corinthians',43)," +
                "('Trikas',24)," +
                "('Sem Mundial',51);");

        List times = con.queryForList("SELECT * FROM time;");
        System.out.println("Exibindo o resultado do select de times");
        System.out.println(times);

        List<Time> ListaTimes = con.query("SELECT * FROM time;",
                new BeanPropertyRowMapper<>(Time.class));
        System.out.println("Exibindo objeto de times");
        for (int i = 0; i < ListaTimes.size(); i++) {
            System.out.println(ListaTimes.get(i));
        }
    }

}
