package Exercicio1;

public class Produto {

	private String marca;
	private String modelo;
	private double preco;
	
	public Produto() { }
	
	public Produto(String marca, String modelo, double preco) {
		this.marca 	= marca;
		this.modelo = modelo;
		this.preco 	= preco;
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
	
	
}
