package br.sp.senai.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	private String nome;
	private double peso;
	private double altura;
	private String genero;
	private String telefone;
	private LocalDate dataNascimento;

	public void setNome(String nome) {
		if (nome.length() > 3) {
			this.nome = nome;
		} else {
			System.out.println("O nome deve conter mais do que 3 caracteres");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setPeso(double peso) {

		if (peso > 0) {
			// verdade
			this.peso = peso;
		} else {
			// falso
			System.out.println("O peso deve ser maior que ZERO!");
		}

	}

	public double getPeso() {
		return peso;
	}

	public void setAltura(double altura) {

		if (altura > 0.5) {
			// verdade
			this.altura = altura;
		} else {
			// falso
			System.out.println("A altura deve ser maior que 0,5m!");
		}

	}

	public double getAltura() {
		return altura;
	}

	public void setGenero(String genero) {
		if (genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f")) {
			this.genero = genero.toUpperCase();
		} else {
			System.out.println("O genero do(a) " + nome + " deverá ser completado apenas com \"M\" ou \"F\"");
		}

	}

	public String getGenero() {
		return genero;
	}

	public void setTelefone(String telefone) {
		if (telefone.length() >= 13) {
			this.telefone = telefone;
		} else {
			System.out.println("o valor " + telefone + " não está correto");
		}
	}

	public String getTelefone() {
		return telefone;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void marcarConsulta() {

	}

	public void calcularIdade() {

	}

	public void calcularImc() {

		double imc = peso / (altura * altura);

	}

	public void classificarImc() {

	}

	public void exibirDados() {
		String unidadePeso = "Kg.";
		String unidadeAltura = "m";
		System.out.println("------------------------------");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("==============================");
		System.out.println();
		System.out.printf("Peso: %s %s\n", peso, unidadePeso);
		System.out.println("==============================");
		System.out.println();
		System.out.printf("Altura:%s %s\n", altura, unidadeAltura);
		System.out.println("==============================");
		System.out.println();

	}

}
