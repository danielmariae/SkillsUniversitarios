package trabalho9.aplicacao;
import trabalho9.modelo.Pessoa;
import trabalho9.modelo.Sexo;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Principal app = new Principal();
        app.executar();
    }

    private void executar() {
        Scanner scApp = new Scanner(System.in);
        List <Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("João Pedro", 18, "63", "99151515", "MASCULINO"));
        lista.add(new Pessoa("Mariana Silva", 30, "15", "00001515", "FEMININO"));
        lista.add(new Pessoa("Rosa Menezes", 19, "63", "00000000", "FEMININO"));

//        for (int i = 0; i < 5; i++) {
//            Pessoa novaPessoa = Pessoa.lerDados(scApp);
//            lista.add(novaPessoa);
//        }

        System.out.println("Lista apenas homens:");
        imprimirLista(lista, Sexo.MASCULINO);
        System.out.println();

        System.out.println("Lista por nome:");
//      Pessoa.imprimirListaOrdenadaPorNome(lista);
        lista.sort( (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        Pessoa.imprimirLista(lista);

        System.out.println("Lista por idade:");
//      Pessoa.imprimirListaOrdenadaPorIdade(lista);
        lista.sort(Comparator.comparingInt(Pessoa::getIdade));
        Pessoa.imprimirLista(lista);

        System.out.println("Lista por sexo:");
//      Pessoa.imprimirListaOrdenadaPorSexo(lista);
        lista.sort( (o1, o2) -> o1.getSexo().compareTo(o2.getSexo()));
        Pessoa.imprimirLista(lista);
    }
    public void imprimirLista(List<Pessoa> lista, Sexo sexo){
        for (Pessoa pessoa : lista) {
            if(pessoa.getSexo() == Sexo.MASCULINO)
                pessoa.imprimir();
        }
    }
}
