package Exercicio2;

import java.util.*;
import javax.swing.*;

public class Main2 {

	public static void main(String[] args) {
		
		ArrayList<Categoria> listaCateg = new ArrayList<Categoria>();
		ArrayList<Produto2> listaProd = new ArrayList<Produto2>();
		
		do{
			int option = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das seguintes opções:"
					+ "\n1- Adicionar categoria"
					+ "\n2- Adicionar produto"
					+ "\n3- Listar categorias"
					+ "\n4- Listar produtos"
					+ "\n5- Sair"));
			
			String exibir = "";
			String categExibir = "";
			
			switch(option) {
			//adicionar categoria
			case 1:
				
				String nome = JOptionPane.showInputDialog("Digite o nome da categoria:");
				Categoria novaCateg = new Categoria(nome);
				listaCateg.add(novaCateg);
				
				break;
			//Adicionar produto
			case 2:
				//Se nao tem categoria ele pede para colocar uma
				if(listaCateg.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null, "Por favor adicionar uma categoria primeiro!");
				}
				else {
					
					String marca = JOptionPane.showInputDialog("Adicione a marca do produto: ");
					String modelo = JOptionPane.showInputDialog("Adicione o modelo do produto: ");
					double preco = Double.parseDouble(JOptionPane.showInputDialog("Adicione o preço do produto: "));
					
					//Montando uma String para mostrar as opções de categoria
					
					for(int i = 0; i < listaCateg.size(); i++) {
						categExibir += "Nome da " +(i+1)+"º categoria: "+listaCateg.get(i).getNome()+"\n";
					}
					//escolhendo a opção	
					int optionCateg = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das categorias a seguir inserindo seu número: \n" + categExibir));
					optionCateg --;
					
					Produto2 newProd = new Produto2(marca, modelo, preco, listaCateg.get(optionCateg));
					listaProd.add(newProd);
				}
				break;
			//Listar categoria
			case 3:
				
				for(Categoria cat : listaCateg) {
					exibir += "Categoria: "+cat.getNome()+"\n";
				}
				JOptionPane.showInternalMessageDialog(null, exibir);
				
				break;
			//Listar produtos
			case 4:
				
				for(Produto2 prod : listaProd) {
					exibir += "Marca: "+ prod.getMarca()+ " --> Modelo: "+prod.getModelo() +" --> Preço: "+prod.getPreco()+" --> Categoria: "+prod.getCategoria().getNome()+"\n";
				}
				JOptionPane.showInternalMessageDialog(null, exibir);
				
				break;
				//sair
			case 5:
				
				JOptionPane.showInternalMessageDialog(null, "Obrigado por escolher nossa ajuda :) ");
				System.exit(0);
				
				break;
				
			//Opção invalida
			default:
				
				JOptionPane.showInternalMessageDialog(null, "Opção inválida!!! Tente de novo");
				
				break;
			}
		}while(true);
	}

}
