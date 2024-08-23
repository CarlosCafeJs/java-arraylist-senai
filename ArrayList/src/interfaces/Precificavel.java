public interface Precificavel {
  int getId();

  void setId(int id);

  String getNome();

  void setNome(String nome);

  Double getPreco();

  void setPreco(Double preco);

  int getQuantidade();

  void setQuantidade(int quantidade);

  String getCategoria();

  void setCategoria(String categoria);

  String getMarca();

  void setMarca(String marca);

  String getDescricao();

  void setDescricao(String descricao);

  String getDataDeValidade();

  void setDataDeValidade(String dataDeValidade);

  String getPeso();

  void setPeso(String peso);

  String getTipo();

  void setTipo(String tipo);

  double calcularDesconto(double percentual);

  boolean verificarEstoque();

  void aplicarPromocao(String descricaoPromocao);
}
