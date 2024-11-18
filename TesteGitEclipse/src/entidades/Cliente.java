package entidades;

import java.time.LocalDate;

public class Cliente {
private String cpf;
private String nome;
private LocalDate dataNascimento;
public String getCpf() {
	return this.cpf;
}
public void setCpf(String cpf) {
	this.cpf=cpf;
}
public String getNome() {
	return this.nome;
}
public void setNome(String nome) {
	this.nome=nome;
}
public LocalDate getDataNascimento() {
	return this.dataNascimento;
}
public void setDataNascimento(LocalDate dataNascimento) {
	this.dataNascimento=dataNascimento;
}
public int calcularIdade() {
	
}
}
