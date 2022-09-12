package entidade;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalEmEstoque() {
		
		return preco*quantidade;
		
		
	}
	
	public void addProd(int quantidade) {
		this.quantidade += quantidade;
		
	}
	
	
	public void removeProd(int quatidade) {
		this.quantidade -= quatidade;
		
	}
	
	public String toString() {
		return nome
				+", $ "
				+ String.format("%.2f", preco) //numero de casas decimais
				+", "
				+quantidade
				+" unidades , total : $"
				+String.format("%.2f",totalEmEstoque());
	}

}
