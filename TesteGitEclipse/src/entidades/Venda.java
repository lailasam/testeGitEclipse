package entidades;

import java.time.LocalDateTime;

public class Venda {
private LocalDateTime data;
private String atendente;
public LocalDateTime getData() {
	return this.data;
}
public void setData(LocalDateTime data) {
	this.data=data;
}
public String getAtendente() {
	return this.atendente;
}
public void setAtendente(String atendente) {
	this.atendente=atendente;
}
public void adicionarItem(ItemVenda item) {
	item=new ItemVenda();
}
public double calcularTotal() {
	return
}
public void listarItensVenda() {
	System.out.printf("Data da venda: %LocalDate\nCliente: %",data);
}
}
