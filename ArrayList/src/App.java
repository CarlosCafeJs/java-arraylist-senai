import java.util.ArrayList;
import java.util.List;

// import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> carrinho = new ArrayList<>();
        Produto produto = new Produto();

        carrinho.add(new Racao(1, "Ração Pedigree", 49.50, 1500, "Alimento", "Pedigree", "Melhor ração do mercado.",
                "01/01/2025", "20kg", "Geral"));
        carrinho.add(new Petisco(2, "Biscoito para Cães", 19.90, 500, "Petisco", "Dog's Best", "Delicioso e saudável.",
                "01/05/2024", "500g", "Cães"));
        carrinho.add(new Acessorio(3, "Coleira de Nylon", 29.90, 200, "Acessório", "PetSafe", "Resistente e ajustável.",
                "N/A", "50g", "Geral"));
        carrinho.add(new Higiene(4, "Shampoo para Cães", 24.90, 300, "Higiene", "PetClean",
                "Hipoalergênico e perfumado.", "01/09/2024", "500ml", "Cães"));
        carrinho.add(new Medicamento(5, "Vermífugo para Gatos", 39.90, 100, "Medicamento", "VetCare",
                "Eficaz contra vermes.", "01/11/2024", "20ml", "Gatos"));
        carrinho.add(new Equipamento(6, "Aquário Completo", 299.90, 50, "Equipamento", "AquaWorld",
                "Ideal para peixes de pequeno porte.", "N/A", "5kg", "Peixes"));
        carrinho.add(new AlimentoEspecial(7, "Ração para Peixes Ornamentais", 14.90, 200, "Alimento Especial",
                "FishFood", "Rica em nutrientes.", "01/07/2025", "100g", "Peixes"));
        carrinho.add(new AreiaSanitaria(8, "Areia Sanitária para Gatos", 34.90, 250, "Higiene", "CatLitter",
                "Controle de odores e absorção superior.", "01/12/2024", "5kg", "Gatos"));
        carrinho.add(new Escova(9, "Escova de Cerdas", 15.90, 100, "Higiene", "PetBrush",
                "Ideal para escovar pelos longos.", "N/A", "200g", "Geral"));
        carrinho.add(new RoupasParaPets(10, "Jaqueta para Cachorros", 69.90, 150, "Acessório", "WarmPaws",
                "Resistente à água e confortável.", "N/A", "300g", "Cães"));
        carrinho.add(new Arranhador(11, "Arranhador de Sisal", 89.90, 80, "Acessório", "CatScratcher",
                "Ideal para gatos, evita arranhões nos móveis.", "N/A", "1kg", "Gatos"));
        carrinho.add(new CaixaDeTransporte(12, "Caixa de Transporte para Pets", 129.90, 60, "Equipamento", "SafeTravel",
                "Resistente e confortável para viagens.", "N/A", "2kg", "Geral"));
        carrinho.add(new FonteDeAgua(13, "Fonte de Água para Pets", 99.90, 70, "Equipamento", "FreshFlow",
                "Filtra e mantém a água fresca.", "N/A", "800g", "Geral"));
        carrinho.add(new BrinquedoCachorro(14, "Brinquedo de Borracha para Cães", 25.90, 150, "Brinquedo", "DogFun",
                "Resistente e ideal para mastigação.", "N/A", "150g", "Cães"));
        carrinho.add(new BrinquedoGato(15, "Brinquedo com Catnip para Gatos", 19.90, 200, "Brinquedo", "CatJoy",
                "Estimulante e divertido para gatos.", "N/A", "50g", "Gatos"));
        carrinho.add(new ComedouroAutomatizado(16, "Comedouro Automatizado", 159.90, 40, "Equipamento", "AutoFeeder",
                "Programável para refeições regulares.", "N/A", "1.2kg", "Geral"));
        carrinho.add(new Bebedouro(17, "Bebedouro de Alumínio", 39.90, 120, "Acessório", "PetWater",
                "Durável e fácil de limpar.", "N/A", "400g", "Geral"));
        carrinho.add(new MantaParaPets(18, "Manta Aconchegante para Pets", 49.90, 90, "Acessório", "PetBlanket",
                "Quente e confortável.", "N/A", "500g", "Geral"));
        carrinho.add(new TapeteHigienico(19, "Tapete Higiênico para Cães", 29.90, 300, "Higiene", "DogPad",
                "Absorve e controla odores.", "01/06/2024", "20 unidades", "Cães"));
        carrinho.add(new BolsaDeTransporte(20, "Bolsa de Transporte para Gatos", 89.90, 75, "Equipamento", "CatCarrier",
                "Compacta e prática para transporte.", "N/A", "600g", "Gatos"));
        carrinho.add(new CortadorDeUnhas(21, "Cortador de Unhas para Pets", 22.90, 150, "Higiene", "PetClaw",
                "Fácil e seguro para usar.", "N/A", "100g", "Geral"));
        carrinho.add(new AdesivoAntipulgas(22, "Adesivo Antipulgas", 19.90, 200, "Medicamento", "FleaGuard",
                "Protege contra pulgas e carrapatos.", "01/08/2024", "1 unidade", "Geral"));
        carrinho.add(new TrituradorDeRacao(23, "Triturador de Ração", 139.90, 50, "Equipamento", "GrainCrusher",
                "Para triturar ração e outros alimentos.", "N/A", "2kg", "Geral"));
        carrinho.add(new Antipulgas(24, "Antipulgas em Spray", 29.90, 100, "Medicamento", "FleaSpray",
                "Elimina pulgas e carrapatos.", "01/10/2024", "250ml", "Geral"));
        carrinho.add(new Vitaminas(25, "Vitaminas para Cães", 44.90, 150, "Medicamento", "PetVitamins",
                "Suplemento para saúde e vitalidade.", "01/07/2025", "100g", "Cães"));

        for (Produto produto : carrinho) {
            System.out.println(produto);
            System.out.println("-------------------------");
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