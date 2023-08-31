package com.fiap.heranca;
/* Classe herança usa extends quando isso é acionado no inicio da classe, automaticamente a mesma herda
 * as caracteristicas da classe pai, neste exemplo ela vai herdar se alimentar e e se locomover*/
public class Cachorro extends Animal {
	private String latido;

	
	public String getLatido() {
		return latido;
	}
	
	
	public void setLatido(String latido) {
		this.latido = latido;
	}
}
