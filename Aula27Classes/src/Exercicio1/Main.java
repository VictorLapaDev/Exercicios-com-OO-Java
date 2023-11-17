package Exercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidades de produtos que deseja inserir:"));
		
		for(int i = 0; i < quant; i++) {
			String marca = JOptionPane.showInputDialog("Agora insira o "+ (i+1) +"º produto\n Insira a Marca:");
			String modelo = JOptionPane.showInputDialog("Digite o modelo do produto: ");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
			Produto novoProd = new Produto(marca, modelo, preco);
			listaProdutos.add(novoProd);
		}
		
		String exibir = "";
		for(Produto prod : listaProdutos) {
			exibir += "Produto: \nMarca: "+prod.getMarca()+"\nModelo: "+prod.getModelo()+"\nPreço: "+prod.getPreco()+"\n\n";
		}
		JOptionPane.showInternalMessageDialog(null, exibir);
	}

}
