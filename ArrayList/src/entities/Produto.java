

public abstract class Produto implements Precificavel {
  private int id;
  private String nome;
  private Double preco;
  private int quantidade;
  private String categoria;
  private String marca;
  private String descricao;
  private String dataDeValidade;
  private String peso;
  private String tipo;

  public Produto(int id, String nome, Double preco, int quantidade, String categoria, String marca, String descricao,
      String dataDeValidade, String peso, String tipo) {
    this.id = id;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
    this.categoria = categoria;
    this.marca = marca;
    this.descricao = descricao;
    this.dataDeValidade = dataDeValidade;
    this.peso = peso;
    this.tipo = tipo;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String getNome() {
    return nome;
  }

  @Override
  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public Double getPreco() {
    return preco;
  }

  @Override
  public void setPreco(Double preco) {
    this.preco = preco;
  }

  @Override
  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public String getCategoria() {
    return categoria;
  }

  @Override
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  @Override
  public String getMarca() {
    return marca;
  }

  @Override
  public void setMarca(String marca) {
    this.marca = marca;
  }

  @Override
  public String getDescricao() {
    return descricao;
  }

  @Override
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String getDataDeValidade() {
    return dataDeValidade;
  }

  @Override
  public void setDataDeValidade(String dataDeValidade) {
    this.dataDeValidade = dataDeValidade;
  }

  @Override
  public String getPeso() {
    return peso;
  }

  @Override
  public void setPeso(String peso) {
    this.peso = peso;
  }

  @Override
  public String getTipo() {
    return tipo;
  }

  @Override
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public double calcularDesconto(double percentual) {
    return preco - (preco * percentual / 100);
  }

  @Override
  public boolean verificarEstoque() {
    return quantidade > 0;
  }

  @Override
  public void aplicarPromocao(String descricaoPromocao) {
    this.descricao += " - Promoção: " + descricaoPromocao;
  }

  @Override
  public String toString() {
    return "Produto{" +
        "id=" + id +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        ", categoria='" + categoria + '\'' +
        ", marca='" + marca + '\'' +
        ", descricao='" + descricao + '\'' +
        ", dataDeValidade='" + dataDeValidade + '\'' +
        ", peso='" + peso + '\'' +
        ", tipo='" + tipo + '\'' +
        '}';
  }
}
