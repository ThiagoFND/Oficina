package com.br.thiago.software.oficina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.thiago.software.oficina.services.DadosCadastroServices;
import com.br.thiago.software.oficina.services.Exceptions;
import com.br.thiago.software.oficina.services.FuncionariosDemitidosServices;
import com.br.thiago.software.oficina.services.VeiculosConsertarServices;

/*
 *Este é um software para aplicação em uma empresa mecânica com a utilização de spring boot para ligação com o banco de dados.
 *Este software cadastra funcionários, lista funcionários, cadastra veículos, lista e remove veículos com todos os dados acrescentados
 *possivelmente ao alcance
 */
@SpringBootApplication
public class OficinaApplication implements CommandLineRunner {

	@Autowired
	DadosCadastroServices DCServices;

	@Autowired
	VeiculosConsertarServices VCServices;

	@Autowired
	FuncionariosDemitidosServices FDServices;

	public static void main(String[] args) {
		SpringApplication.run(OficinaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Exceptions exc1 = new Exceptions();

		int entrarWhile1 = 0;
		while (entrarWhile1 != 3) {
			System.out.println("[1] - Login \n[3] - Sair \nDigite: ");
			int digite = exc1.readWhole();
			if (digite == 1) {
				// login

				System.out.println("[1] - Gerente \n[2] - Recepcionista \n[3] - Mecanico \n[4] - CEO \nDigite: ");
				int digite5 = exc1.readWhole();

				if (digite5 == 1) {
					// logar como gerente

					System.out.println("Usuário: ");
					String usuario = exc1.read();
					System.out.println("Senha: ");
					String senha = exc1.read();

					DCServices.validarGerente(usuario, senha);

					if (DCServices.validarGerente(usuario, senha) != null) {
						System.out.println("Validação gerente efetuada com sucesso");

						int entrarWhile657 = 0;
						while (entrarWhile657 != 5) {
							System.out.println(
									"[1] - Listar funcionários \n[2] - Remover funcionário de sistema \n[3] - Listar carros para conserto \n[4] - Listar carros consertados \n[5] - Remover veículo de conserto \nDigite: ");
							int d7 = exc1.readWhole();

							if (d7 == 1) {
								// listar funcionários

								System.out.println("Listando funcionários");

								DCServices.listarFuncionarios();
							} else if (d7 == 2) {
								// remover funcionário

								System.out.println("Funcionários");

								DCServices.listarFuncionarios();

								System.out.println("Digite o id de qual funcionário deseja remoiver: \nDigite:");
								long id = exc1.readLong();

								DCServices.removerFuncionario(id);

								System.out.println("Ótimo agora passe os dados novamente: ");

								System.out.println("Nome: ");
								String nome = exc1.read();
								System.out.println("Email: ");
								String email = exc1.read();
								String cargo = "Gerente";
								System.out.println("Cargo: " + cargo);
								System.out.println("Numero1: ");
								long numero1 = exc1.readLong();
								System.out.println("Numero2: ");
								long numero2 = exc1.readLong();
								System.out.println("Dia: ");
								String dia = exc1.read();
								System.out.println("Mês: ");
								String mes = exc1.read();
								System.out.println("Ano: ");
								String ano = exc1.read();
								System.out.println("Salário");
								double salario = exc1.readDouble();
								System.out.println("Dia demissão: ");
								String dia1 = exc1.read();
								System.out.println("Mês demissão");
								String mes1 = exc1.read();
								System.out.println("Ano demissão");
								String ano1 = exc1.read();
								System.out.println("Valor pago: ");
								double valorPago = exc1.readDouble();

								String dataContratacao = dia + "/" + mes + "/" + ano;

								String dataDemissao = dia1 + "/" + mes1 + "/" + ano1;

								FDServices.adicionarFuncionariosDemitidos(nome, email, cargo, numero1, numero2,
										dataContratacao, salario, dataDemissao, valorPago);

							} else if (d7 == 3) {
								// listar carros para conserto

								System.out.println("Listando");

								VCServices.listarVeiculos();

							} else if (d7 == 4) {
								// listar carros para consertados

								System.out.println("Listando");

								VCServices.listarVeiculosConsertados();

							} else if (d7 == 5) {
								// remover veículo de conserto

								System.out.println("Listando veículos");

								VCServices.listarVeiculos();

								System.out.println("Digite o id para remover \nDigite:");
								long id = exc1.readLong();

								VCServices.removerVeiculo(id);

								System.out.println("Veículo removido com sucesso");

							} else if (d7 == 6) {
								// voltando
								System.out.println("Voltando");
								break;
							} else {
								System.out.println("Número inexistente");
							}
						}
					} else {
						System.out.println("Validação gerente error");
					}

				} else if (digite5 == 2) {
					// logar como recepcionista

					System.out.println("Usuário: ");
					String usuario = exc1.read();
					System.out.println("Senha: ");
					String senha = exc1.read();

					DCServices.validarRecepcionista(usuario, senha);

					if (DCServices.validarRecepcionista(usuario, senha) != null) {
						System.out.println("Validação recepcionista efetivada");

						int entrarWhile223 = 0;
						while (entrarWhile223 != 4) {
							System.out.println(
									"[1] - Cadastrar Veículo \n[2] - Listar Veículos para conserto \n[3] - Pegar resultado \n[4] - Sair \nDigite: ");
							int digite123 = exc1.readWhole();

							if (digite123 == 1) {
								// cadastrar veículo no sistema

								System.out.println("Nome Cliente: ");
								String nomeCliente = exc1.read();
								System.out.println("Email Cliente: ");
								String emailCliente = exc1.read();
								System.out.println("Numero1: ");
								long numeroCliente1 = exc1.readLong();
								System.out.println("Numero2: ");
								long numeroCliente2 = exc1.readLong();
								System.out.println("Nome Veículo: ");
								String nomeVeiculo = exc1.read();
								System.out.println("Modelo Veículo:");
								String modeloVeiculo = exc1.read();
								System.out.println("Ano Veículo: ");
								long anoVeiculo = exc1.readLong();
								System.out.println("Problema Relatado: ");
								String problemaRelatado = exc1.read();

								VCServices.addBancoVeiculo(nomeCliente, emailCliente, numeroCliente1, numeroCliente2,
										nomeVeiculo, modeloVeiculo, anoVeiculo, problemaRelatado);

								System.out.println("Veículo adicionado com sucesso");
							} else if (digite123 == 2) {
								// listar veículos

								System.out.println("Listando");

								VCServices.listarVeiculos();

							} else if (digite123 == 3) {
								// Pegar resultado de veículo

								System.out.println("Resultado: ");

								VCServices.listarVeiculosConsertados();

							} else if (digite123 == 4) {
								// sair
								System.out.println("Voltar");
								break;
							}
						}
					} else {
						System.out.println("Validação recepcionista error");
					}

				} else if (digite5 == 3) {
					// logar como mecanico

					System.out.println("Usuário: ");
					String usuario = exc1.read();
					System.out.println("Senha: ");
					String senha = exc1.read();

					DCServices.validarMecanico(usuario, senha);

					if (DCServices.validarMecanico(usuario, senha) != null) {
						System.out.println("Validação efetuada com sucesso");

						int entrarWhile1234 = 0;
						while (entrarWhile1234 != 3) {
							System.out.println(
									"[1] - Listar veículos para conserto \n[2] - Veículo consertado \n[3] - Sair \nDigite: ");
							int digite1423 = exc1.readWhole();

							if (digite1423 == 1) {
								// listar veículos

								VCServices.listarVeiculos();

							} else if (digite1423 == 2) {
								// consertar veículo

								System.out.println("Esses são os veículos para conserto");
								VCServices.listarVeiculos();

								System.out.println("digite o id do veículo consertado \nId: ");
								long id = exc1.readLong();

								VCServices.removerVeiculo(id);

								System.out.println("Preencha os dados abaixo: ");

								System.out.println("Nome Cliente: ");
								String nomeCliente = exc1.read();
								System.out.println("Email Cliente: ");
								String emailCliente = exc1.read();
								System.out.println("Numero1: ");
								long numeroCliente1 = exc1.readLong();
								System.out.println("Numero2: ");
								long numeroCliente2 = exc1.readLong();
								System.out.println("Nome Veículo: ");
								String nomeVeiculo = exc1.read();
								System.out.println("Modelo Veículo:");
								String modeloVeiculo = exc1.read();
								System.out.println("Ano Veículo: ");
								long anoVeiculo = exc1.readLong();
								System.out.println("Problema Relatado: ");
								String problemaRelatado = exc1.read();
								System.out.println("Problema: ");
								String problema = exc1.read();
								System.out.println("Valor: ");
								double valorConserto = exc1.readDouble();

								VCServices.addBancoVeiculosAtendidos(nomeCliente, emailCliente, numeroCliente1,
										numeroCliente2, nomeVeiculo, modeloVeiculo, anoVeiculo, problemaRelatado,
										problema, valorConserto);

							} else if (digite1423 == 3) {
								// saindo
								System.out.println("saindo");
								break;
							} else {
								System.out.println("Número inexistente");
							}
						}
					} else {
						System.out.println("Validação mecanico error");
					}

				} else if (digite5 == 4) {
					// login com CEO

					System.out.println("Usuário: ");
					String usuario = exc1.read();
					System.out.println("Senha: ");
					String senha = exc1.read();

					DCServices.validarCEO(usuario, senha);

					if (DCServices.validarCEO(usuario, senha) != null) {
						System.out.println("Validação CEO efetivada com sucesso");

						int entrarWhile10 = 0;
						// faltar completar o CEO
						while (entrarWhile10 != 4) {
							System.out.println(
									"[1] - Cadastre Funcionário \n[2] - Remova Funcionário \n[3] - Liste funcionários \n[4] - Liste carros Consertos \n[5] - Cadastre carros para conserto \n[6] - Liste carros no conserto \n[7] - Remova carros do conserto \n[8] - remova carros consertados \nDigite: ");
							int d100 = exc1.readWhole();

							if (d100 == 1) {
								// cadastrar funcionário

								System.out.println(
										"[1] - Cadastrar Gerente \n[2] - Cadastrar Recepcionista \n[3] - Cadastrar Mecânico \nDigite: ");
								int d1000 = exc1.readWhole();

								if (d1000 == 1) {
									// cadastrar gerente

									System.out.println("Nome: ");
									String nome = exc1.read();
									System.out.println("Email: ");
									String email = exc1.read();
									String cargo = "Gerente";
									System.out.println("Cargo: " + cargo);
									System.out.println("Numero1: ");
									long numero1 = exc1.readLong();
									System.out.println("Numero2: ");
									long numero2 = exc1.readLong();
									System.out.println("Usuario: ");
									String usuario1 = exc1.read();
									System.out.println("Senha: ");
									String senha1 = exc1.read();
									System.out.println("Dia: ");
									String dia = exc1.read();
									System.out.println("Mês: ");
									String mes = exc1.read();
									System.out.println("Ano: ");
									String ano = exc1.read();
									System.out.println("Salário");
									double salario = exc1.readDouble();

									String dataContratacao = dia + "/" + mes + "/" + ano;

									DCServices.adicionarFuncionarios(nome, email, cargo, numero1, numero2, usuario1,
											senha1, dataContratacao, salario, true);

								} else if (d1000 == 2) {
									// cadastrar recepcionista

									System.out.println("Nome: ");
									String nome = exc1.read();
									System.out.println("Email: ");
									String email = exc1.read();
									String cargo = "Recepcionista";
									System.out.println("Cargo: " + cargo);
									System.out.println("Numero1: ");
									long numero1 = exc1.readLong();
									System.out.println("Numero2: ");
									long numero2 = exc1.readLong();
									System.out.println("Usuario: ");
									String usuario1 = exc1.read();
									System.out.println("Senha: ");
									String senha1 = exc1.read();
									System.out.println("Dia: ");
									String dia = exc1.read();
									System.out.println("Mês: ");
									String mes = exc1.read();
									System.out.println("Ano: ");
									String ano = exc1.read();
									System.out.println("salário: ");
									double salario = exc1.readDouble();

									String dataContratacao = dia + "/" + mes + "/" + ano;

									DCServices.adicionarFuncionarios(nome, email, cargo, numero1, numero2, usuario1,
											senha1, dataContratacao, salario, true);

								} else if (d1000 == 3) {
									// cadastrar mecânico

									System.out.println("Nome: ");
									String nome = exc1.read();
									System.out.println("Email: ");
									String email = exc1.read();
									String cargo = "Mecanico";
									System.out.println("Cargo: " + cargo);
									System.out.println("Numero1: ");
									long numero1 = exc1.readLong();
									System.out.println("Numero2: ");
									long numero2 = exc1.readLong();
									System.out.println("Usuario: ");
									String usuario1 = exc1.read();
									System.out.println("Senha: ");
									String senha1 = exc1.read();
									System.out.println("Dia: ");
									String dia = exc1.read();
									System.out.println("Mês: ");
									String mes = exc1.read();
									System.out.println("Ano: ");
									String ano = exc1.read();
									System.out.println("salário: ");
									double salario = exc1.readDouble();

									String dataContratacao = dia + "/" + mes + "/" + ano;

									DCServices.adicionarFuncionarios(nome, email, cargo, numero1, numero2, usuario1,
											senha1, dataContratacao, salario, true);
								} else {
									System.out.println("Número inexistente");
								}
							} else if (d100 == 2) {
								// Remova Funcionário

								System.out.println("Funcionários");

								DCServices.listarFuncionarios();

								System.out.println("Digite o id de qual funcionário deseja remoiver: \nDigite:");
								long id = exc1.readLong();

								DCServices.removerFuncionario(id);

								System.out.println("Ótimo agora passe os dados novamente: ");

								System.out.println("Nome: ");
								String nome = exc1.read();
								System.out.println("Email: ");
								String email = exc1.read();
								String cargo = "Gerente";
								System.out.println("Cargo: " + cargo);
								System.out.println("Numero1: ");
								long numero1 = exc1.readLong();
								System.out.println("Numero2: ");
								long numero2 = exc1.readLong();
								System.out.println("Dia: ");
								String dia = exc1.read();
								System.out.println("Mês: ");
								String mes = exc1.read();
								System.out.println("Ano: ");
								String ano = exc1.read();
								System.out.println("Salário");
								double salario = exc1.readDouble();
								System.out.println("Dia demissão: ");
								String dia1 = exc1.read();
								System.out.println("Mês demissão");
								String mes1 = exc1.read();
								System.out.println("Ano demissão");
								String ano1 = exc1.read();
								System.out.println("Valor pago: ");
								double valorPago = exc1.readDouble();

								String dataContratacao = dia + "/" + mes + "/" + ano;

								String dataDemissao = dia1 + "/" + mes1 + "/" + ano1;

								FDServices.adicionarFuncionariosDemitidos(nome, email, cargo, numero1, numero2,
										dataContratacao, salario, dataDemissao, valorPago);

							} else if (d100 == 3) {
								// Liste funcionários
								
								System.out.println("Listando funcionários");

								DCServices.listarFuncionarios();
							} else if (d100 == 4) {
								// Liste carros Consertos
								
								System.out.println("Carros: ");
								
								VCServices.listarVeiculos();
							} else if (d100 == 5) {
								// Cadastre carros para conserto
								
								System.out.println("Nome Cliente: ");
								String nomeCliente = exc1.read();
								System.out.println("Email Cliente: ");
								String emailCliente = exc1.read();
								System.out.println("Numero1: ");
								long numeroCliente1 = exc1.readLong();
								System.out.println("Numero2: ");
								long numeroCliente2 = exc1.readLong();
								System.out.println("Nome Veículo: ");
								String nomeVeiculo = exc1.read();
								System.out.println("Modelo Veículo:");
								String modeloVeiculo = exc1.read();
								System.out.println("Ano Veículo: ");
								long anoVeiculo = exc1.readLong();
								System.out.println("Problema Relatado: ");
								String problemaRelatado = exc1.read();

								VCServices.addBancoVeiculo(nomeCliente, emailCliente, numeroCliente1, numeroCliente2,
										nomeVeiculo, modeloVeiculo, anoVeiculo, problemaRelatado);

								System.out.println("Veículo adicionado com sucesso");
							} else if (d100 == 6) {
								// Liste carros no consertados
								
								System.out.println("Listando");
								
								VCServices.listarVeiculosConsertados();
							} else if (d100 == 7) {
								// Remova carros no conserto
								
								System.out.println("Id: ");
								long id = exc1.readLong();
								
								VCServices.removerVeiculo(id);
							} else if (d100 == 8) {
								// remova carros consertados
								
								System.out.println("Id: ");
								long id = exc1.readLong();
								
								VCServices.removerVeiculoConsertado(id);
							}
							else {
								System.out.println("Número inexistente");
							}
						}
					} else {
						System.out.println("Validação CEO error");
					}

				} else {
					System.out.println("Número inexistente");
				}
			} else if (digite == 3) {
				System.out.println("Saindo");
				break;
			} else {
				System.out.println("Número inexistente");
			}
		}
	}
}