package DesafioBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	public String listarClientes() {
		String retorno="Contas no Banco " + nome +"\n";
		for (Conta c : contas) {			
			retorno += c.cliente.toString() + "\n";
		}
		return retorno;
	}
	public void adicionarConta(Conta c) {
		contas.add(c);
	}
	
	public String getNome() {
		return nome;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
