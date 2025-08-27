package school.sptech;

public class TesteTermometroEncapsuladoContrutor {
    public static void main(String[] args) {
        TermometroEncapsuladoContrutor saoPaulo = new TermometroEncapsuladoContrutor(0.0, 0.0, 0.0);

        System.out.println(saoPaulo);

        saoPaulo.aumentarTemperatura(15.3);
        saoPaulo.aumentarTemperatura(15.7);
        System.out.println(saoPaulo);
        saoPaulo.diminuirTemperatura(10.5);
        saoPaulo.diminuirTemperatura(21.7);
        System.out.println(saoPaulo);
        saoPaulo.converterParaFahrenheit();

        System.out.println("\n \n \n");

        TermometroEncapsuladoContrutor rioJaneiro = new TermometroEncapsuladoContrutor(10.0, 10.0, 10.0);
        System.out.println(rioJaneiro);

        rioJaneiro.aumentarTemperatura(25.7);
        rioJaneiro.aumentarTemperatura(13.8);
        System.out.println(rioJaneiro);
        rioJaneiro.converterParaFahrenheit();
        rioJaneiro .diminuirTemperatura(50.2);
        System.out.println(rioJaneiro);
        rioJaneiro.aumentarTemperatura(50.5);
        System.out.println(rioJaneiro);
        rioJaneiro.converterParaFahrenheit();

    }

}
