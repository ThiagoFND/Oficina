package com.br.thiago.software.oficina.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FuncionariosDemitidos {

	private String nome;
	private String email;
	private String cargo;
	private long numero1;
	private long numero2;
	private String dataContratacao;
	private double salario;
	private String dataDemissao;
	private double valorPago;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	public FuncionariosDemitidos() {
		
	}

	public FuncionariosDemitidos(String nome, String email, String cargo, long numero1, long numero2, String dataContratacao, double salario, String dataDemissao, double valorPago) {
		super();
		this.nome = nome;
		this.email = email;
		this.cargo = cargo;
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.dataContratacao = dataContratacao;
		this.salario = salario;
		this.dataDemissao = dataDemissao;
		this.valorPago = valorPago;
		this.id = id;
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

	public String getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(String dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
