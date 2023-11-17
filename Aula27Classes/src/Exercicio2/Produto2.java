package Exercicio2;

public class Produto2 {
	private String marca;
	private String	modelo;
	private double preco;
	private Categoria categoria;
	
	public Produto2() {}
	
	public Produto2(String marca, String modelo, double preco, Categoria categoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
