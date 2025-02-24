package br.sp.senai.jandira.clinica;

import java.time.LocalDate;

import br.sp.senai.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
	
		Paciente p1 = new Paciente();
		System.out.println(p1);
		
		Paciente p2 = new Paciente();
		System.out.println(p2);
		
		p1.setNome("Ana Maria");
		p1.setPeso(68);
		p1.setAltura(1.65);
		p1.setGenero("m");
		p1.setTelefone("119999999");
		p1.setDataNascimento(LocalDate.of(2001,02,28));
		
		p2.setNome("Zé da manga");
		p2.setPeso(85);
		p2.setAltura(1.80);
		p2.setGenero("ç");
		p2.setTelefone("1199999999999");
		p2.setDataNascimento(LocalDate.of(2002, 01, 28));
		
		
		
		p1.exibirDados();
		p2.exibirDados();
	
		System.out.println(p1.getNome().length());
		System.out.println(p1.getNome().toUpperCase());
		System.out.println(p1.getGenero());
		System.out.println(p2.getGenero());
		System.out.println(p1.getTelefone());
		System.out.println(p2.getTelefone());
		System.out.println(p1.getDataNascimento());
		System.out.println(p2.getDataNascimento());
		
	}

}
