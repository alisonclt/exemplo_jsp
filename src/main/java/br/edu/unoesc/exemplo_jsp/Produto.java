package br.edu.unoesc.exemplo_jsp;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {
	
	private String nome;
	private Integer quantidade;
	private BigDecimal valor;
	
	public Produto(String nome, Integer quantidade, BigDecimal valor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
}