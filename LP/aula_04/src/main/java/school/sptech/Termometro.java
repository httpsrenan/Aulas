package school.sptech;

public class Termometro {

    Double temperaturaAtual = 0.0;
    Double temperaturaMaxRegistrada = 0.0;
    Double temperaturaMinRegistrada = 0.0;

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
}
