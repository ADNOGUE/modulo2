package lista;

import java.util.*;

public class AplicacaoMain {

    public static void main(String[] args) {

    //    ArrayList<Integer> list1 = new ArrayList<>(
    //              Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(5);

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);

       // ArrayList<Integer> list2 = new ArrayList<>(
      //          Arrays.asList( 2, 5));

        System.out.println(list2);


        List<Integer> listaAgrupada
               = new ArrayList<Integer>();


        listaAgrupada.addAll(list1);
        listaAgrupada.addAll(list2);

        Collections.sort(listaAgrupada);
        ordenacao(listaAgrupada);

        System.out.println("lista agrupada" + listaAgrupada);


        Collection<Lista> listaSemDuplicado = new HashSet();
        listaSemDuplicado.add(new Lista(list1));
        listaSemDuplicado.add(new Lista(list2));

        System.out.println("listasemduplicado" +listaSemDuplicado);



       List listFinal = Arrays.asList(listaSemDuplicado.toArray());
       // List list5 = new ArrayList(Integer.valueOf(listFinal.toString()));
       // ordenacao(listFinal);
     //  Collections.sort(listFinal);

        System.out.println(listFinal);
     //   System.out.println(list5);





    }

    public static void ordenacao(List<Integer> listFinal) {
        Collections.sort(listFinal);
    }

}
