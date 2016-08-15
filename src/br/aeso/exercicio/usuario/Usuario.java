package br.aeso.exercicio.usuario;

public class Usuario {
	private int codigo;
	private String Nome;
	private String email;
	public Usuario(int codigo, String nome, String email) {
		this.codigo = codigo;
		Nome = nome;
		this.email = email;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
