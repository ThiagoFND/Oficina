package com.br.thiago.software.oficina.entities;

import jakarta.persistence.Entity;

@Entity
public class CEO extends DadosCadastro {

	private boolean autorizaCEO;

	public CEO() {

	}

	public CEO(String nome, String email, String cargo, long numero1, long numero2, String usuario, String senha, String dataContratacao, double salario,
			boolean autorizaCEO) {
		super(nome, email, cargo, numero1, numero2, usuario, senha, dataContratacao, salario);
		this.autorizaCEO = autorizaCEO;
	}

	public boolean isAutorizaCEO() {
		return autorizaCEO;
	}

	public void setAutorizaCEO(boolean autorizaCEO) {
		this.autorizaCEO = autorizaCEO;
	}

}
