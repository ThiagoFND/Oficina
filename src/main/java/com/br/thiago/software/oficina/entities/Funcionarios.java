package com.br.thiago.software.oficina.entities;

import jakarta.persistence.Entity;

@Entity
public class Funcionarios extends DadosCadastro {

	private boolean autorizaFuncionario;

	public Funcionarios() {

	}

	public Funcionarios(String nome, String email, String cargo, long numero1, long numero2, String usuario,
			String senha, String dataContratacao, double salario, boolean autorizaFuncionario) {
		super(nome, email, cargo, numero1, numero2, usuario, senha, dataContratacao, salario);
		this.autorizaFuncionario = autorizaFuncionario;
	}

	public boolean isAutorizaFuncionario() {
		return autorizaFuncionario;
	}

	public void setAutorizaFuncionario(boolean autorizaFuncionario) {
		this.autorizaFuncionario = autorizaFuncionario;
	}

}
