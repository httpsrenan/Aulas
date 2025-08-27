package school.sptech;

public class TesteTermometroEncapsulado {
    public static void main(String[] args) {
        TermometroEncapsulado saoPaulo = new TermometroEncapsulado();

        System.out.println(saoPaulo);

        saoPaulo.aumentarTemperatura(15.3);
        saoPaulo.aumentarTemperatura(15.7);
        System.out.println(saoPaulo);
        saoPaulo.diminuirTemperatura(10.5);
        saoPaulo.diminuirTemperatura(21.7);
        System.out.println(saoPaulo);
        saoPaulo.converterParaFahrenheit();

        System.out.println("\n \n \n");

        TermometroEncapsulado rioJaneiro = new TermometroEncapsulado();
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

        TermometroEncapsulado term1 = new TermometroEncapsulado();

        term1.setTemperaturaAtual(10.0);
        term1.setTemperaturaMaxRegistrada(10.0);

        System.out.println("Temperatura atual term1:" + term1.getTemperaturaAtual());
    }

}
