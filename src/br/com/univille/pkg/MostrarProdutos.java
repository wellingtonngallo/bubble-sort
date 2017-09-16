package br.com.univille.pkg;

import java.util.ArrayList;
import java.util.List;

public class MostrarProdutos {
	
	public static void main(String[] args) {
		
		List<Produto> listarProdutos = new ArrayList<Produto>();
		
		OrdenarPorNome o = new OrdenarPorNome();
		OrdenarPeloPreco p = new OrdenarPeloPreco();
		
		listarProdutos.add(new Produto("Computador", 50.000));
		listarProdutos.add(new Produto("Bandeira", 30.000));
		listarProdutos.add(new Produto("Geladeira", 40.000));
		listarProdutos.add(new Produto("Feijao", 60.000));
		
		o.ordenarCrescente(listarProdutos);
		p.ordenarCrescente(listarProdutos);
		
		for(Produto produto : listarProdutos){
			System.out.println(produto);
		}
	}
}
