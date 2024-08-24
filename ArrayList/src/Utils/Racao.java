package Utils;

import Produtos.Produto;

public class Racao extends Produto {

  public Racao(String nome, Double preco, String categoria, String marca, int quantidadeEstoque,
      String descricao,
      String dataValidade, Double peso, String especie, boolean disponivel) {

    super(nome, preco, categoria, marca, quantidadeEstoque, descricao, dataValidade, peso, especie, disponivel);
  }

  // Produto produto = new Produto();

  // public Racao(String nome, Double preco, String categoria, String marca, int
  // quantidadeEstoque,
  // String descricao,
  // String dataValidade, Double peso, String especie, boolean disponivel) {

  // }
}
