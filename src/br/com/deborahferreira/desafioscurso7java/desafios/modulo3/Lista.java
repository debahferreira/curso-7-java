package br.com.deborahferreira.desafioscurso7java.desafios.modulo3;

import br.com.deborahferreira.desafioscurso7java.desafios.modulo2.Produto;
import br.com.deborahferreira.desafioscurso7java.desafios.modulo4.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> listaDeCores = new ArrayList<>();
        listaDeCores.add("Rosa");
        listaDeCores.add("Azul");
        listaDeCores.add("Laranja");
        listaDeCores.add("Amarelo");

        for (String cor : listaDeCores) {
            System.out.println(cor);
        }
        listaDeCores.forEach(cor -> System.out.println(cor));

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("caneca", 50, 4);
        Produto produto2 = new Produto("gloss labial", 35, 2);
        Produto produto3 = new Produto("agenda", 70, 1);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto.getPreco() + " reais");
        }
        double somaPrecos = 0;
        for (Produto produto : listaDeProdutos) {
            somaPrecos += produto.getPreco();
        }
        double mediaPrecos = somaPrecos / listaDeProdutos.size();
        System.out.println("A média de preços é " + mediaPrecos);

        Circulo circulo1 = new Circulo(3);
        Quadrado quadrado1 = new Quadrado(3);
        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo1);
        listaDeFormas.add(quadrado1);
        for (Forma forma : listaDeFormas) {
            System.out.println("A área do " + forma.toString() + " é " + forma.calcularArea());
        }

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        ContaBancaria conta1 = new ContaBancaria(1001, 100);
        ContaBancaria conta2 = new ContaBancaria(1002, 520);
        ContaBancaria conta3 = new ContaBancaria(1003, 3200);
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        ContaBancaria contaMaiorSaldo = listaDeContas.getFirst();
        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("A conta de maior saldo é " + contaMaiorSaldo.getNumeroDaConta() + ", com saldo de " + contaMaiorSaldo.getSaldo());

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ariana Grande");
        buscaPorArtista.add("Teto");
        buscaPorArtista.add("Harry Styles");
        buscaPorArtista.add("Niall Horan");
        System.out.println(buscaPorArtista);
        //IMPORTANTE
        Collections.sort(buscaPorArtista);
        System.out.println("Depois do ordenamento:");
        System.out.println(buscaPorArtista);

        List<Integer> listaDeInteiros = new ArrayList<>();
        listaDeInteiros.add(1);
        listaDeInteiros.add(55);
        listaDeInteiros.add(32);
        listaDeInteiros.add(18);
        System.out.println(listaDeInteiros);
        Collections.sort(listaDeInteiros);
        System.out.println("Ordenados em ordem crescente:");
        System.out.println(listaDeInteiros);

        Titulo titulo1 = new Titulo("A Pequena Sereia", 2023);
        Titulo titulo2 = new Titulo("Rapunzel", 2016);
        Titulo titulo3 = new Titulo("A Bela e a Fera", 2019);

        List<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        System.out.println(listaDeTitulos);
        Collections.sort(listaDeTitulos);
        System.out.println("Depois da ordenação:");
        System.out.println(listaDeTitulos);
        //IMPORTANTE
        listaDeTitulos.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano:");
        System.out.println(listaDeTitulos);
    }
}
