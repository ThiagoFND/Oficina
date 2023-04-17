package com.br.thiago.software.oficina.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.thiago.software.oficina.entities.FuncionariosDemitidos;
import com.br.thiago.software.oficina.repositories.FuncionariosDemitidosRepository;

@Service
public class FuncionariosDemitidosServices {
	
	@Autowired
	FuncionariosDemitidosRepository FDRepositories;
	
	// esse método adiciona funcionários demitidos a uma tabela para guarda-los com todos os dados necessários
	public void adicionarFuncionariosDemitidos(String nome, String email, String cargo, long numero1, long numero2, String dataContratacao, double salario, String dataDemissao, double valorPago) {
		FuncionariosDemitidos m1 = new FuncionariosDemitidos(nome, email, cargo, numero1, numero2, dataContratacao,
				salario, dataDemissao, valorPago);
		FDRepositories.save(m1);
	}
	
}
