package school.sptech;

public class Metodos {

    public static void exibeAsteriscos(){
        System.out.println("**********************************************************");
    }

    public static void exibeQuadroAsteriscos(){
        exibeAsteriscos();
        System.out.println("***                                                    ***");
    }

    public static void exibeQuadroAsteriscos(String msg){
        exibeAsteriscos();
        System.out.println("***                  "+ msg +"                   ***");
        exibeAsteriscos();
    }

    public Double media (Double n1 , Double n2){
        return (n1 + n2) / 2;
    }

    public static Double media (Double n1 , Double n2, Double n3){
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        exibeAsteriscos();
        System.out.println();
        exibeQuadroAsteriscos();
        System.out.println();
        exibeQuadroAsteriscos("Vai Corinthians");
        System.out.println();

        // Criar um objeto da classe Metodos
        Metodos m = new Metodos();
        System.out.println(m.media(6.0,7.0));
        Double media = m.media(8.0,9.0);

        System.out.println(media);
        System.out.println(media(6.0,7.0,8.0));
    }
}
