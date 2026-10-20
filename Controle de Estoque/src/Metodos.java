import javax.swing.JOptionPane;
public class Metodos {
	public Produtos [] FCadastraProduto (Produtos [] produtos) {
		int i;
		for (i=0;i<8;i++) {
			produtos[i].cod_produto = Integer.parseInt((JOptionPane.showInputDialog("Digite o codigo do produto " + (i+1)+":")));
			produtos[i].nome_produto = JOptionPane.showInputDialog("Digite o nome do produto: ");
			produtos[i].preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
			produtos[i].qtdEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque: "));
		}
		return produtos;
	}
	
	public void PFaixaPreco(Produtos [] produtos) {
		int i;
		int qtd = 0;
		for (i=0;i<8;i++) {
			if (produtos[i].preco > 50 && produtos[i].preco < 200) {
				System.out.println(produtos[i].cod_produto + " " + produtos[i].nome_produto + " | Preço: " + produtos[i].preco + " | Qtd: " + produtos[i].qtdEstoque);
				qtd +=1;
			}
		}
		if (qtd == 0) {
			System.out.println("Nenhum produto foi cadastrado na faixa de 50 a 200 reais");
		}
	}
	
	public void PConsultaEstoque (Produtos [] produtos) {
		int i, menor, maior;
		maior = 0;
		menor = 0;
		for(i=0;i<8;i++) {
			if (produtos[i].qtdEstoque > produtos[maior].qtdEstoque) {
				maior = i;
			}
			else if (produtos[i].qtdEstoque < produtos[menor].qtdEstoque) {
				menor = i;
			}
		}
		System.out.println("Maior: " + produtos[maior].cod_produto + " " + produtos[maior].nome_produto + " estoque: " + produtos[maior].qtdEstoque);
		System.out.println("Menor: " + produtos[menor].cod_produto + " " + produtos[menor].nome_produto + " estoque: " + produtos[menor].qtdEstoque);
	}
	
	public void PValorTotal (Produtos [] produtos) {
		int i;
		double total = 0;
		double valor;
		for (i=0;i<8;i++) {
			valor = produtos[i].preco * produtos[i].qtdEstoque;
			System.out.println(produtos[i].cod_produto + " " + produtos[i].nome_produto + " | Preço: " + produtos[i].preco + " | Qtd: " + produtos[i].qtdEstoque + " | Valor em estoque: " + valor);
			total +=valor;
		}
		System.out.println("Valor total em estoque: " + total);
	}
	
	public void PBuscaCodigo (Produtos [] produtos) {
		int i, achou, codigo;
		achou = 0;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
		for (i=0;i<8;i++) {
			if (produtos[i].cod_produto == codigo) {
				System.out.println(produtos[i].cod_produto + " " + produtos[i].nome_produto + " | Preço: " + produtos[i].preco + " | Qtd: " + produtos[i].qtdEstoque);
				achou = 1;
			}
		}
		if (achou == 0) {
			System.out.println("Produto não encontrado");
		}
	}
}
