package lista;

import java.util.*;

public class AplicacaoMain {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(
                  Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> list2 = new ArrayList<>(
                  Arrays.asList( 2, 5));



        List<Integer> listaAgrupada
               = new ArrayList<Integer>();


        listaAgrupada.addAll(list1);
        listaAgrupada.addAll(list2);


        System.out.println("lista agrupada" + listaAgrupada);


        Set<Integer> listasemduplicado = new HashSet<>();
        listasemduplicado.addAll(listaAgrupada);

        System.out.println("listasemduplicado" +listasemduplicado);


        List listFinal = Arrays.asList(listasemduplicado.toArray());

      //  Collection<Lista> listas = new HashSet();
      // listas.add(new Lista(listFinal));

      //      ordenacao(listFinal);
      //  System.out.println("Resultado Final1: " +listFinal);

     //   Collections.sort(listFinal);
     //   System.out.println("Resultado Final2: " +listFinal);

        Collections.reverse(listFinal);

        System.out.println("Resultado Final: " +listFinal);






    }

    public static void ordenacao(List<Integer> listFinal) {
        Collections.sort(listFinal);
    }

}
