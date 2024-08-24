import java.util.ArrayList;
import java.util.List;

import Produtos.Produto;
// import java.util.Scanner; 
import Utils.Racao;

public class App {
        public static void main(String[] args) throws Exception {
                // List<Produtos> carrinho = new ArrayList<>();

                List<Racao> itens = new ArrayList<>();
                itens.add(new Racao("Racao Pedigree", 48.00, "Alimento", "Pedigree", 500,
                                "Alimento saudavel e nutritivo.",
                                "05/2025", 20.00, "Cachorro", true));

                itens.add(new Racao("Racao Deal", 50.00, "Alimento", "Deal", 750,
                                "Alimento saudavel e nutritivo.",
                                "05/2025", 30.00, "Cachorro", true));

                for (Racao produto : itens) {
                        System.out.println("Produto: " + produto.getNome() +
                                        ", Preço: " + produto.getPreco() +
                                        ", Categoria: " + produto.getCategoria() +
                                        ", Marca: " + produto.getMarca() +
                                        ", Quantidade em Estoque: " + produto.getQuantidadeEstoque() +
                                        ", Descrição: " + produto.getDescricao() +
                                        ", Data de Validade: " + produto.getDataDeValidade() +
                                        ", Peso: " + produto.getPeso() +
                                        ", Espécie: " + produto.getEspecie() +
                                        ", Disponível: " + produto.isDisponivel());
                }

        }
}

// / Interface para definir métodos relacionados a preços
// import java.util.ArrayList; // Importa a classe ArrayList uma biblioteca, que
// é usada para criar listas dinâmicas de elementos.
// import java.util.List; // Importa a interface List uma biblioteca, que define
// métodos para manipulação de listas.
// import java.util.Scanner; // Importa a classe Scanner uma biblioteca, que é
// usada para ler entradas do usuário, como texto e números.

// // Interface que define métodos para receber o preço e o nome de um produto
// da padaria
// interface Precificavel {
// double getPreco();
// String getNome();
// }

// // Classe abstrata que implementa a interface Precificavel
// abstract class Produto implements Precificavel {
// private String nome; // Nome do produto
// private double preco; // Preço do produto

// Construtor que inicializa nome e preço do produto
// public Produto(String nome, double preco) {
// this.nome = nome;
// this.preco = preco;
// }

// Implementação do método da interface para retornar o preço do produto

// public double getPreco() {
// return preco;
// }

// // Implementação do método da interface para retornar o nome do produto

// public String getNome() {
// return nome;
// }
// }

// Classe que representa um Pão de Sal, herdando pelo `extends` as
// características de Produto
// class PaoDeSal extends Produto {
// public PaoDeSal() {
// super("Pão de Sal", 0.50); // Evoca o construtor da classe Produto com nome e
// preço
// }
// }

// // Classe que representa um Pão de Queijo, herdando `extends` as
// características
// // de Produto
// class PaoDeQueijo extends Produto {
// public PaoDeQueijo() {
// super("Pão de Queijo", 1.00);
// }
// }

// // Classe que representa um Biscoito Doce, herdando `extends` as
// características
// // de Produto
// class BiscoitoDoce extends Produto {
// public BiscoitoDoce() {
// super("Biscoito Doce", 1.50);
// }
// }

// // Classe que representa um Biscoito Salgado, herdando `extends` as
// // características de Produto
// class BiscoitoSalgado extends Produto {
// public BiscoitoSalgado() {
// super("Biscoito Salgado", 1.50);
// }
// }

// // Classe que representa uma Tortelete, herdando `extends` as características
// de
// // Produto
// class Tortelete extends Produto {
// public Tortelete() {
// super("Tortelete", 2.50);
// }
// }

// // Classe que representa um Bolo de Aniversário, herdando `extends` as
// // características de Produto
// class BoloDeAniversario extends Produto {
// public BoloDeAniversario() {
// super("Bolo de Aniversário", 40.00);
// }
// }

// // Classe que representa uma Pizza, herdando `extends` as características de
// // Produto
// class Pizza extends Produto {
// public Pizza() {
// super("Pizza", 30.00);
// }
// }

// // Classe que representa um Salgado para Festa, herdando `extends` as
// // características de Produto
// class SalgadoParaFesta extends Produto {
// public SalgadoParaFesta() {
// super("Salgado para Festa", 20.00);
// }
// }

// // Classe que representa um Café Expresso, herdando `extends` as
// características
// // de Produto
// class CafeExpresso extends Produto {
// public CafeExpresso() {
// super("Café Expresso", 3.00);
// }
// }

// Classe que representa um Café com Leite, herdando `extends` as
// características de Produto
// class CafeComLeite extends Produto {
// public CafeComLeite() {
// super("Café com Leite", 3.50);
// }
// }

// // Classe que representa um Leite Quente, herdando `extends` as
// características
// // de Produto
// class LeiteQuente extends Produto {
// public LeiteQuente() {
// super("Leite Quente", 2.50);
// }
// }

