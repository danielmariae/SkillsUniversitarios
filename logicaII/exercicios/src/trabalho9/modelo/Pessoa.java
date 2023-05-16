package trabalho9.modelo;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pessoa implements Impressao {
    private String nome;
    private int idade;
    private Telefone telefone;
    private Sexo sexo;

    public static void main(String[] args) {

    }


//    QUESTÃO 05:

//    public static void imprimirListaOrdenadaPorNome(List<Pessoa> lista){
//        lista.sort(new Comparator<Pessoa>() {
//            @Override
//            public int compare(Pessoa o1, Pessoa o2) {
//                return o1.getNome().compareTo(o2.getNome());
//            }
//        });
//        imprimirLista(lista);
//
//    }
//
//    public static void imprimirListaOrdenadaPorIdade(List<Pessoa> lista){
//        lista.sort(new Comparator<Pessoa>() {
//            @Override
//            public int compare(Pessoa o1, Pessoa o2) {
//                if (o1.getIdade() < o2.getIdade())
//                    return -1;
//                else if (o1.getIdade() == o2.getIdade())
//                    return 0;
//                else
//                    return 1;
//            }
//        });
//        imprimirLista(lista);
//    }
//
//    public static void imprimirListaOrdenadaPorSexo(List<Pessoa> lista){
//        lista.sort(new Comparator<Pessoa>() {
//            @Override
//            public int compare(Pessoa o1, Pessoa o2) {
//                return o1.getSexo().compareTo(o2.getSexo());
//            }
//        });
//        imprimirLista(lista);
//    }
    public Pessoa(String nome, int idade, String codigoArea, String numero, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = new Telefone(codigoArea, numero);
        this.sexo = Sexo.valueOf(sexo.toUpperCase());
    }

    public Pessoa() {
    }

    public static Pessoa lerDados(Scanner sc){
        Pessoa p = new Pessoa();
        System.out.print("Nome: ");
        p.setNome(sc.next());
        System.out.print("Idade: ");
        p.setIdade(sc.nextInt());
        System.out.println("Telefone:\n[Digite o codigo postal e após o número]");
        p.setTelefone(new Telefone(sc.next(), sc.next()));
        System.out.print("Sexo: ");
        p.setSexo(Sexo.valueOf(sc.next().toUpperCase()));
        return p;
    }

    public static void imprimirLista(List<Pessoa> lista){
        for (Pessoa pessoa : lista) {
            pessoa.imprimir();
            System.out.println();
        }
    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println(telefone.toString());
        System.out.println("Sexo: "+sexo);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Telefone getTelefone() {
        return telefone;
    }
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone=" + telefone +
                ", sexo=" + sexo +
                '}';
    }
}
