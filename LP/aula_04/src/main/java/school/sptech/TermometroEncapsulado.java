package school.sptech;

public class TermometroEncapsulado {

    private Double temperaturaAtual = 0.0;
    private Double temperaturaMaxRegistrada = 0.0;
    private Double temperaturaMinRegistrada = 0.0;

    public void aumentarTemperatura(Double valor){
        if (valor == null || valor <= 0  ){
            System.out.println("Parâmetro inválido");
        }else{
            temperaturaAtual += valor;
        }

        if (temperaturaAtual > temperaturaMaxRegistrada){
            temperaturaMaxRegistrada = temperaturaAtual;
        }

        System.out.println("Temperatura atual: " + temperaturaAtual);
    }

    public void diminuirTemperatura(Double valor){
        if (valor == null || valor <= 0  ){
            System.out.println("Parâmetro inválido");
        }else{
            temperaturaAtual -= valor;
        }

        if (temperaturaAtual < temperaturaMinRegistrada){
            temperaturaMinRegistrada = temperaturaAtual;
        }

        System.out.println("Temperatura atual: " + temperaturaAtual);
    }

    public void converterParaFahrenheit(){
        System.out.println("Temperatura em Fahrenheit: " + temperaturaAtual * 1.8 + 32);
    }

    @Override
    public String toString() {
        return "Termometro{" +
                "Temperatura Atual='" + temperaturaAtual + '\'' +
                ", Temperatura Max Registrada='" + temperaturaMaxRegistrada + '\'' +
                ", Temperatura Min Registrada=" + temperaturaMinRegistrada +
                '}';
    }

    // Getters e Setters
    // Para criar, clicar no Alt + Ins e escolher Getters and Setters
    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaMaxRegistrada() {
        return temperaturaMaxRegistrada;
    }

    public void setTemperaturaMaxRegistrada(Double temperaturaMaxRegistrada) {
        this.temperaturaMaxRegistrada = temperaturaMaxRegistrada;
    }
}