// // Classe que representa um Suco, herdando `extends` as características de
// // Produto
// class Suco extends Produto {
// public Suco() {
// super("Suco", 4.00);
// }
// }

// // Classe que representa um Refrigerante, herdando `extends` as
// características
// // de Produto
// class Refrigerante extends Produto {
// public Refrigerante() {
// super("Refrigerante", 5.00);
// }
// }

// Classe principal onde a lógica do programa é executada
// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in); // Cria um scanner para leitura da
// entrada do usuário
// Lista para armazenar os produtos escolhidos pelo usuário
// double total = 0.0; // Variável para armazenar o valor total do pedido

// // Exibe as opções de produtos disponíveis
// System.out.println(
// "Bem-vindo à Padaria Pão do Ceu! Selecione os itens de sua preferência e
// adicione ao seu pedido:");
// System.out.println("1. Pão de Sal");
// System.out.println("2. Pão de Queijo");
// System.out.println("3. Biscoito Doce");
// System.out.println("4. Biscoito Salgado");
// System.out.println("5. Tortelete");
// System.out.println("6. Bolo de Aniversário");
// System.out.println("7. Pizza");
// System.out.println("8. Salgado para Festa");
// System.out.println("9. Café Expresso");
// System.out.println("10. Café com Leite");
// System.out.println("11. Leite Quente");
// System.out.println("12. Suco");
// System.out.println("13. Refrigerante");
// System.out.println("0. Finalizar pedido");

// while (true) { // Loop para permitir que o usuário adicione vários produtos
// ao pedido
// System.out.print("Escolha um ou mais itens: ");
// int escolha = scanner.nextInt(); // Lê a escolha do usuário

// if (escolha == 0)
// break; // Se o usuário digitar 0, o loop é encerrado

// Produto produtoEscolhido = null; // Inicializa a variável para o produto
// escolhido
// switch (escolha) {
// case 1:
// produtoEscolhido = new PaoDeSal();
// break; // Se o usuário escolher 1, adiciona Pão de Sal
// case 2:
// produtoEscolhido = new PaoDeQueijo();
// break; // Se o usuário escolher 2, adiciona Pão de Queijo
// case 3:
// produtoEscolhido = new BiscoitoDoce();
// break; // Se o usuário escolher 3, adiciona Biscoito Doce
// case 4:
// produtoEscolhido = new BiscoitoSalgado();
// break; // Se o usuário escolher 4, adiciona Biscoito Salgado
// case 5:
// produtoEscolhido = new Tortelete();
// break; // Se o usuário escolher 5, adiciona Tortelete
// case 6:
// produtoEscolhido = new BoloDeAniversario();
// break; // Se o usuário escolher 6, adiciona Bolo de Aniversário
// case 7:
// produtoEscolhido = new Pizza();
// break; // Se o usuário escolher 7, adiciona Pizza
// case 8:
// produtoEscolhido = new SalgadoParaFesta();
// break; // Se o usuário escolher 8, adiciona Salgado para Festa
// case 9:
// produtoEscolhido = new CafeExpresso();
// break; // Se o usuário escolher 9, adiciona Café Expresso
// case 10:
// produtoEscolhido = new CafeComLeite();
// break; // Se o usuário escolher 10, adiciona Café com Leite
// case 11:
// produtoEscolhido = new LeiteQuente();
// break; // Se o usuário escolher 11, adiciona Leite Quente
// case 12:
// produtoEscolhido = new Suco();
// break; // Se o usuário escolher 12, adiciona Suco
// case 13:
// produtoEscolhido = new Refrigerante();
// break; // Se o usuário escolher 13, adiciona Refrigerante
// default:
// System.out.println("Opção inválida, tente novamente."); // Se o usuário
// digitar algo inválido, exibe
// // uma mensagem de erro
// }

// if (produtoEscolhido != null) { // Se o produto for válido (não for nulo)
// carrinho.add(produtoEscolhido); // Adiciona o produto ao carrinho
// total += produtoEscolhido.getPreco(); // Adiciona o preço do produto ao total
// System.out.println(produtoEscolhido.getNome() + " adicionado ao carrinho.");
// // Confirma que o produto
// // foi adicionado
// }
// }

// // Exibe o resumo do pedido
// System.out.println("\nResumo do pedido:");
// for (Produto produto : carrinho) { // Itera sobre os produtos no carrinho
// System.out.println(produto.getNome() + " - R$ " + produto.getPreco()); //
// Exibe o nome e o preço de cada
// // produto
// }

// System.out.println("Total: R$ " + total); // Exibe o total do pedido
// scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
// }
// }

// OBS.LEMBREM QUE
// O USO
// DA SINTAXE FINAL....SCANNER.CLOSE()...NÁO É OBRIGATÓRIA,
// MAS FICA
// UM CÓDIGO POLIDO.LET`
// S BORA
// !