package Produtos;

import Interfaces.Precificavel;

public abstract class Produto implements Precificavel {
  private String nome;
  private Double preco;
  private String categoria;
  private String marca;
  private int quantidadeEstoque;
  private String descricao;
  private String dataDeValidade;
  private Double peso;
  private String especie;
  private boolean disponivel;

  public Produto(String nome, Double preco, String categoria, String marca, int quantidadeEstoque,
      String descricao,
      String dataValidade, Double peso, String especie, boolean disponivel) {

    this.nome = nome;
    this.preco = preco;
    this.categoria = categoria;
    this.marca = marca;
    this.quantidadeEstoque = quantidadeEstoque;
    this.descricao = descricao;
    this.dataDeValidade = dataDeValidade;
    this.peso = peso;
    this.especie = especie;
    this.disponivel = disponivel;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getQuantidadeEstoque() {
    return quantidadeEstoque;
  }

  public void setQuantidadeEstoque(int quantidadeEmEstoque) {
    this.quantidadeEstoque = quantidadeEmEstoque;
  }

  // Getter e Setter para descricao
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getDataDeValidade() {
    return dataDeValidade;
  }

  public void setDataDeValidade(String dataDeValidade) {
    this.dataDeValidade = dataDeValidade;
  }

  public Double getPeso() {
    return peso;
  }

  public void setPeso(Double peso) {
    this.peso = peso;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public boolean isDisponivel() {
    return disponivel;
  }

  public void setDisponivel(boolean especie) {
    this.disponivel = especie;
  }

}
