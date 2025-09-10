package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Mickey");
        lista.add("Pateta");
        lista.add("Minnie");
        lista.add("Pluto");
        System.out.println("Tamanho da lista: " + lista.size());

        // Exibir a lista usando for aprimorado
        System.out.println("\nExibindo com for aprimorado:");
        for(String nome :lista){
            System.out.println(nome);
        }

        //Exibir a lista usando for normal
        System.out.println("\nExibindo com for normal:");
        for (int i = 0; i < lista.size(); i++ ){
            System.out.println(lista.get(i));
        }

        //Exibir a lista sem usar for
        System.out.println("\nExibindo sem for:");
        System.out.println(lista);

        // Adicionando onde eu quero
        lista.add(0, "Disney");
        System.out.println("\nExibindo pos adicionar:");
        System.out.println(lista);

        // Removendo da lista com nome
        lista.remove("Mickey");
        System.out.println("\nExibindo pos remoção do mickey:");
        System.out.println(lista);

        // Removendo por index
        lista.remove(0);
        System.out.println("\nExibindo pos remoção do index 0:");
        System.out.println(lista);
        // Verificando de a lista te um determinado valor
        System.out.println("\nPateta está na lista? " + lista.contains("Pateta"));

        // Verificando se a lista está vazia
        System.out.println("\nLista está vazia? " + lista.isEmpty());

        // Obtendo o inice de um valor na lista
        System.out.println("\nIndice do Pluto " + lista.indexOf("Pluto"));

        //Usando o metodo set
        lista.set(1, "Mickey");
        System.out.println("\nExibindo pos o set:");
        System.out.println(lista);

        // Lista que aceita tudo
        List<Object> listaLoka = new ArrayList<>();
        listaLoka.add(100);
        listaLoka.add("Renan");
        listaLoka.add(16.10);
        listaLoka.add(false);
        System.out.println("\nLista Louca:");
        System.out.println(listaLoka);
    }
}
