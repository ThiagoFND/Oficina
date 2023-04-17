package com.br.thiago.software.oficina.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.thiago.software.oficina.entities.VeiculosConsertados;
import com.br.thiago.software.oficina.entities.VeiculosConsertar;
import com.br.thiago.software.oficina.repositories.VeiculosConsertadosRepository;
import com.br.thiago.software.oficina.repositories.VeiculosConsertarRepository;

@Service
public class VeiculosConsertarServices {

	@Autowired
	VeiculosConsertarRepository VCRepositories;
	
	@Autowired
	VeiculosConsertadosRepository VCRTRepositories;
	
	// esse método adiciona o veículo a tabela no banco de dados
	public void addBancoVeiculo(String nomeCliente, String emailCliente, long numeroCliente1, long numeroCliente2,
			String nomeVeiculo, String modeloVeiculo, long anoVeiculo, String problemaRelatado) {
		VeiculosConsertar veiculos = new VeiculosConsertar(nomeCliente, emailCliente, numeroCliente1, numeroCliente2, nomeVeiculo, modeloVeiculo, anoVeiculo, problemaRelatado);
		VCRepositories.save(veiculos);
	}
	
	// esse método adiciona os veículos atendidos a outra tabela no banco de dados
	public void addBancoVeiculosAtendidos(String nomeCliente, String emailCliente, long numeroCliente1, long numeroCliente2,
			String nomeVeiculo, String modeloVeiculo, long anoVeiculo, String problemaRelatado, String problema,
			double valorConserto) {
		VeiculosConsertados veiculos = new VeiculosConsertados(nomeCliente, emailCliente, numeroCliente1, numeroCliente2, nomeVeiculo, modeloVeiculo, anoVeiculo, problemaRelatado, problema, valorConserto);
		VCRTRepositories.save(veiculos);
	}
	
	// esse método lista todos os dados necessários do cadastramento de veículos
	public void listarVeiculos() {
		for (VeiculosConsertar v1 : VCRepositories.findAll()) {
			System.out.println("\nId: " + v1.getId());
			System.out.println("Nome: " + v1.getNomeCliente());
			System.out.println("Email: " + v1.getEmailCliente());
			System.out.println("Número1: " + v1.getNumeroCliente1());
			System.out.println("Número2: " + v1.getNumeroCliente2());
			System.out.println("Nome Veículo: " + v1.getNomeVeiculo());
			System.out.println("Modelo Veículo: " + v1.getModeloVeiculo());
			System.out.println("Ano Veículo: " + v1.getAnoVeiculo());
			System.out.println("Problema relatado: " + v1.getProblemaRelatado());
		}
	}
	
	// esse método remove o veículo da tabela
	public void removerVeiculo(long id) {
		VCRepositories.deleteById(id);
	}
	
	// esse método lista todos os dados necessários dos veículos consertados
	public void listarVeiculosConsertados() {
		for (VeiculosConsertados v1 : VCRTRepositories.findAll()) {
			System.out.println("\nId: " + v1.getId());
			System.out.println("Nome: " + v1.getNomeCliente());
			System.out.println("Email: " + v1.getEmailCliente());
			System.out.println("Número1: " + v1.getNumeroCliente1());
			System.out.println("Número2: " + v1.getNumeroCliente2());
			System.out.println("Nome Veículo: " + v1.getNomeVeiculo());
			System.out.println("Modelo Veículo: " + v1.getModeloVeiculo());
			System.out.println("Ano Veículo: " + v1.getAnoVeiculo());
			System.out.println("Problema relatado: " + v1.getProblemaRelatado());
			System.out.println("Problema real: " + v1.getProblema());
			System.out.println("Valor Conserto: " + v1.getValorConserto());
		}
	}
	
	// esse método remove da tabela de veículos consertados algum veículo específico caso o CEO queira
	public void removerVeiculoConsertado(long id) {
		VCRTRepositories.deleteById(id);
	}
}
