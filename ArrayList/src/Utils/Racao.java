package Utils;

import entities.Produto;

public class Racao extends Produto {
  public Racao(int id, String nome, Double preco, int quantidade, String categoria, String marca, String descricao,
      String dataDeValidade, String peso, String tipo) {
    super(id, nome, preco, quantidade, categoria, marca, descricao, dataDeValidade, peso, tipo);
  }
}
