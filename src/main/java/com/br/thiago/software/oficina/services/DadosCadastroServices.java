package com.br.thiago.software.oficina.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.thiago.software.oficina.entities.CEO;
import com.br.thiago.software.oficina.entities.DadosCadastro;
import com.br.thiago.software.oficina.entities.Funcionarios;
import com.br.thiago.software.oficina.repositories.DadosCadastroRepository;

@Service
public class DadosCadastroServices {

	@Autowired
	DadosCadastroRepository DCRepositories;

	// esse método adiciona os funcionários a tabela no banco de dados
	public void adicionarFuncionarios(String nome, String email, String cargo, long numero1, long numero2,
			String usuario, String senha, String dataContratacao, double salario, boolean autorizaFuncionario) {
		Funcionarios m1 = new Funcionarios(senha, email, cargo, numero1, numero2, usuario, senha, dataContratacao,
				salario, autorizaFuncionario);
		DCRepositories.save(m1);
	}

	// esse método adiciona o CEO a tabela no banco de dados
	public void adicionarCEO(String nome, String email, String cargo, long numero1, long numero2, String usuario,
			String senha, String dataContratacao, double salario, boolean autorizaCEO) {
		CEO m2 = new CEO(nome, email, cargo, numero1, numero2, usuario, senha, dataContratacao, salario, autorizaCEO);
		DCRepositories.save(m2);
	}

	// Esse método valida se quem está logando é o CEO por meio de um for e condições
	public CEO validarCEO(String usuario, String senha) {
		for (DadosCadastro validarCEO : DCRepositories.findAll()) {
			if (validarCEO.getUsuario().equals(usuario) && validarCEO.getSenha().equals(senha)) {
				if (validarCEO instanceof CEO) {
					CEO ceo = (CEO) validarCEO;
					if (ceo.isAutorizaCEO()) {
						return ceo;
					} else {
						System.out.println("Usuário CEO não autorizado");
						return null;
					}
				} else {
					System.out.println("Usuário não é um CEO");
					return null;
				}
			}
		}
		System.out.println("Usuário ou senha incorretos");
		return null;
	}

	// Esse método valida se quem está logando é o Gerente por meio de um for e condições
	public Funcionarios validarGerente(String usuario, String senha) {
		for (DadosCadastro validarGerente : DCRepositories.findAll()) {
			if (validarGerente.getUsuario().equals(usuario) && validarGerente.getSenha().equals(senha)
					&& validarGerente.getCargo().equals("Gerente")) {
				if (validarGerente instanceof Funcionarios) {
					Funcionarios funcionarioGerente = (Funcionarios) validarGerente;
					if (funcionarioGerente.isAutorizaFuncionario()) {
						return funcionarioGerente;
					} else {

					}
				} else {

				}
			} else {
			}
		}
		return null;
	}

	// Esse método valida se quem está logando é o recepecionista por meio de um for e condições
	public Funcionarios validarRecepcionista(String usuario, String senha) {
		for (DadosCadastro validarRepecionista : DCRepositories.findAll()) {
			if (validarRepecionista.getUsuario().equals(usuario) && validarRepecionista.getSenha().equals(senha)
					&& validarRepecionista.getCargo().equals("Recepcionista")) {
				if (validarRepecionista instanceof Funcionarios) {
					Funcionarios funcionarioRecepcionista = (Funcionarios) validarRepecionista;
					if (funcionarioRecepcionista.isAutorizaFuncionario()) {
						return funcionarioRecepcionista;
					} else {

					}
				} else {

				}
			} else {

			}
		}
		return null;
	}

	// Esse método valida se quem está logando é o mecanico por meio de um for e condições
	public Funcionarios validarMecanico(String usuario, String senha) {
		for (DadosCadastro validarMecanico : DCRepositories.findAll()) {
			if (validarMecanico.getUsuario().equals(usuario) && validarMecanico.getSenha().equals(senha)
					&& validarMecanico.getCargo().equals("Mecanico")) {
				if (validarMecanico instanceof Funcionarios) {
					Funcionarios funcionarioMecanico = (Funcionarios) validarMecanico;
					if (funcionarioMecanico.isAutorizaFuncionario()) {
						return funcionarioMecanico;
					} else {

					}
				} else {

				}
			} else {

			}
		}
		return null;
	}

	// este método lista todos os dados dos funcionários
	public void listarFuncionarios() {
		for (DadosCadastro m1 : DCRepositories.findAll()) {
			System.out.println("\nId: " + m1.getId());
			System.out.println("Nome: " + m1.getNome());
			System.out.println("Email: " + m1.getEmail());
			System.out.println("Cargo: " + m1.getCargo());
			System.out.println("Número 1: " + m1.getNumero1());
			System.out.println("Número 2: " + m1.getNumero2());
			System.out.println("Data Contratado: " + m1.getDataContratacao());
			System.out.println("Salário: " +m1.getSalario());
		}
	}
	
	// esse método remove o funcionário
	public void removerFuncionario(long id) {
		DCRepositories.deleteById(id);
	}
	
}
