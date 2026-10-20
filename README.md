1) Classe abstrata 
CodigoProduto	      NomeProduto	      Preco	        QtdEstoque
int                    String	        double	          int
2) Classe Principal
MENU ESTOQUE
Controle de estoque da loja
1 - Cadastro de Produtos
2 - Consulta por faixa de preço
3 - Consulta por estoque (maior e menor)
4 - Valor total em estoque
5 - Busca por código
9 - Finaliza

Criar o vetor de 8 produtos, instanciar a classe de métodos e montar o menu.

3) Classe de Métodos

Todas as consultas exibem todos os campos: código, nome, preço e quantidade.

#	Método	                  Tipo                                              Descricao
1	FCadastraProduto	       função	                                     Cadastra os 8 registros
2	PFaixaPreco	           procedimento	                            Produtos com preço > 50 e < 200
3	PConsultaEstoque	     procedimento	                    Produto com maior e com menor quantidade em estoque
4	PValorTotal	           procedimento	             Valor em estoque de cada produto (preço × quantidade) e o total geral
5	PBuscaCodigo	         procedimento	               Pede um código e exibe o produto; se não existir, "Produto não encontrado"
