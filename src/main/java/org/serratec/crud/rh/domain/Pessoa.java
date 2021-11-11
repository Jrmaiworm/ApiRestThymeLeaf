package org.serratec.crud.rh.domain;

import java.time.LocalDate;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name="Tabela_Pessoas")
public class Pessoa {

@Deprecated
protected Pessoa() {};

public Pessoa(String nome) {
	this.nome= nome;
}

@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Long id;



private String nome;


@DateTimeFormat(pattern="yyyy-MM-dd")

private LocalDate  dataNascimento;

@Override
public String toString() {
	return "Pessoa [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", email="
			+ email + ", telefone=" + telefone + "]";
}
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pessoa other = (Pessoa) obj;
	return Objects.equals(id, other.id);
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public LocalDate getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(LocalDate dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}


private String cpf;



private String email;



private String telefone;





}