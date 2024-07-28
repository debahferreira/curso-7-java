import br.com.deborahferreira.desafioscurso7java.desafios.modulo1.Pessoa;
import br.com.deborahferreira.desafioscurso7java.desafios.modulo2.Produto;
import br.com.deborahferreira.desafioscurso7java.desafios.modulo2.ProdutoPerecivel;
import br.com.deborahferreira.desafioscurso7java.desafios.modulo3.Animal;
import br.com.deborahferreira.desafioscurso7java.desafios.modulo3.Cachorro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Deborah", 19);
        System.out.println(pessoa1.toString());

        Pessoa pessoa2 = new Pessoa("Igor", 17);
        Pessoa pessoa3 = new Pessoa("Eliane", 62);
        Pessoa pessoa4 = new Pessoa("Marcelo", 68);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa4);

        System.out.println("O tamanho da lista é " + listaDePessoas.size());
        System.out.println("A primeira pessoa da lista é " + listaDePessoas.get(0));
        System.out.println(listaDePessoas);

        Produto produto1 = new Produto("caneca", 50, 4);
        Produto produto2 = new Produto("gloss labial", 35, 2);
        Produto produto3 = new Produto("agenda", 70, 1);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println(listaDeProdutos);
        System.out.println(listaDeProdutos.get(1));

        //importante
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

        //importante
        listaDeProdutos.forEach(produto -> System.out.println(produto));

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Lays", 9.50, 2, 2025);
        produtoPerecivel.exibirInformacoes();

        //importante: CASTING - Converte um objeto de uma subclasse para uma superclasse
        Animal animal1 = new Cachorro();
        if (animal1 instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal1;
            System.out.println(animal1.getClass());
        }
    }
}
