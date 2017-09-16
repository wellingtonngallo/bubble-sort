package br.com.univille.pkg;

import java.util.List;

public class OrdenarPorNome implements Ordenacao{
	
	@Override
	public void ordenarDescrecente(List<Produto> produtos) {
		
		Produto aux;
		
		for(int i =0; i < produtos.size(); i++){
			for(int j =0; j < produtos.size(); j++){
				if(produtos.get(i).getNome().compareTo(produtos.get(j).getNome()) > 0){
					
					aux = produtos.get(i);
					produtos.set(i, produtos.get(j));
					produtos.set(j, aux);
				}
			}
		}
	}

	@Override
	public void ordenarCrescente(List<Produto> produtos) {
		
		Produto aux;
		
		for(int i =0; i < produtos.size(); i++){
			for(int j =0; j < produtos.size(); j++){
				if(produtos.get(i).getNome().compareTo(produtos.get(j).getNome()) < 0){
					
					aux = produtos.get(i);
					produtos.set(i, produtos.get(j));
					produtos.set(j, aux);
				}
			}
		}
	}

}
