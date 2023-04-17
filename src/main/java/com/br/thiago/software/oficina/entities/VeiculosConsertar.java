package com.br.thiago.software.oficina.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VeiculosConsertar {

	private String nomeCliente;
	private String emailCliente;
	private long numeroCliente1;
	private long numeroCliente2;
	private String nomeVeiculo;
	private String modeloVeiculo;
	private long anoVeiculo;
	private String problemaRelatado;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public VeiculosConsertar() {

	}

	public VeiculosConsertar(String nomeCliente, String emailCliente, long numeroCliente1, long numeroCliente2,
			String nomeVeiculo, String modeloVeiculo, long anoVeiculo, String problemaRelatado) {
		super();
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.numeroCliente1 = numeroCliente1;
		this.numeroCliente2 = numeroCliente2;
		this.nomeVeiculo = nomeVeiculo;
		this.modeloVeiculo = modeloVeiculo;
		this.anoVeiculo = anoVeiculo;
		this.problemaRelatado = problemaRelatado;
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public long getNumeroCliente1() {
		return numeroCliente1;
	}

	public void setNumeroCliente1(long numeroCliente1) {
		this.numeroCliente1 = numeroCliente1;
	}

	public long getNumeroCliente2() {
		return numeroCliente2;
	}

	public void setNumeroCliente2(long numeroCliente2) {
		this.numeroCliente2 = numeroCliente2;
	}

	public String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public long getAnoVeiculo() {
		return anoVeiculo;
	}

	public void setAnoVeiculo(long anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	public String getProblemaRelatado() {
		return problemaRelatado;
	}

	public void setProblemaRelatado(String problemaRelatado) {
		this.problemaRelatado = problemaRelatado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
