package com.fiap.heranca;

public class Teste {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setAlimentar("Todo animal se alimenta");
		animal.setLocomover("Todo animal se locomove");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimentar("Cachorro come ração de cachorro");
		cachorro.setLocomover("Cachorro usa 4 patas");
		cachorro.setLatido("Cachorro faz Au Au");
		
		Animal poodle = new Cachorro();
		poodle.setAlimentar("Poodle come ração de cachorro");
		poodle.setLocomover("Poodle usa 4 patas");
		poodle.setLatido("Poodle late");
		
	}
}
