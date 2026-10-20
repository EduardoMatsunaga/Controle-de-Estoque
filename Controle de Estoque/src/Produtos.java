public class Produtos {
	int cod_produto;
	String nome_produto;
	double preco;
	int qtdEstoque;
	
	Produtos () {
		this (0,"",0.0,0);
	}
	
	Produtos (int codigo, String nome, double valor, int estoque) {
		cod_produto = codigo;
		nome_produto = nome;
		preco = valor;
		qtdEstoque = estoque;
	}
}
