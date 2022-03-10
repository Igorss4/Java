package Colecoes;

public class EstoqueBack {

	private String item;
	private int quantidade;
	
	

	public EstoqueBack(String i, int q) {
		this.item=i;
		this.quantidade=q;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return "\nItem: "+this.item+", "+this.quantidade+" em estoque.";
	}
}
