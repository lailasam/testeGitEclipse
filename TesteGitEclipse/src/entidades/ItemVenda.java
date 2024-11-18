package entidades;

public class ItemVenda {
private int quantidade;
public Produto p=new Produto();
public int getQuantidade() {
	return this.quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade=quantidade;
}
public double calcularTotal() {
	return this.quantidade*p.getPreco();
}
}
