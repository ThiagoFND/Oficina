package com.br.thiago.software.oficina.entities;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "tipo")
public class DadosCadastro {

	private String nome;
	private String email;
	private String cargo;
	private long numero1;
	private long numero2;
	private String usuario;
	private String senha;
	private String dataContratacao;
	private double salario;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public DadosCadastro() {

	}

	public DadosCadastro(String nome, String email, String cargo, long numero1, long numero2, String usuario,
			String senha, String dataContratacao, double salario) {
		super();
		this.nome = nome;
		this.email = email;
		this.cargo = cargo;
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.usuario = usuario;
		this.senha = senha;
		this.id = id;
		this.dataContratacao = dataContratacao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public long getNumero1() {
		return numero1;
	}

	public void setNumero1(long numero1) {
		this.numero1 = numero1;
	}

	public long getNumero2() {
		return numero2;
	}

	public void setNumero2(long numero2) {
		this.numero2 = numero2;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
