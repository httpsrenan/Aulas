package school.sptech;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Aleatorio {
    public static void main(String[] args) {
//        Usando Math.random
//        com teto (maximo 10)
        Integer numMax = (int)(Math.random()*10);

        System.out.println("Número Máximo: " + numMax);

//        com piso (minimo 2)
        Integer numMinimo = 2 + (int)(Math.random()*10);
        System.out.println("Número Minimo: " + numMinimo);

//        com piso e teto (minimo 30 e maximo 40)
        Integer numMinimoMax = 30 + (int)(Math.random()*10);
        System.out.println("Número Minimo: " + numMinimoMax);

//        Usando classe Random
        Random numAleatorio = new Random();
        Integer i = numAleatorio.nextInt(11);
        System.out.println("Aleatório nextInt(): "+ i);

//        Usando o ThreadLocalRandom
        Integer thread = ThreadLocalRandom.current().nextInt(0,50);
        System.out.println("Aleatório ThreadLocalRandom: "+ thread);

        Double threadDouble = ThreadLocalRandom.current().nextDouble(0,50);
        System.out.printf("Aleatório Double ThreadLocalRandom: %.2f", threadDouble);

    }
}
