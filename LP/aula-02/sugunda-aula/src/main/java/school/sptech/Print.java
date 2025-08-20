package school.sptech;

public class Print {

    public static void main(String[] args) {
        System.out.println("Vai Corinthians");

        String nome = "Gilberto";
        Integer idade = 22;
        Double altura = 1.78;
        Double nota = 78.0;

        String textoFormatado = String.format("Olá %s, você tem %d anos e " +
                        "mede %.2f m. Você acertou %.2f%% da prova",
        nome, idade, altura, nota);

        System.out.println(textoFormatado);

        System.out.printf("Olá %s, você tem %d anos e " +
                        "mede %.2f m. Você acertou %.2f%% da prova",
                nome, idade, altura, nota);
    }
}
