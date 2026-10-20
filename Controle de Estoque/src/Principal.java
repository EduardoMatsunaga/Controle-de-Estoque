import javax.swing.JOptionPane;
public class Principal {
	public static void main (String args []) {
		Produtos [] produtos = new Produtos [8];
		Metodos m = new Metodos ();
		int i;
		for (i=0;i<8;i++) {
			produtos [i] = new Produtos();
		}
		int opc = 0;
		while (opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Controle de estoque da loja\n 1-Cadastro de Produtos\n" 
					+ "2-Consulta por faixa de preço\n 3-Consulta por estoque (maior e menor)\n 4-Valor total em estoque\n"
					+ "5-Buscar por codigo\n 9-Fim do programa"));
			switch (opc) {
				case 1: m.FCadastraProduto(produtos);
				break;
				
				case 2: m.PFaixaPreco(produtos);
				break;
				
				case 3: m.PConsultaEstoque(produtos);
				break;
				
				case 4: m.PValorTotal(produtos);
				break;
				
				case 5: m.PBuscaCodigo(produtos);
				break;
				
				case 9: JOptionPane.showMessageDialog(null, "Programa foi finalizado!");
				break;
				
				default: JOptionPane.showMessageDialog(null, "Opção Invalida");
			}
		}
	}
}
