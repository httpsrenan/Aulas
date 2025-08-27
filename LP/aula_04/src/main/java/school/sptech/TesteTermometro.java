package school.sptech;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro saoPaulo = new Termometro();

        System.out.println(saoPaulo);

        saoPaulo.aumentarTemperatura(15.3);
        saoPaulo.aumentarTemperatura(15.7);
        System.out.println(saoPaulo);
        saoPaulo.diminuirTemperatura(10.5);
        saoPaulo.diminuirTemperatura(21.7);
        System.out.println(saoPaulo);
        saoPaulo.converterParaFahrenheit();

        System.out.println("\n \n \n");

        Termometro rioJaneiro = new Termometro();
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
