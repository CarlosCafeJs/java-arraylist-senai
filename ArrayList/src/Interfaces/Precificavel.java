package Interfaces;

public interface Precificavel {
  String getNome();

  void setNome(String nome);

  String getDescricao();

  void setDescricao(String descricao);

  Double getPreco();

  void setPreco(Double preco);

  int getQuantidadeEstoque();

  void setQuantidadeEstoque(int quantidadeEstoque);

  String getCategoria();

  void setCategoria(String categoria);

  boolean isDisponivel();

  void setDisponivel(boolean disponivel);

  Double getPeso();

  void setPeso(Double peso);

  String getMarca();

  void setMarca(String marca);

  String getEspecie();

  void setEspecie(String especie);

  String getDataDeValidade();

  void setDataDeValidade(String dataDeValidade);

}
