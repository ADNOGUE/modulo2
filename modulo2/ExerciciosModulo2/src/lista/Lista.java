package lista;

import java.util.List;
import java.util.Objects;

public class Lista implements Comparable<Lista> {

    private Integer numero;

    public Lista(List<Integer> listaAgrupada) {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lista lista = (Lista) o;
        return Objects.equals(numero, lista.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }


    @Override
    public int compareTo(Lista obj) {
     //   return obj.getNumero().compareTo(this.numero);
       return this.numero.compareTo(obj.getNumero());

    }
}
